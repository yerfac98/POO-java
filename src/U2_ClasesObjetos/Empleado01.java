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
public class Empleado01 {

    private String nombre;
    private String apellidos;
    private int edad;
    private float Salario = 950.60F;
    private float SalarioDepto[] = {35.5F, 50.75F, 75.40F, 25.85F};

    public Empleado01() {

    }

    public Empleado01(String nombre) {
        this.nombre = nombre;

    }

    public Empleado01(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Empleado01(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Empleado01(String nombre, String apellidos, int edad, float Salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.Salario = Salario;
    }
    
    public void setNombre(String nombre){
   this.nombre =nombre;
    }
    
    public void setApellidos(String apellidos){
    this.apellidos = apellidos;
    }
    
    public void setEdad(int edad){
    this.edad =edad;
    }
    
      public void setEdad (float edad){
    this.edad =(int) edad;
    }
      
 public void setSalario (float salario){
 this.Salario = Salario;
 } 
 
 public String getNombre (){
 return nombre;
 }
 
 public String getApellidos (){
 return apellidos;
 }
 
  public int getEdad (){
 return edad;
 }
  
   public float getSueldo (){
 return Salario;
 }
  
    public float getSueldo (int horas){
 return Salario * horas;
 }
    
    public float getSueldo (int horas, int departamento ){
          float sueldoDepartamento = 0F;

        switch (departamento) {
            case 1:
                sueldoDepartamento = SalarioDepto[0];
                break;
            case 2:
                sueldoDepartamento = SalarioDepto[1];
                break;
            case 3:
                sueldoDepartamento = SalarioDepto[2];
                break;
            default:
                sueldoDepartamento = SalarioDepto[3];
                break;
        }
        return sueldoDepartamento * horas;
}
    
    public static void main(String[] args) {
        Empleado01 obj = new Empleado01();
        
         System.out.println("El sueldo es de :" + obj.getSueldo());
        System.out.println("El sueldo es de :" + obj.getSueldo(40));
        System.out.println("El sueldo es de :" + obj.getSueldo(50, 1));
        System.out.println("El sueldo es de :" + obj.getSueldo(35, 2));
        System.out.println("El sueldo es de :" + obj.getSueldo(55, 3));
        System.out.println("El sueldo es de :" + obj.getSueldo(40, 0));
    }
}
