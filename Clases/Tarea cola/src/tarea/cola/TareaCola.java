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
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueNodo<Integer> nodeQueue = new QueueNodo<>();
        System.out.println("QueueNode");
        System.out.println("isEmpty: " + nodeQueue.isEmpty());
        System.out.println("enqueue(1)");
        nodeQueue.enqueue(1);
        System.out.println("enqueue(2)");
        nodeQueue.enqueue(2);
        System.out.println("enqueue(3)");
        nodeQueue.enqueue(3);
        System.out.println(nodeQueue);
        System.out.println("length: " + nodeQueue.length());
        System.out.println("isEmpty: " + nodeQueue.isEmpty());
        System.out.println("front: " + nodeQueue.front());
        System.out.println("dequeue: " + nodeQueue.dequeue());
        System.out.println("dequeue: " + nodeQueue.dequeue());
        System.out.println("dequeue: " + nodeQueue.dequeue());
        System.out.println("isEmpty: " + nodeQueue.isEmpty());

        QueueArr<Integer> arrayQueue = new QueueArr<>(5);
        System.out.println("QueueArray");
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
        System.out.println("enqueue(1)");
        arrayQueue.enqueue(1);
        System.out.println("enqueue(2)");
        arrayQueue.enqueue(2);
        System.out.println("enqueue(3)");
        arrayQueue.enqueue(3);
        System.out.println(arrayQueue);
        System.out.println("length: " + arrayQueue.length());
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
        System.out.println("front: " + arrayQueue.font());
        System.out.println("dequeue: " + arrayQueue.dequeue());
        System.out.println("dequeue: " + arrayQueue.dequeue());
        System.out.println("dequeue: " + arrayQueue.dequeue());
        System.out.println("isEmpty: " + arrayQueue.isEmpty());
    }
    
}
