/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

/**
 *
 * @author Marely Medina
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.HashMap <Integer, String> HM = new java.util.HashMap<>();
        HM.put(10, "Didier");
        HM.put(100, "Carlos");
        HM.put(1000, "Ashley");
        HM.put(10000, "Jorge");
        HM.put(100000, "Bryan");  
        HM.isEmpty();
        HM.replace(100, "Erika");
        HM.containsValue("LeBron James");
        System.out.println("******imprimiendo el hash map*******");
        System.out.println(HM.values());
        System.out.println(HM.keySet());
    }
    
}
