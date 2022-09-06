/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_a_t_n;

/**
 *
 * @author Marely Medina
 */
public class Trabajador {
    private int numeroTrabajador;
    private String Nombre;
    private String Materno;
    private String Paterno;
    private int horasExtra;
    private double sueldoBase;
    private double Antiguedad;

    public Trabajador() {
    }

    public Trabajador(int numeroTrabajador, String Nombre, String Materno, String Paterno, int horasExtra, double sueldoBase, double Antiguedad) {
        this.numeroTrabajador = numeroTrabajador;
        this.Nombre = Nombre;
        this.Materno = Materno;
        this.Paterno = Paterno;
        this.horasExtra = horasExtra;
        this.sueldoBase = sueldoBase;
        this.Antiguedad = Antiguedad;
    }

    public double getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(double Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public static final double Monto_H_Extra = 276.5;
    public static final double Prestacion_Antiguedad =0.03;
    
    
    @Override
    public String toString(){
      String  D="Nombre: " + this.Nombre + "Paterno: " +this.Paterno
            + "Materno: " + this.Materno;
     
        
    return "Numero Trabajador: "+ this.numeroTrabajador + D + "Horas Extra: "+ this.horasExtra
            + "Sueldo Base: "+ this.sueldoBase+"Antiguedad: "+ this.Antiguedad;
    }
    
    public double calcularSueldo(){
    double total=0.0;
    total = sueldoBase + (Monto_H_Extra*horasExtra);
    return total;
    
    }
    
}
