/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia.HerenciaSimple;

/**
 *
 * @author Gerardo Fac
 */
public class Loro extends Animal{
    
    //constructor
    public Loro(int patas, int ojos) {
        super(patas, ojos);
    }
    
    
    public String habla(){
        return "Soy un loro y " + super.habla();
        
    }
}
