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
public class Empleado_App {
 
         public static void main(String[] args) {
        Comercial obj = new Comercial("Gerardo", "Facundo ", 15,200, 550);
        
             System.out.println("Empleado 1");
             System.out.println("Nombre: " + obj.getNombre());
                      System.out.println("Apellido: " + obj.getApellido());
                      System.out.println("Edad: "+obj.getEdad());
                      obj.plus(200);
                      System.out.println(obj.getSalario());
            
          
                      
         }          
        }
