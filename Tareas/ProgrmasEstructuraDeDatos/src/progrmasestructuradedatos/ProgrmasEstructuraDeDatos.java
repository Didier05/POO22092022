/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progrmasestructuradedatos;

import java.util.ArrayList;

/**
 *
 * @author Marely Medina
 */
public class ProgrmasEstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo<Integer> arr = new Arreglo<>(5);
        arr.getLongitud();
        arr.setElemento(1, 4);
        arr.setElemento(2, 7);
        arr.setElemento(0, 5);
        arr.setElemento(3, 9);
        arr.getLongitud();
        arr.toString();
        arr.limpiar(null);
              
                
                
        
        
        
       /* 
        Trabajador trabajadores[]= new Trabajador[25];
        Trabajador t1 = new Trabajador(25, "Pepe", 2025);
        
      
                
        Trabajador t2 = new Trabajador(36, "Marisol", 3200);
        Trabajador t3 = new Trabajador(21, "Juan", 1824);
        Trabajador t4 = new Trabajador(25, "Pepe", 2025);
        Trabajador t5 = new Trabajador(25, "Pepe", 2025);
        
        
        
        
        for (int i = 0; i < arr.length; i++) {
            Trabajador trabajador = arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("El tamaño del arreglo es: "+ arr.length);

       
        
        
        
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        arreglo.add(1);
        arreglo.add(11);
        arreglo.add(5);
        arreglo.add(7);
        arreglo.add(1, 9);
        System.out.println("Tamaño del arreglo: "+ arreglo.size());
        System.out.println("Elemneto en la posicion 3 "+ arreglo.get(3));
                for (Integer elemento : arreglo) {
                    System.out.println(elemento);
                }
                
       */
               
    }
    
}
