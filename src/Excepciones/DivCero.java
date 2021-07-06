/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class DivCero {
 
 // demuestra cómo se lanza una excepción cuando ocurre una división entre cero
    public static int cociente( int numerador, int denominador )
  throws ArithmeticException
  {
  return numerador / denominador; // posible división entre cero
 } // fin del método cociente

  public static void main( String args[] )
  {
 Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada
 boolean continuarCiclo = true; // determina si se necesitan más datos de entrada

  do
 {
  try{ // lee dos números y calcula el cociente
 
 System.out.print( "Introduzca un numerador entero: " );
  int numerador = explorador.nextInt();
  System.out.print( "Introduzca un denominador entero: " );
  int denominador = explorador.nextInt();
 
  int resultado = cociente( numerador, denominador );
  System.out.printf( "\nResultado: %d / %d = %d\n", numerador,
  denominador, resultado );
  continuarCiclo = false; // entrada exitosa; termina el ciclo
 } // fin de bloque try
 catch ( InputMismatchException inputMismatchException )
  {
  System.err.printf( "\nExcepcion: %s\n",
  inputMismatchException );
  explorador.nextLine(); // descarta entrada para que el usuario intente otra vez
 System.out.println("Debe introducir enteros. Intente de nuevo.\n" );
  } // fin de bloque catch
 catch ( ArithmeticException arithmeticException )
  {
  System.err.printf( "\nExcepcion: %s\n", arithmeticException );
  System.out.println(
  "Cero es un denominador invalido. Intente de nuevo.\n" );
  } // fin de catch
 } while ( continuarCiclo ); // fin de do...while
 } // fin de main
} // fin de la clase DivisionEntreCeroConManejoDeExcepciones 

