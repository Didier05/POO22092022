/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila.adt;
import java.util.Arrays;
/**
 *
 * @author Marely Medina
 */
public class pila<T> {
    
    private T[] stack;
    private int top;

    public pila(int size) {
        stack = (T[]) new Object[size];
        top = -1;
    }

    public boolean empty() {
        return top < 0;
    }

    public boolean full() {
        return !(top+1 < stack.length);
    }

    public void push(T valueToAdd) {
        if(!full()) {
            top++;
            stack[top] = valueToAdd;
        }
    }

    public void pop() {
        if(!empty()) {
            top--;
        }
    }

    public T top() {
        if(empty()) {
            return null;
        }
        return stack[top];
    }

    @Override
    public String toString() {
        String result = "[ ";
        for(int i = top; i >= 0; i--) {
            result += stack[i] + " ";
        }
        result += "]";
        return result;
    }
    
    
}
