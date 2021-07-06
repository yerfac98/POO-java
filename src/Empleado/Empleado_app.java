/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Gerardo Fac
 */
public class Empleado_app {
    
    public static void main(String[] args) {
        
        System.out.println("Empleado 1");
        Comercial obj = new Comercial("Gerardo", "Fac", 22,50);
        
             System.out.println("Nombre: "+obj.getNombre());
             System.out.println("Apellido: "+obj.getApellido());
             System.out.println("Edad: "+obj.getEdad());
             System.out.println("Sueldo: "+obj.plus(152.25));
            
             /**
             System.out.println("");
             System.out.println("Empleado 2");
             Comercial obj1 = new Comercial("Gerardo", "Fac", 22,150);
             System.out.println("Nombre: "+obj1.getNombre());
             System.out.println("Apellido: "+obj1.getApellido());
             System.out.println("Edad: "+obj1.getEdad());
             System.out.println("Sueldo: "+obj1.plus(150));
             */
    }
}