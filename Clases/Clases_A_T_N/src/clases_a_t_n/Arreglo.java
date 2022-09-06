/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_a_t_n;

/**
 *
 * @author Marely Medina
 */
public class Arreglo<T> {
    
    private int tamanio;
    private Object arr[];
  
    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
        this.arr = new Object[tamanio];
    }
    
    public int getLongitud() {
       System.out.println(this.tamanio);
        return 0;
    }

    public void setElemento(int indice, T valor) {
        this.arr[indice] = valor;
    }
    
    public Object getElemento(int indice) {
        return this.arr[indice];
    }
    
    public void limpiar(T valor){
        for(int i = 0; i < tamanio; i++) {
            this.arr[i] = valor;
        }
    }

    
    public String toString(){
        return this.arr.toString();
    }
    
}
