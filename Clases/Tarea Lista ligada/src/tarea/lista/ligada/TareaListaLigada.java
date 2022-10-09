/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.lista.ligada;

/**
 *
 * @author Marely Medina
 */
public class TareaListaLigada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaLigada<Integer> listaLigada = new ListaLigada<>();
        System.out.println(listaLigada);
        
        System.out.println("La Lista esta vacia?:\t "+ listaLigada.estaVacio());
        
        System.out.println("Su tamaño es:\t "+ listaLigada.tamanio);
        
        System.out.println("Agregamos al inicio el valor 18");
        listaLigada.agregarAlInicio(18);
        System.out.println(listaLigada);
        System.out.println("Agregamos al inicio el valor 50");
        listaLigada.agregarAlInicio(50);
        System.out.println(listaLigada);
        System.out.println("Agregamos al inicio el valor 10");
        listaLigada.agregarAlInicio(10);
        System.out.println(listaLigada);
        System.out.println("Agregamos al inicio el valor 2");
        listaLigada.agregarAlInicio(2);
        System.out.println(listaLigada); 
        
        System.out.println("**********");        
        
        System.out.println("Agregamos al final el valor 15");
        listaLigada.agragarAlFInal(15);
        System.out.println(listaLigada);
        System.out.println("Agregamos al final el valor 75");
        listaLigada.agragarAlFInal(75);
        System.out.println(listaLigada);
        System.out.println("Agregamos al final el valor 3");
        listaLigada.agragarAlFInal(3);
        System.out.println(listaLigada);
        
        System.out.println("**********");  
        
        System.out.println("Agregamos al final el valor 20 despues de 10");
        listaLigada.agragarDespuesDe(10, 20);
        System.out.println(listaLigada);
        System.out.println("Agregamos al final el valor 12 despues de 75");
        listaLigada.agragarDespuesDe(75, 12);
        System.out.println(listaLigada);
        System.out.println("Agregamos al final el valor 1 despues de 12");
        listaLigada.agragarDespuesDe(12, 1);
        System.out.println(listaLigada);
        
        System.out.println("**********");  
        
        System.out.println("Eliminaremos el valor de la posicion 4");
        listaLigada.EliminarPorPosicion(4);
        System.out.println(listaLigada);
        
        System.out.println("Eliminaremos al principio");
        listaLigada.EliminarPrimero();
        System.out.println(listaLigada);
        
        System.out.println("Elimiaremos al final");
        listaLigada.EliminarUltimo();
        System.out.println(listaLigada);
        
        System.out.println("**********"); 
        
        System.out.println("Busca el valor 12");
        System.out.println("Esta en la posición: "+ listaLigada.Buscar(12));
        
        System.out.println("**********"); 
        
        System.out.println("Actualizaremos el valor 75 por el 99");
        listaLigada.Actualizar(75, 99);
        System.out.println(listaLigada);
        
        
        
        
        
        
        
    }
    
}
