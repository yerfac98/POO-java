/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U4_Polimorfismo_Clases_Abstractas;

/**
 *
 * @author Gerardo Fac
 */
public class UsaHabitante {

    public void ejecutar() {
        //crear objetos
        adulto homero = new adulto("Homero");
        Niño bart = new Niño("bart");
        Niño lisa = new Niño("Lisa");
        adulto obj = new adulto("Krusty");

        //Crea un arreglo de tipo habitante
        Habitante[] sprigfield = new Habitante[4];
        sprigfield[0] = homero;
        sprigfield[1] = bart;
        sprigfield[2] = lisa;
        sprigfield[3] = obj;
        //agregar el objeto "lisa" en springfield

        //visualizar la informacion de los habitantes d springfield
        for (int i = 0; i < sprigfield.length; i++) {
            System.out.println(sprigfield[i].getNombre() + ":" + sprigfield[i].habla());

        }
        //crear otro objeto de tipo habitante
        //el nombre del objeto debe ser Krusty
        //Mostrar la informacion de Krusty
    }

    public static void main(String[] args) {
        UsaHabitante uh = new UsaHabitante();
        uh.ejecutar();
    }
}
