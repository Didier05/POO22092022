/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesFinales;

import ClasesparaComposicion.Actor;
import ClasesparaComposicion.Director;
import ClasesparaComposicion.Productora;

/**
 *
 * @author Marely Medina
 */
public class ClasePelicula {
    
    private String Nombre;
    private int Duracion;
    private Actor Actor;
    private Productora casaProductora;
    private Director Director;

    public ClasePelicula() {
    }

    public ClasePelicula(String Nombre, int Duracion, Actor Actor, Productora casaProductora, Director Director) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
        this.Actor = Actor;
        this.casaProductora = casaProductora;
        this.Director = Director;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public Actor getActor() {
        return Actor;
    }

    public void setActor(Actor Actor) {
        this.Actor = Actor;
    }

    public Productora getCasaProductora() {
        return casaProductora;
    }

    public void setCasaProductora(Productora casaProductora) {
        this.casaProductora = casaProductora;
    }

    public Director getDirector() {
        return Director;
    }

    public void setDirector(Director Director) {
        this.Director = Director;
    }

    @Override
    public String toString() {
        /*
        return "ClasePelicula{" + "Nombre=" + Nombre + ", Duracion=" + Duracion + ", Actor=" + Actor + ", casaProductora=" + casaProductora + ", Director=" + Director + '}';
    */
        String estado = "Nombe: " +this.Nombre + "\n";
    estado = estado  + "Duración: " + this.Duracion +" horas\n";
    estado = estado +"Actor: "+ this.Actor.getNombre() + "\t" + "Edad: "+ this.getActor().getEdad()+" años de edad\n";
     estado = estado  + "Director:  Nombre: " + this.Director.getNombre()  + "\t" +"Tiempo de carrera: "+ this.getDirector().getAñosCarrera()+" años\n"; 
     estado= estado +"Casa productora:  Nombre: " + this. casaProductora.getNombre()+ "\t"+ "Logotipo: " + this.casaProductora.getLogotipo() ;
            return estado;
    }

        
    public void Recomendar(){
        System.out.println("La pelicula "+ this.Nombre + " es tan buena pelicula que dicidiste recomendarla");
    }
   
    public void Entretener(){
        System.out.println("Para pasar un día en familia todos decidieron ver  "+ this.Nombre +" con el proposotivo de entretenerse y disfrutar la compañia ");
    }
   

    
    
}
