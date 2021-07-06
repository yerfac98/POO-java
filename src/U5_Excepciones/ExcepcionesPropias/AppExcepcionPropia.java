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
import java.util.Scanner;

public class AppExcepcionPropia {

    // Método main para realizar la prueba de las excepciones propias y las proporcionadas por el lenguaje Java
    public static void main(String[] args) {
        try {
            // Solicita los datos desde teclado
            Scanner entrada = new Scanner(System.in);
            System.out.println("Escriba el numerador: ");
            String numerador = entrada.nextLine();
            System.out.println("Escriba el denominador: ");
            String denominador = entrada.nextLine();
            // Declara y crea el objeto op
            OperacionBasica op = new OperacionBasica();
            // Invoca el método calcularCociente(...) mediante el objeto op 
            op.calcularCociente(numerador, denominador);
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
