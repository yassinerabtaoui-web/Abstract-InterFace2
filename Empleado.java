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
abstract class Empleado implements PorPagar {

    String nombre;
    String Apellidos;
    int segsocial;

    Empleado(String nombre, String apellidos, int segsocial) {
        this.nombre=nombre;
        this.Apellidos=apellidos;
        this.segsocial=segsocial;
    }
}

class EmpleadoAsalariado extends Empleado{
    double salariofijo;
    public EmpleadoAsalariado(String nombre, String apellidos, int segsocial, double salariofijo) {
        super(nombre, apellidos, segsocial);
        this.salariofijo=salariofijo;
    }

    @Override
    public int Deudas() {
        return (int) salariofijo; 
    }
    
    

}
class EmpleadoArreglo extends Empleado{
    double salario;
    public EmpleadoArreglo(String nombre, String apellidos, int segsocial, double salario) {
        super(nombre, apellidos, segsocial);
        this.salario=salario;
    }
 @Override
    public int Deudas() {
        return (int) salario; 
    }
}
