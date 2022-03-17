/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author Marely Medina
 */
public class Persona {
    private String nombre;
    private int edaad;

    public Persona() {
    }

    public Persona(String nombre, int edaad) {
        this.nombre = nombre;
        this.edaad = edaad;
    }

    public int getEdaad() {
        return edaad;
    }

    public void setEdaad(int edaad) {
        this.edaad = edaad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + " Nombre= " + nombre + ", Edaad= " + edaad + '}';
    }
    
    public void dormir(){
        System.out.println(this.nombre + "esta durmiendo ... Zzz");
    }
    
}
