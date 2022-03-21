/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Productor {
    private String Nombre;
    private int Edad;

    public Productor() {
    }

    public Productor(String Nombre, int añosCarre) {
        this.Nombre = Nombre;
        this.Edad = añosCarre;
    }

    public int getAñosCarre() {
        return Edad;
    }

    public void setAñosCarre(int añosCarre) {
        this.Edad = añosCarre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "Nombre=" + Nombre + ", a\u00f1osCarre=" + Edad + '}';
    }
    
    public void Organizar(){
        System.out.println(this.Nombre+" se esta organizando con todos los camrarografos para poder grabar toda la pelicula ");
    }
    
    public void Selecciona(){
        System.out.println(this.Nombre+" esta seleccionando a todas las personas que trabajar en la pelicula");
    }
    
}
