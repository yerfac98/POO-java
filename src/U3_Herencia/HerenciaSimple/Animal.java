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
public class Animal {

    /**
     * @return the patas
     */
    private int patas;
    private int ojos;

    //constructor
    public Animal(int patas, int ojos) {
        this.patas = patas;
        this.ojos = ojos;
    }

    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }

    /**
     * @return the ojos
     */
    public int getOjos() {
        return ojos;
    }

    /**
     * @param ojos the ojos to set
     */
    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public String habla() {
        return "Soy un animal";

    }

}//llave del cierre de la clase
