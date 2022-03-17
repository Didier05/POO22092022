/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacióncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author Marely Medina
 */
public class ReutilizaciónCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String("José José ");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3));
        System.out.println(nombre.toUpperCase());
        //fin de ejemplos con String
        
        //*JFrame ventana = new JFrame("Mi primer ventana Java");
        //ventana.setSize(600, 400);
        //ventana.setVisible(true);
        //*
          
        
        Computadora miCompu= new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println( miCompu );
        
        //ejercicio establecer un mouse marca Logitech de tipo optico
        
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println( miCompu );
        
        Computadora compu2=new Computadora("Apple", "MacBook Proo",
                new Monitor("Toshiba", 14.3f),
                new Mouse("Acteck", "optico"),
                new Teclado("Apple", 101),
                new Procesador("M1", 3.4f));
        
        System.out.println(compu2);
         // mouse apple y tipo touch
        compu2.setRaton(new Mouse("Apple", "touch"));
        System.out.println(compu2);
        
        System.out.println("-------------");
        System.out.println(" ");
        
        Alumno alu1= new Alumno();
        alu1.setNombre("Jose");
        System.out.println(alu1);
        
        
        Alumno alu2= new Alumno("12354897  ",  "ICO ", "Jose Perez ", 19);
        System.out.println(alu2);
                
    }
    
}
