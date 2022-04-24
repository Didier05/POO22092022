/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaejemplo;

/**
 *
 * @author Marely Medina
 */
public class Cuentahabiente {
        private String idCliente;
    private String Cliente;
    private int Balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(String idCliente, String Cliente, int Balance) {
        this.idCliente = idCliente;
        this.Cliente = Cliente;
        this.Balance = Balance;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public String toString() {
        return "Cuentahabiente \n" + "idCliente= " + idCliente +"\n"+ "Cliente= " + Cliente +"\n"+ "Balance= " + Balance + '}';
    }
    
    public void retirarDinero( float Monto ){
            System.out.println("\tBalance: "+ Balance + "\n\tMonto: "+ Monto+ "\n\tNuevo Balance: "+ (Balance-Monto)+"\n");
}
    public String evaluarNivelCliente(){
         return  this.Balance<= 50000f? "Cliente Regular": "Cliente Premium ";
            /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
                1.- “Cliente Regular” si es menor o igual a 50 mil.
                2.- “Cliente Premium” si es mayor a 50 mil*/
}
}
