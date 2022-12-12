/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treemap;

/**
 *
 * @author Marely Medina
 */
public class TreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.TreeMap <Integer, String> tm = new java.util.TreeMap<>();
        tm.put(1, "Le imperatrice");
        tm.put(2, "Bandalos Chinos");
        tm.put(3, "La Garfield");
        tm.put(4, "Marchi");
        tm.put(5, "Surfistas del Sistema");
        tm.headMap(3);
        System.out.println("*******imprimiendo el tree map********");
        tm.values().forEach(System.out::println);
    }
    
}
