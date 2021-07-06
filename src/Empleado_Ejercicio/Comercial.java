/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado_Ejercicio;

/**
 *
 * @author Gerardo Fac
 */
public class Comercial extends Empleado {

    private double comision;


    public Comercial(String nombre, String apellido, int edad, double salario,double comision) {
        super(nombre, apellido, edad, salario);
        this.comision=comision; 
    }

    @Override
    public boolean plus(double Sueldoplus) {
boolean aumento = true;
        if (comision < 100) {
            salario += Sueldoplus;

            System.out.println("Tu sueldo ha aumentado, ahora cuentas con el sueldo plus... ");
            System.out.println("Aumento: " + aumento);
            return aumento == true;
        } else {
            System.err.println("Lo sentimos, el sueldo no ah aumentado...");
            return aumento == false;
        }
    }

}
