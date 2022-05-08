/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.herencia;

/**
 *
 * @author Marely Medina
 */
public class Persona {
    protected String Nombre;//protected
    protected String Edad;

    public Persona() {
    }

    public Persona(String Nombre, String Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + '}';
    }
    
    public void comer(){
        System.out.println(Nombre+" esta comiendo ...");
    }
    
    
    
}
