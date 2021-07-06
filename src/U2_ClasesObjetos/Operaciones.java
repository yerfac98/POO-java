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
public class Operaciones {

    public double base;
    public double altura;
    public double areaRectangulo;
    public double perimetroRec;
    public double PerimetroCuadrado;
    public double lado;

    public double perimetrocua;

    public Operaciones(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//rectangulo

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaRectangulo() {
        return areaRectangulo;
    }

    public void area() {
        areaRectangulo = base * altura;
    }

    public double getPerimetroRec() {
        return perimetroRec;
    }

    public void PRec() {
        perimetroRec = (base + altura) * 2;
    }

    //cuadrado
    private double ladoCua;
    private double areaCuadrado;

    public Operaciones(double ladoCua) {
        this.ladoCua = ladoCua;
    }

    public double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(double ladoCua) {
        this.ladoCua = ladoCua;
    }

    public double getareaCuadrado() {
        return areaCuadrado;
    }

    public void areaCua() {
        areaCuadrado = ladoCua * ladoCua;
    }

    public double getPerimetroCuadrado() {
        return PerimetroCuadrado;
    }

    public void PC() {
        PerimetroCuadrado = (ladoCua) * 4;
    }

//triangulo
    public double base1;
    public double altura1;
    public double areaTriangulo;
    public double perimetroTria;

    public void Operaciones(double baseTria, double alturaTria) {
        this.base1 = base1;
        this.altura1 = altura1;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getAltura1() {
        return altura1;
    }

    public void setAltura1(double altura1) {
        this.altura1 = altura1;
    }

    public double getAreaTriangulo() {
        return areaTriangulo;
    }

    public void areaT() {
        areaTriangulo = base * altura / 2;

    }

    public double perimetroT(double cateto1, double cateto2) {
        double hipotenusa = (double) Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));
        return cateto1 + cateto2 + hipotenusa;
    }

    //pentagono
    public double ladoP;
    public double apotema;
    public double areaPentagono;
    public double perimetroP;

    public void Operaciones(double ladoP, double apotema, double perimetroP) {
        this.ladoP = ladoP;
        this.apotema = apotema;

    }

    public double getladoP() {
        return ladoP;
    }

    public void setLadoP(double ladoP) {
        this.ladoP = ladoP;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getAreaPentagono() {
        return areaPentagono;
    }

    public void areaP() {
        areaPentagono = (perimetroP * apotema) / 2;
    }

    public double getPerimetroP() {
        perimetroP = lado * 5;
        return perimetroP;
    }
}

/*


    //pentagono
    public double alturaPen;
    public double areaPen;
    public double perimetroPen;
    public double apotema;
    public double ladoPen;
    
    public Operaciones(double alturaPen,double areaPen,double perimetroPen){
        this.perimetroPen=perimetroPen;
        this.areaPen=areaPen;
        this.alturaPen=alturaPen;
        this.apotema=apotema;
        this.ladoPen=ladoPen;
        
    }
        public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getladoPen() {
        return ladoPen;
    }

    public void setladoPen(double ladoPen) {
        this.ladoPen = ladoPen;
    }

    public double getAreaPen() {
        return areaPen;
    }

    public void AreaPen() {
        areaPen = 5*(ladoPen)/2;
    }
     public double getPerimetroPen() {
        return perimetroPen;
    }

    public void PerimetroPen() {
        perimetroPen = 5*(lado) ;
    }
    }
 */
