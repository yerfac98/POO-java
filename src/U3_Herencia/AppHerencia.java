/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia;

/**
 *
 * @author Gerardo Fac
 */
public class AppHerencia {
    
    public static void main(String[] args) {
        Profesor p1 = new Profesor("carlos", 26);
        Estudiante e1 = new Estudiante("Francisca",18);
        
        p1.setSalario(17000);
        System.out.println("datos del profesor:");
        System.out.println("nombre:"+ p1.getNombre());
        System.out.println("edad: "+p1.getEdad());
        System.out.println("salario: "+p1.getSalario());
        
    }
    
   
}

    