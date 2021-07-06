/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U2_ClasesObjetos;

/**
 *
 * @author Gerardo Fac
 */
/*
==Operadores unarios==
+,-,!,*++,--
Operadores binarios
+,-,*,/%,&,/¨,<<>>

operadores con la posibilidad de sobrecargar
==,!=,<,>,<=,>=

Por ejemplo:
==SERIA	!=


 */
public class SobrecargaOperadores {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 20;

        //operadores de asignacion
        a = a + b;
        System.out.println("a =" + a);//a=15

        a += b;
        System.out.println("a =" + a); //a=20

        c++;//c=c+1;
        System.out.println("c =" + c); //c=21

        c--; //c=c-1;
        System.out.println("c =" + c); //c=20

        boolean band = (a == b);
        System.out.println("band= " + band);
        band = false;

        band = (a != b);
        System.out.println("band=" + band); //band = true

        //estructura selectiva
        if (a == b) {
            a = a * 10;
        } else {
            a = c;
        }
        System.out.println("c= " + c);
        // aplicando como operador ternario el if-else
        //sintaxis: expresion? sentencia1: sentencia2
        a = (a == b) ? (a * 10) : c;
        System.out.println("c=" + c);//20
    }
}
