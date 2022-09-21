/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaconjuntos;

/**
 *
 * @author Marely Medina
 */
public class TareaConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conjunto<Integer> Ca = new Conjunto();
        Conjunto<Integer> Cb= new Conjunto();

        Ca.add(7);
        Ca.add(1);
        Ca.add(8);
        Ca.add(9);
        Ca.add(5);
        Ca.add(0);
        Ca.add(12);
        Ca.add(4);
        Ca.add(2);
        Ca.add(11);
        
        Cb.add(1);
        Cb.add(11);
        Cb.add(5);
        Cb.add(2);
        Cb.add(7);
        Cb.add(0);

      
        System.out.println("La longitud de Ca es:\t" + Ca.length());
        System.out.println("La longitud de Cb es:\t" + Cb.length());
        System.out.println("");
        
        System.out.println("Conjuntos");
        System.out.println("Ca:\t"+Ca);
        System.out.println("Cb:\t"+Cb);
        System.out.println("");
                

       
        System.out.println("Ca contiene 1 \t" + Ca.contains(1));
        System.out.println("Ca contiene 3 \t" + Ca.contains(3));
        System.out.println("Cb contiene 4 \t" + Cb.contains(4));
        System.out.println("Cb contiene 11 \t" + Cb.contains(11));
        System.out.println("");

        // Eliminar
        Ca.remove(7);

        // Método igual
        System.out.println("Ca igual a Cb :\t" + Ca.equals(Cb));

        //Método Subconjunto
        System.out.println("Cb es subconjunto de Ca:\t" + Cb.isSubset(Ca));
        System.out.println("");

        // método de intersección
        Conjunto<Integer> conjunto_intersection = Ca.intersection(Cb);
        System.out.println("interseccion entre Ca y Cb:\t" + conjunto_intersection);

        // Metodo de Diferencia
        Conjunto<Integer> conjunto_difference = Ca.difference(Cb);
        System.out.println("diferencia entre Ca y Cb:\t" + conjunto_difference);
        System.out.println("");

        // Metodo de Union 
        Ca.union(Cb);
        System.out.println("Ca U Cb " + Ca); 
        
    }
    
}
