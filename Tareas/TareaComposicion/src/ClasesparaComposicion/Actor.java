/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Actor {
    private int Edad;
    private String Nombre;

    public Actor() {
    }

    public Actor(int Edad, String Nombre) {
        this.Edad = Edad;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Actor{" + "Edad=" + Edad + ", Nombre=" + Nombre + '}';
    }
    
    public void Prepararse(){
        System.out.println(this.Nombre+" se esta preparando para interpretar un nuevo papel");
    }
    
    public void Caracterizar(){
        System.out.println(this.Nombre+"Tiene que utilizar un vesturio verde para poder grabar sus ecenas ");
    }
    
    
    
}
