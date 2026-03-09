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
public class Factura implements PorPagar {
int npieza;
int cantidad;
int precio;
String descripcion;
Factura( int npieza, int cantidad, int precio, String descripcion){
    this.npieza=npieza;
    this.cantidad=cantidad;
    this.precio=precio;
    this.descripcion=descripcion;
}
Factura( int npieza, int cantidad, int precio){
    this.npieza=npieza;
    this.cantidad=cantidad;
    this.precio=precio;
    this.descripcion="Sin descripción";
}

    @Override
    public int Deudas() {
        return precio*cantidad;
    }

}
