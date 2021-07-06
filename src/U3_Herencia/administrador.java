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
public class administrador extends empleado{ 
    
    private String departamento;
    public String nombre;
    
    public administrador(String nombre,double salario,String departamento){
       // super(nombre ,salario);
        this.departamento=departamento;
        
    }
    public administrador(String nombre, String departamento){
       // super(nombre);
        this.departamento=departamento;
    }
    // este codigo falla dado que no llama a super
    public administrador(String departamento){
        this.departamento=departamento;
    }
}
