/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Marely Medina
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\t\tTarea Cuentahabiente \n");
         Cuentahabiente[] Cliente = new Cuentahabiente[5];
          Cliente [0] = new Cuentahabiente("319163061", "Juan Carlos",15000);
         Cliente [1] = new Cuentahabiente("254876985", "Brean Hérnandez",49000);
          Cliente [2] = new Cuentahabiente("387564921", "Ashley Danae",5420);
          Cliente [3] = new Cuentahabiente("309063061", "Erika Medina",70000);
         Cliente [4] = new Cuentahabiente("459761003", "Jorge Salcedo",175000);
         //Cliente 0
         System.out.println(Cliente[0]);
         Cliente[0].retirarDinero(200);
             //Cliente 3
         System.out.println(Cliente[3]);
         Cliente[3].retirarDinero(2500);
          //Cliente 4
         System.out.println(Cliente[4]);
         Cliente[4].retirarDinero(75000.9f);
                
         for (Cuentahabiente cuentahabiente : Cliente) {
             System.out.println( cuentahabiente.evaluarNivelCliente());
            
        }
    }
    
    
}
