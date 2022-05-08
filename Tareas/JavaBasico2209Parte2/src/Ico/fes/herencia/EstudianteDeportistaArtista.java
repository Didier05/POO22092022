/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes.herencia;

/**
 *
 * @author Marely Medina
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista, Artista{
    
    private String Carrera;
    private String numeroCuenta;
    private String diciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String Carrera, String numeroCuenta, String diciplinaDeportiva, String generoArtistico) {
        this.Carrera = Carrera;
        this.numeroCuenta = numeroCuenta;
        this.diciplinaDeportiva = diciplinaDeportiva;
        this.generoArtistico = generoArtistico;
    }

    public String getGeneroArtistico() {
        return generoArtistico;
    }

    public void setGeneroArtistico(String generoArtistico) {
        this.generoArtistico = generoArtistico;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getDiciplinaDeportiva() {
        return diciplinaDeportiva;
    }

    public void setDiciplinaDeportiva(String diciplinaDeportiva) {
        this.diciplinaDeportiva = diciplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "Carrera=" + Carrera + ", numeroCuenta=" + numeroCuenta + ", diciplinaDeportiva=" + diciplinaDeportiva + ", generoArtistico=" + generoArtistico + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.Nombre + " esta entrenando "+ this.diciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.Nombre+ " esta jugando "+ this.diciplinaDeportiva);
    }

    @Override
    public void ensayar() {
         System.out.println(this.Nombre+ " esta ensayando/practicando "+ this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.Nombre+ " esta presentando su obra de  "+ this.generoArtistico);
    }
    
    
    
    
    
    
}
