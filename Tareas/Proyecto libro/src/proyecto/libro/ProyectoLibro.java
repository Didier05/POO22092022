/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.libro;



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
  
   lib1.setAutor("Baldor ");
   lib1.setColor("Amarillo con rojo ");
   lib1.setLargo(100);
   lib1.setEditorial("Porrua ");
   lib1.setTitulo("Matematicas ");
   lib1.setIdioma("Frances ");
   
   lib1.idioma();
   lib1.titulo();
   lib1.largo();
    }
            
}
