/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Autor {
    private String Nombre;
    private int Edad;

    public Autor() {
    }

    public Autor(String Nombre, int Edad) {
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
        return "Autor{ " + "Nombre= " + Nombre + ", Edad= " + Edad + " años " + "}";
    }
    
   public void Escribe( int cantidad) {
            System.out.println("\t"+this.getNombre()+ " estuvo escribiendo desde "  +  cantidad + " hrs");
   }
   
   public void Imaginar(){
       System.out.println("\t"+this.getNombre()+"imagina una nueva historia para su proximo libro");
   }
    
}
