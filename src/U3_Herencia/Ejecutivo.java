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
public class Ejecutivo extends empleado {
    private int presupuesto;
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
        
    }
    
    @Override
    public String toString(){
        String msg=super.toString();
        msg= msg + "presupuesto"+ presupuesto;
        return msg;
    }
}
