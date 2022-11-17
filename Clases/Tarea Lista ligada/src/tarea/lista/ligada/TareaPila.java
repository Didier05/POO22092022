/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.lista.ligada;

/**
 *
 * @author Marely Medina
 */
public class TareaPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Pila<Integer> pila= new Pila<>();
        System.out.println("Stack using nodes");
        System.out.println("isEmpty(): " + pila.isEmpty());
        System.out.println("length(): " + pila.length());
        System.out.println("push(1)");
        nodeStack.push(1);
        System.out.println("push(2)");
        nodeStack.push(2);
        System.out.println("push(3)");
        nodeStack.push(3);
        System.out.println(nodeStack);
        System.out.println("peek(): " + listaLigada.peek());
        System.out.println("pop(): " + listaLigada.pop());
        System.out.println(nodeStack);

        StackArray<Integer> arrayStack = new StackArray<>(5);
        System.out.println("Stack using Array");
        System.out.println("isEmpty(): " + arrayStack.isEmpty());
        System.out.println("length(): " + arrayStack.length());
        System.out.println("push(1)");
        arrayStack.push(1);
        System.out.println("push(2)");
        arrayStack.push(2);
        System.out.println("push(3)");
        arrayStack.push(3);
        System.out.println("push(4)");
        arrayStack.push(4);
        System.out.println("push(5)");
        arrayStack.push(5);
        System.out.println("isFull(): " + arrayStack.isFull());
        System.out.println(arrayStack);
        System.out.println("peek(): " + arrayStack.peek());
        System.out.println("pop(): " + arrayStack.pop());
        System.out.println(arrayStack);
    }

    private static class StackNode<T> {

        public StackNode() {
        }
    }
    
}
