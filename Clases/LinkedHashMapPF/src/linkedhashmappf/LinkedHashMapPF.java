/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashmappf;
import java.util.*;
/**
 *
 * @author Marely Medina
 */
public class LinkedHashMapPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    LinkedHashMap <Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Rick y Morty");
        lhm.put(12, "Inside Job");
        lhm.put(123, "Lucifer");
        lhm.put(1234, "Ultraman");
        lhm.put(12345, "Power Ranger");
        lhm.remove(123);
        System.out.println("Imprimiendo el linked hash map");
        for(Map.Entry<Integer, String> ite : lhm.entrySet()){
            System.out.println(ite.getKey()+", "+ite.getValue());
        }
    }
    
}
