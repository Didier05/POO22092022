/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasico2209;

/**
 *
 * @author Marely Medina
 */
public class Arbol {
    private float Altura;
    private int Edad;
    public static final int Tronco=1;

    public Arbol() {
    }

    public Arbol(float Altura, int Edad) {
        this.Altura = Altura;
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Arbol{" + "Altura=" + Altura + ", Edad=" + Edad + '}';
    }
    
    public void crecer(float crecimiento){
        System.out.println("Altura actual = "+this.Altura);
        this.Altura+=crecimiento;
        System.out.println("Altura posterior = "+this.Altura);
    }
    
    public static void  generarOxigeno(){
        System.out.println("Generando oxigeno...");
    }
    
    
}
