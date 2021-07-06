/*
 crear un programa que permita registra, actualizar , consultar y borrar los datos de un estudiante.
los datos
 */
package U2_ClasesObjetos;

/**
 *
 * @author Gerardo Fac
 */
public class Estudiante {
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public int anioNacimiento;
    public String numControl;
    public int semestre;
    public char grupo;
    public String carrera;
    public String curp;

    
    public Estudiante(){
        
    }
    //Metodos de la clase estudiante
    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
    public String getInfoEstudiante(){
        return (getNombre()+ "" +getApellidoPaterno()+ ""+getApellidoMaterno()+"\n"+getAnioNacimiento()+"\n"+getNumControl()+
                "\n"+getSemestre()+"\n"+getGrupo()+"\n"+getCarrera()+"\n"+getCurp());
    }
    
    
}
