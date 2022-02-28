/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.libro;
import java.awt.Color;


/**
 *
 * @author Marely Medina
 */
public class ProyectoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Libro lib1 = new Libro();
  
    Libro Baldor;
    System.out.println("");
   lib1.setTitulo("Algebra ");
        System.out.println("Titulo: "+lib1.getTitulo());
   lib1.setAutor("Baldor ");
        System.out.println("Autor: "+ lib1.getAutor());
   lib1.setColor(Color.yellow);
        System.out.println("Color: "+lib1.getColor());
   lib1.setLargo(300);
        System.out.println("Largo: "+lib1.getLargo()+" hojas");
   lib1.setEditorial("Porrua ");
        System.out.println("Editorial: "+lib1.getEditorial());
   lib1.setIdioma("Frances ");
        System.out.println("Idioma: "+lib1.getIdioma());
   System.out.println("         Acciones:");
   lib1.sostener();
   lib1.leer();
   lib1.resolver();
   System.out.println("");
   
   Libro lib2 = new Libro();
   Libro Floresenelatico;
        System.out.println("");
   lib2.setTitulo("flores en el atico ");
    System.out.println("Titulo: "+lib2.getTitulo());
   lib2.setAutor("V.C. Andrews ");
        System.out.println("Autor: "+ lib2.getAutor());
   lib2.setColor(Color.BLUE);
        System.out.println("Color: "+lib2.getColor());
   lib2.setLargo(270);
        System.out.println("Largo: "+lib2.getLargo()+" hojas");
   lib2.setEditorial("Debolsillo ");
        System.out.println("Editorial: "+lib2.getEditorial());
   lib2.setIdioma("Español ");
        System.out.println("Idioma: "+lib2.getIdioma());
   System.out.println("         Acciones:");
   lib2.sostener();
   lib2.Imaginar();
   lib2.suspenso();
   
   
    }
            
}
