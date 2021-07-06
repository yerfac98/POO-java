/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U5_Excepciones.ExcepcionesPropias;

/**
 *
 * @author manuel
 */
// Clase hija ExcepcionIntervalo que hereda miembros de Exception
// Y con esto nos permite crear excepciones propias
public class ExcepcionIntervalo extends Exception {

    // Contructor de la clase ExpcepcionIntervalo con un parámetro: mensajeError
    public ExcepcionIntervalo(String mensajeError) {
        // Invocar el contructor de la clase padre Exception
        // Enviando el mensaje de error
        super(mensajeError);
    }
}
