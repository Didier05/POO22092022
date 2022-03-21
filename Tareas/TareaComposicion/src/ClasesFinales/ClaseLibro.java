/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesFinales;

import ClasesparaComposicion.Autor;
import ClasesparaComposicion.Editorial;

/**
 *
 * @author Marely Medina
 */
public class ClaseLibro {// clase 
    
    private String Nombre;   //Atributos
    private int numeroPaginas;
    private Autor Autor;
    private Editorial Editorial;

    public ClaseLibro() { //metodo constructor 
    }

    public ClaseLibro(String Nombre, int numeroPaginas, Autor Autor, Editorial Editorial) {
        this.Nombre = Nombre;
        this.numeroPaginas = numeroPaginas;
        this.Autor = Autor;
        this.Editorial = Editorial;
    }

    
    // metodo de uso genral
    public Editorial getEditorial() {
        return Editorial;
    }

    public void setEditorial(Editorial Editorial) {
        this.Editorial = Editorial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
    /*    
   return "ClaseLibro{" +"\n"+ "Nombre= " + Nombre + "\n"+" Número de páginas= " +  numeroPaginas + "páguinas \n" + " Autor= " + Autor  +"\n" + " Editorial= " + Editorial +"\n" +'}';
    }*/
        String estado = "Nombe: " +this.Nombre + "\n";
    estado = estado  + "Número de páginas: " + this.numeroPaginas +" páginas\n";
     estado = estado  + "Autor:  Nombre: " + this.Autor.getNombre()  + "\t" +"Edad: "+ this.getAutor().getEdad()+" años \n"; 
     estado= estado +"Editorial:  Nombre: " + this.Editorial.getNombre() + "\t"+ "Telefono de contacto: " + this.getEditorial().getTelefonoContacto() ;
            return estado;
            }
    
            public void Resolver(){
                System.out.println("\t"+this.Nombre +" podria resolverse en una semana máximo");
            }
            public void  Leer(){
                System.out.println("\t"+this.Nombre+" es un libro interesante de leer");
            }
}
    
    
    
    
            
    
