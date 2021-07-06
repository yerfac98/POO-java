/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia.HerenciaSimple.HerenciaMultiple;

/**
 *
 * @author Gerardo Fac
 */
public class Medico extends Cirujano implements PuedeCurar,PuedeConsultar,PuedeRecetar {


    @Override
    public void curar() {
        System.out.println("El medico cirujano puede operar");
        
        
    }

    @Override
    public void consultar() {
        
        System.out.println("El medico cirujano puede operar");
    }

    @Override
    public void recetar() {
    System.out.println("EL MEDICO CIRUJANO PUEDE RECETAR");
    
}
}