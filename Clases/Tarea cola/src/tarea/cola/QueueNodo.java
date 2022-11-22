/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.cola;

/**
 *
 * @author Marely Medina
 */
public class QueueNodo<T> {
    
    private Nodo<T> front;
    private Nodo<T> back;
    private int length;

    public QueueNodo() {
        front = back = null;
        length = 0;
    }

    public boolean isEmpty() {
        return front == null && length == 0;
    }

    public int length() {
        return length;
    }

    public T dequeue() {
        if(isEmpty()) {
            return null;
        }

        if(front == back) {
            back = null;
        }

        T topValue = front.getData();
        front = front.getNext();
        length--;
        return topValue;
    }

    public T front() {
        if(isEmpty()) {
            return null;
        }

        return front.getData();
    }

    public void enqueue(T value) {
        Nodo<T> nuevoNodo = new Nodo<T>(value);
        if(isEmpty()) {
            front = back = nuevoNodo;
        } else {
            back.setNext(nuevoNodo);
            back = nuevoNodo;
        }
        length++;
    }

    @Override
    public String toString() {
        String stackString = "";
        Nodo<T> iNodo = front;
        while(iNodo!= null){
            stackString += iNodo;
            iNodo = iNodo.getNext();
        }
        return stackString;
    }
    
    
}
