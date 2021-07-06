/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado_Ejercicio;

/**
 *
 * @author Gerardo Fac
 */
public abstract class Empleado {
    protected static double SalarioDef=900;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;
    
    public Empleado(){
        nombre= "";
        apellido="";
        SalarioDef=900;
        
    }

    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    
     
    }
    public static double getSalarioDef() {
        return SalarioDef;
    }

    public static void setSalarioDef(double SalarioDef) {
        Empleado.SalarioDef = SalarioDef;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the Salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param Salario the Salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract boolean plus(double Sueldoplus);

}