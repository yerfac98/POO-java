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
public class Persona {
    private String nombre;
    protected int edad;
    //otros atributos
    
    //constructor
    public Persona (String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    }
    
    //metodos de la clase persona
    public void setNombre(){
    this.nombre =nombre;
    }
    public String getNombre (){
    return nombre;
    }
    
    public void setEdad(){
    this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    
    }
}
