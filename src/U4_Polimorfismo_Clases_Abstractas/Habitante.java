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
public abstract class Habitante {

    protected String nombre;

    public Habitante(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo abstracto
    public abstract String habla();

}
