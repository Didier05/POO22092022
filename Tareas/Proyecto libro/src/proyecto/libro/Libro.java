/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.libro;

import java.awt.Color;

/**
 *
 * @author Marely Medina
 */
public class Libro {
    
    private Color color;
    private String titulo;
    private int Largo;
    private String idioma;
    private String Autor;
    private String editorial;

    public Libro() {
    }

    public Libro(Color color, String titulo, int Largo, String idioma, String Autor, String editorial) {
        this.color = color;
        this.titulo = titulo;
        this.Largo = Largo;
        this.idioma = idioma;
        this.Autor = Autor;
        this.editorial = editorial;
    }

  
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
  
    
  public void sostener(){
       System.out.println("Tienes en tus manos el libro "+this.titulo+"de "+this.Autor );
  }
   public void leer(){
       System.out.println("Estas leyend el libro de"+this.titulo);
   }
   public void resolver(){
       System.out.println("Resuelves el libro de "+this.Autor);
   }
   public void Imaginar(){
       System.out.println("Imaginas la situacion de "+ this.titulo);
   }
   public void suspenso(){
       System.out.println("Sientes suspenso por la trama de "+ this.titulo);   
   }
   

  
       
    
}
