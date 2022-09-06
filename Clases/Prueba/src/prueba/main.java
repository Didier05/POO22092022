/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import java.io.IOException;

/**
 *
 * @author Marely Medina
 */
public class main {

    public static void main(String[] args) throws IOException {
        nomina nomina = new nomina("junio.dat", "Estructura de datos S.A. de C.V.");
        nomina.calcularSueldo();
        System.out.println("-----------------------------------------------------");
        nomina.obtenerMaxMin();
    }
}
