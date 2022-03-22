/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Productora {
    private String Nombre;
    private String Logotipo;

    public Productora() {
    }

    public Productora(String Nombre, String Logotipo) {
        this.Nombre = Nombre;
        this.Logotipo = Logotipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getLogotipo() {
        return Logotipo;
    }

    public void setLogotipo(String Logotipo) {
        this.Logotipo = Logotipo;
    }

    @Override
    public String toString() {
        return "Productora{" + "Nombre=" + Nombre + ", Logotipo=" + Logotipo + '}';
    }

     public void Cotizar(){
        System.out.println(this.Nombre+" esta cotizando el gasto total que conllevara realizar la pelicula");
    }
    
    public void Selecciona(){
        System.out.println(this.Nombre+" esta seleccionando a todas las personas que trabajar en la pelicula");
    } 
    
       
}
