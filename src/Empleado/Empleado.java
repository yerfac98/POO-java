/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author Gerardo Fac
 */
public abstract class Empleado  {
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract boolean plus(double SueldoPlus);
       

}

    

