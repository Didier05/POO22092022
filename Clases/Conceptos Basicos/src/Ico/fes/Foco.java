/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ico.fes;

/**
 *
 * @author Marely Medina
 */
public class Foco {
    private String color;
    private String tipo;
    private int tamano;

    public Foco() {
    }

    public Foco(String colo, String tipo, int tamano) {
        this.color = colo;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColo() {
        return color;
    }

    public void setColo(String colo) {
        this.color = colo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "colo=" + color + ", tipo=" + tipo + ", tamano=" + tamano + '}';
    }
    
    
}
