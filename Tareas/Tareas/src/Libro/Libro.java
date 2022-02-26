/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author Marely Medina
 */
public class Libro {
    private String color;
    private int ancho;
    private int alto;
    private String Contenido;
    private String Autor;
    private String idioma;
    private String tema;

    public Libro() {
    }

    public Libro(String color, int ancho, int alto, String Contenido, String Autor, String idioma, String tema) {
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
        this.Contenido = Contenido;
        this.Autor = Autor;
        this.idioma = idioma;
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Libro{" + "color=" + color + ", ancho=" + ancho + ", alto=" + alto + ", Contenido=" + Contenido + ", Autor=" + Autor + ", idioma=" + idioma + ", tema=" + tema + '}';
    }
    
    
    
}
