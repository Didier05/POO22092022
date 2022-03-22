/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import ClasesFinales.ClaseLibro;
import ClasesFinales.ClasePelicula;
import ClasesparaComposicion.Actor;
import ClasesparaComposicion.Autor;
import ClasesparaComposicion.Director;
import ClasesparaComposicion.Editorial;
import ClasesparaComposicion.Productora;

/**
 *
 * @author Marely Medina
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  
        System.out.println("Becerra Medina Carlos Didier  2209");
        
        System.out.println("\n\t****** Libro *******\n");
        System.out.println("\tLibro 1");
        ClaseLibro lib1=new ClaseLibro("Baldor", 100, 
                new Autor("Aurelio Baldor", 35),
                new Editorial("Porrua" , "55-57890684"));
        System.out.println(lib1);
        lib1.getEditorial().Distribuir();
        lib1.getAutor().Escribe(56);
        lib1.Resolver();
        
        
        System.out.println("\n");
        System.out.println("\tLibro 2");
        ClaseLibro lib2=new ClaseLibro();
        lib2.setNombre("Flores en el atico");
        lib2.setNumeroPaginas(250);
        lib2.setAutor(new Autor("Virginia Cleo Andrews ", 56));
        lib2.setEditorial(new Editorial("Debolsillo", "55-89741263"));
        System.out.println(lib2);
        lib2.getEditorial().Publicar();
        lib2.Leer();
        lib2.getAutor().Imaginar();
        
        System.out.println("\n\t****** Película *******");
        System.out.println("\tPelícula 1");
        ClasePelicula pel1=new ClasePelicula("Flaspoint", 190, 
                new Actor(29, "Ezra Miller"),
                new Productora("Metro-Goldwyn-Mayer", "León rugiendo"), 
                new Director("Andy Muschietti ", 15));
        System.out.println(pel1);
        pel1.Recomendar();
        pel1.getActor().Caracterizar();
        pel1.getCasaProductora().Selecciona();
        pel1.getDirector().Dirigir();
        
        
         System.out.println("\n");
        System.out.println("\tPelícula 2");
        ClasePelicula pel2=new ClasePelicula();
        pel2.setNombre("Batman");
        pel2.setDuracion(180);
        pel2.setActor(new Actor(35, "Robert Pattinson"));
        pel2.setCasaProductora(new Productora("DC Entertainment", "DC"));
        pel2.setDirector(new Director("Matt Reeves", 20));
        System.out.println(pel2);
        pel2.Entretener();
        pel2.getActor().Prepararse();
        pel2.getCasaProductora().Cotizar();
        pel2.getDirector().Transmitir();
                
        
        
    }
    
}
