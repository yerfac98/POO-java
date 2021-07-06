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
import java.util.InputMismatchException;
import java.util.concurrent.ConcurrentHashMap;

public class OperacionBasica {
    // Constructor de la clase OperacionBasica
    public OperacionBasica() {
    }

    public void calcularCociente(String num, String denom) {
        try {
            // Solicita el númerador y denominador desde teclado
            int numerador = Integer.parseInt(num);
            int denominador = Integer.parseInt(denom);
            // Verifica que se encuentre el numerador y denominador dentro del rango
            // en caso de no cumplirlo, se lanza una excepción (excepción propia)
            this.rango(numerador, denominador);
            // Llama el método cociente(...) para calcular el cociente 
            int resultado = cociente(numerador, denominador);
            // Muestra el resultado
            System.out.printf("El cociente de %s / %s = %d\n",num, denom, resultado);
        } catch (InputMismatchException inputMismatchException) {
            System.err.printf("\nExcepción: %s\n", inputMismatchException);
            System.out.println("Debe de introducir núemeros enteros. Vuelva a intentarlo...!");
        } catch (ArithmeticException arithmeticException) {
            System.err.printf("\nExcepcion: %s", arithmeticException);
            System.out.println("Cero es un denominador inválido. Vuelva a intentalo...!\n");
        }catch(NumberFormatException numberFormatException){
            System.err.printf("\nExcepcion: %s", numberFormatException);
        }catch(ExcepcionIntervalo excepcionIntervalo){
            System.err.println(""+excepcionIntervalo.getMessage());
        }
    }

    private int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }
    
    public void rango(int numerador, int denominador) throws ExcepcionIntervalo{
        
        if((numerador >= 100) || (numerador <= -100) ){
            
            
            if (denominador>=100 || (denominador<=-100 )) {
                
            }
            throw new ExcepcionIntervalo("Los números insertados están fuera de rango");
        }
    }
}
