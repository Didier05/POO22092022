/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Director {
    
    private String Nombre;
    private int añosCarrera;

    public Director() {
    }

    public Director(String Nombre, int añosCarrera) {
        this.Nombre = Nombre;
        this.añosCarrera = añosCarrera;
    }

    public int getAñosCarrera() {
        return añosCarrera;
    }

    public void setAñosCarrera(int añosCarrera) {
        this.añosCarrera = añosCarrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "Nombre=" + Nombre + ", a\u00f1osCarrera=" + añosCarrera + '}';
    }
    
     public void Dirigir(){
         System.out.println(this.Nombre+" comenzó a dirigir un nuevo proyecto que se estrenara el prosimo año");
     }
    
     public void Transmitir(){
         System.out.println(this.Nombre+" transmite los conceptos que quiere ver en pantalla a los equipos de vestuario, maquillaje, fotografía, efectos visuales y sonido");
     }
}
