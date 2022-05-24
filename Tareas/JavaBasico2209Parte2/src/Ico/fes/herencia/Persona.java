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
    protected int Edad;

    public Persona() {
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
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
        return  Nombre +" , " +  Edad + " años";
    }
    
    public void comer(){
        System.out.println(Nombre+" esta comiendo ...");
    }
    
    
    
}
