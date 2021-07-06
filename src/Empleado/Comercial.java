/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Gerardo Fac
 */
public class Comercial extends Empleado {
    private double comision;
    boolean aumento;
  
    public Comercial(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad, salario);
    }

    @Override
    public boolean plus(double SueldoPlus) {
        if(salario<100){
			comision+=SueldoPlus;
			aumento=true;
			System.out.println("Tu sueldo ha aumentado, ahora cuentas con el sueldo plus... ");
			System.out.println("Aumento: "+salario);
		}else{
			System.err.println("Lo sentimos, el sueldo no ah aumentado...");
		}
        return aumento;
        
      
    
    }
   /**public double getComision() {
        boolean Res = comision==salario;
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
*/
}

