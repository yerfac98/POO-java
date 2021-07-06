/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_ClasesObjetos;

/**
 *
 * @author Gerardo Fac
 */
public class Empleado {
    private float sueldo=950F;
    private float sueldoDepto[]={35F,50F,75F,25F};
    
    /**
     * Metodos para obttener el sueldo de un emp,eado
     */
    public float getSueldo(){
        return sueldo;
        
    }
    public float getSueldo(int horas){
        return sueldo*horas;
    }
    public float getSueldo(int horas, int departamento){
        float sueldoDepartamento=0;
        
        switch(departamento){
            case 1:
                sueldoDepartamento=sueldoDepto[0];
                break;
           
            case 2:
                sueldoDepartamento=sueldoDepto[1];
                break;
            case 3:
                sueldoDepartamento=sueldoDepto[2];
                break;
                
            default:
                
                sueldoDepartamento=sueldoDepto[3];
                break;
        }
    return sueldoDepartamento*horas;
    
}

    public static void main(String[] args) {
        Empleado obj=new Empleado();
        /**
         * LLama los metodos sobreargados de la clase empleado
         * para obtner el sueldo semanal de un empleado
         */
        
        
        
        System.out.println("El sueldo de este individuo es 1: "+obj.getSueldo());
        System.out.println("El sueldo de este individuo es 2: "+obj.getSueldo(40));
        System.out.println("El sueldo de este individuo es 3: "+obj.getSueldo(50,1));
        System.out.println("El sueldo de este individuo es 4: "+obj.getSueldo(35,2));
        System.out.println("El sueldo de este individuo es 5: "+obj.getSueldo(55,3));
        System.out.println("El sueldo de este individuo es 6: "+obj.getSueldo(40,0));
    }
}