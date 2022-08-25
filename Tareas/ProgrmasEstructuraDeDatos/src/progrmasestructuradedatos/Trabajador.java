/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progrmasestructuradedatos;

/**
 *
 * @author Marely Medina
 */
public class Trabajador {
int Edad;
String Nombre;
double Sueldo;

    public Trabajador() {
    }

    public Trabajador(int Ed, String Nom, double Sue) {
        this.Edad = Ed;
        this.Nombre = Nom;
        this.Sueldo = Sue;
    }


@Override 
public String toString()
{
return "Nombre: " +Nombre  + ", \t"+"Edad: " + Edad +",\t"+"Sueldo:  "+ Sueldo;

}
        






    
    
}
