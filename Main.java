/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jerarquia2;

/**
 * @version 1.0
 * @mail yassine@gmail.com
 * @compay IESABASTOS
 * @author Yassine
 */
public class Main {

    public static void main(String[] args) {
        PorPagar[] objetosPorPagar = new PorPagar[4];
        objetosPorPagar[0] = new Factura(12, 560, 13, "Pieza1");
        objetosPorPagar[1] = new Factura(12, 560, 13);
        objetosPorPagar[2] = new EmpleadoAsalariado("Joshua", "James", 12312, 2400);
        objetosPorPagar[3] = new EmpleadoAsalariado("Yassine", "Rabtaoui", 8274, 1200);
        int deudas = 0;
        
        for (PorPagar p : objetosPorPagar) {
            if (p instanceof PorPagar) {
                deudas=deudas+p.Deudas();
            }
            
        }
        System.out.println("La empresa tiene que pagar " + deudas+" Euros");
    }
}
