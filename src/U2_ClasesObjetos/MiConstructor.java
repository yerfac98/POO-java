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
public class MiConstructor {

    private int a, b;

    /* Constructor vacio / sin implementacion*/
    public MiConstructor() {
        System.out.println("Estoy en el constructor vacio");
    }

    /* Constructor con un parametro */
    public MiConstructor(int a) {
        this.a = a;
        System.out.println("Estoy en el constructor con un parametro");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /* Constructor con dos parametros */
    public MiConstructor(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Estoy en el constructor con dos parametros");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        MiConstructor c1 = new MiConstructor();
        MiConstructor c2 = new MiConstructor(5);
        MiConstructor c3 = new MiConstructor(10, 3);
    }
}
