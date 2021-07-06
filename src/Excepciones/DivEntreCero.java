/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class DivEntreCero {

    // demuestra el lanzamiento de una excepción cuando ocurre una división entre cero
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador; // posible división entre cero
    } // fin del método cociente

    public static void main(String args[]) {
        Scanner explorador = new Scanner(System.in); // objeto Scanner para entrada

        System.out.print("Introduzca un numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.print("Introduzca un denominador entero: ");
        int denominador = explorador.nextInt();

        int resultado = cociente(numerador, denominador);
        System.out.printf(
                "\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
    } // fin de main
} // fin de la clase DivisionEntreCeroSinManejoDeExcepciones

