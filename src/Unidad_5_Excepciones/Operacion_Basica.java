/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad_5_Excepciones;

/**
 *
 * @author Gerardo Fac
 */
public class Operacion_Basica {

    public void Operacion_Basica() {
    }

    public static void calcularCociente(String num, String Denom) {//sin retorno

        try {
            int numerador = Integer.parseInt(num);//casting,se convirtio la cadena en entero
            int denominador = Integer.parseInt(Denom);

        } catch (Exception e) {

        }
    }

    private int rango(int numerador, int denominador) {

        return numerador / denominador;
    }
}
