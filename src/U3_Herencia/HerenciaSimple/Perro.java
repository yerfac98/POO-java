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
public class Perro extends Animal {

    private boolean pulgas;
    public String habla;

    //costructor
    public Perro(boolean pulgas, int patas, int ojos) {
        super(patas, ojos);
        this.pulgas = pulgas;
        
        //variable de clase
    }
    public Perro(int patas, int ojos) {
        super(patas, ojos);
    }
    /**
     * @return the pulgas
     */
    public boolean getPulgas() {
        return pulgas;
    }

    /**
     * @param pulgas the pulgas to set
     */
    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public void cambiaPadre(){
        //this.ojos=5;//error
       setPatas(4);
       setOjos(2);
       
       
    }
    public String habla(){
        return "soy un perro";
    }
    }
   

