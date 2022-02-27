/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.libro;

/**
 *
 * @author Marely Medina
 */
public class Libro {
    
    private String color;
    private String titulo;
    private int Largo;
    private String idioma;
    private String Autor;
    private String editorial;

    public Libro() {
    }

    public Libro(String color, String titulo, int Largo, String idioma, String Autor, String editorial) {
        this.color = color;
        this.titulo = titulo;
        this.Largo = Largo;
        this.idioma = idioma;
        this.Autor = Autor;
        this.editorial = editorial;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

   public void titulo(){ 
       System.out.println("titulo:  "+ this.titulo+"primera edicion");}
   public void idioma(){
       System.out.println("idioma:  "+this.idioma+"espero que te guste ");}
   
   public void largo(){
       System.out.println("largo:  "+this.Largo+" tamaño oficial");}

    

  
       
    
}
