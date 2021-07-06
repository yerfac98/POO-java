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
public class Profesor extends Persona {
    
    protected float salario;
    
    public Profesor(String nombre, int edad) {
        super(nombre, edad); //llena constructor de la
    }
    
    ////metodos de la clase profesor
    public void setSalario (float salario){
    this.salario = salario;
    }
    
    public float getSalario(){
    return salario;
    }
}