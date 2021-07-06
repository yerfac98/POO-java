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
public class ISC_POO_FEB18JUL18 {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNombre("Gerardo");
        estudiante1.setApellidoPaterno("Facundo");
        estudiante1.setApellidoMaterno("Del Angel");
        estudiante1.setAnioNacimiento(1998);
        estudiante1.setNumControl("173S0359");
        estudiante1.setSemestre(2);
        estudiante1.setGrupo('A');
        estudiante1.setCarrera("ISC");
        estudiante1.setCurp("FAAg");

        System.out.println("Nuevo alumno");
        System.out.println("");
        estudiante1.setNombre("Gustavo");
        estudiante1.setApellidoPaterno("Martinez");
        estudiante1.setApellidoMaterno("Licona ");
        estudiante1.setAnioNacimiento(1999);
        estudiante1.setNumControl("173S014");
        estudiante1.setSemestre(2);
        estudiante1.setGrupo('A');
        estudiante1.setCarrera("ISC");
        estudiante1.setCurp("MLG999999");

        System.out.println("Informacion del estudiante \n" + estudiante1.getInfoEstudiante());

    }
}
