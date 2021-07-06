/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U4_Polimorfismo_Clases_Abstractas;

/**
 *
 * @author Gerardo Fac
 */
public class Niño extends Habitante {

    public Niño(String nombre) {
        super(nombre);
    }

    @Override
    public String habla() {
        return "El jiren es mas fuerte que goku";
    }

}
