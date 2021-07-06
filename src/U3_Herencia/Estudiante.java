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
public class Estudiante extends Persona {
    private char grupo;
    
    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }
   
    public void setGrupo(char grupo){
    this.grupo = grupo;
    }
    
    public char getGrupo(char grupo){
    return grupo;
    }
            
}
