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
public class Gato extends Animal{
    //constructor de la clase
    public Gato(int patas, int ojos){
        super(patas,ojos);
        
    }
    //herencia con reemplazo de metodos
    public String habla(){
        return "Soy un gato";
        
    }
}
