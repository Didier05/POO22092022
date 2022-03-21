/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesparaComposicion;

/**
 *
 * @author Marely Medina
 */
public class Editorial {
    private String Nombre;
    private String telefonoContacto;

    public Editorial() {
    }

    public Editorial(String Nombre, String telefonoContacto) {
        this.Nombre = Nombre;
        this.telefonoContacto = telefonoContacto;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Nombre=" + Nombre + ", telefonoContacto=" + telefonoContacto + '}';
    }
    
   public void Publicar() {
            System.out.println("\t"+this.getNombre()+ " acaba de publicar un nuevo libro del autor");
   }
   
   public void Distribuir(){
       System.out.println("\t"+this.getNombre()+" comenzara a distribuir nuevas ediciones de este libro \n\tPara más información llama al: "+ this.getTelefonoContacto());
   }
    
}
