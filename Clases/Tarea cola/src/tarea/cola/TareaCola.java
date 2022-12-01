/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.cola;

/**
 *
 * @author Marely Medina
 */
public class TareaCola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        QueueNodo<Integer> nodo1 = new QueueNodo<>();
        System.out.println("QueueNode");
        System.out.println("isEmpty: " + nodo1.isEmpty());
        System.out.println("enqueue(1)");
        nodo1.enqueue(1);
        System.out.println("enqueue(2)");
        nodo1.enqueue(2);
        System.out.println("enqueue(3)");
        nodo1.enqueue(3);
        System.out.println(nodo1);
        System.out.println("length: " + nodo1.length());
        System.out.println("isEmpty: " + nodo1.isEmpty());
        System.out.println("front: " + nodo1.front());
        System.out.println("dequeue: " + nodo1.dequeue());
        System.out.println("dequeue: " + nodo1.dequeue());
        System.out.println("dequeue: " + nodo1.dequeue());
        System.out.println("isEmpty: " + nodo1.isEmpty());

        QueueArr<Integer> arrqueue = new QueueArr<>(5);
        System.out.println("QueueArray");
        System.out.println("isEmpty: " + arrqueue.isEmpty());
        System.out.println("enqueue(1)");
        arrqueue.enqueue(1);
        System.out.println("enqueue(2)");
        arrqueue.enqueue(2);
        System.out.println("enqueue(3)");
        arrqueue.enqueue(3);
        System.out.println(arrqueue);
        System.out.println("length: " + arrqueue.length());
        System.out.println("isEmpty: " + arrqueue.isEmpty());
        System.out.println("front: " + arrqueue.font());
        System.out.println("dequeue: " + arrqueue.dequeue());
        System.out.println("dequeue: " + arrqueue.dequeue());
        System.out.println("dequeue: " + arrqueue.dequeue());
        System.out.println("isEmpty: " + arrqueue.isEmpty());
    }
    
}
