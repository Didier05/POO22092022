/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.cola;

/**
 *
 * @author Marely Medina
 */
public class QueueArr<T> {
    private T[] queue;
    private int front, tail, length;

    public QueueArr(int tamanio) {
        queue = (T[]) new Object[tamanio];
        front = tail = -1;
        length = 0;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        T element = null;
        if(!isEmpty()) {
            element = queue[front];
            if (front == tail) {
                front = tail = -1;
            } else {
                front = move(front);
            }
        }
        return element;
    }

    public T font() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    public void enqueue(T element) throws Exception {
        if (!isFull()) {
            tail = move(tail);
            if (isEmpty()) {
                front++;
            }
            queue[tail] = element;
        }
        length++;
    }

    public boolean isFull() {
        return  move(tail) == front;
    }

    private int move(int number) {
        return (number + 1) % queue.length;
    }

    public String toString() {
        String result = "";
        if (!isEmpty()) {
            int aux = front;
            do {
                result += queue[aux] + " ";
                aux = move(aux);
            } while (aux != move(tail));
        } else {
            result += "null";
        }
        return result;
    }
    
}
