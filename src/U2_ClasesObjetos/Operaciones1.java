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
public class Operaciones1 {

    public static void main(String[] args) {

        //rectangulo
        Operaciones rectangulo = new Operaciones(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + rectangulo.getAreaRectangulo());
        rectangulo.PRec();
        System.out.println("El perimetro del rectangulo es " + rectangulo.getPerimetroRec());
        System.out.println("");

        //cuadrado
        Operaciones cuadrado = new Operaciones(10);
        cuadrado.areaCua();
        System.out.println("Área del cuadrado de lado 10: " + cuadrado.getareaCuadrado());

        cuadrado.PC();
        System.out.println("El perimetro del cuadrado es:" + cuadrado.PerimetroCuadrado);
        System.out.println("");

        //triangulo
        Operaciones triangulo = new Operaciones(5, 10);
        triangulo.areaT();
        System.out.println("");
        System.out.println("El area del triangulo de base 5 y altura 10: " + triangulo.getAreaTriangulo());
        System.out.println("El perimetro es:" + triangulo.perimetroT(5, 10));

        //pentagono
        Operaciones pentagono = new Operaciones(10, 5);
        pentagono.areaP();
        System.out.println("");
        System.out.println("El area del pentagono es " + pentagono.getAreaPentagono());
        System.out.println("El perimetro es:" + pentagono.perimetroP);
    }
}
