/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia;

/**
 *
 * @author Gerardo Fac
 */
public class Envoltorio {

    public static void main(String[] args) {
        Integer entero = new Integer(42);

        byte b = entero.byteValue();
        short s = entero.shortValue();
        double d = entero.doubleValue();

        double d1 = Double.parseDouble("3.14");
        // el resultado es 42
        long L2 = Long.parseLong("101010", 2);
        // el resultado es 42

        Long L3 = Long.valueOf("101010", 2);

        Double d2 = new Double("3.14");
        //el resultado es 3.14
        System.out.println("d2 = " + d2.toString());
    }
}
