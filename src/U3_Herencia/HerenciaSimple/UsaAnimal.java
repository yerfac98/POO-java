/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia.HerenciaSimple;

/**
 *
 * @author Gerardo Fac
 */
public class UsaAnimal {
    
    //Metodo para la demostracion de la herencia simple
    
    public static void main(String[] args) {
        Animal a=new Animal(3,3);
        Perro p=new Perro(true,1,1);
        Gato g=new Gato(1,2);
        Loro l=new Loro(1,2);
        LoroMutante lm=new LoroMutante(3,3);
        
                //Imprimir para los demas animales
        System.out.println("Animal: " +a.habla());
        System.out.println("Perro: " + p.habla());
        System.out.println("Gato: " + g.habla());
        System.out.println("Loro: " + l.habla());
        System.out.println("Loro Mutante " +lm.habla());
        

        //asignaciones polimorficas y ligadura dinamica
        a=g;
        System.out.println("Animal" + a.habla());
        
        a=lm;
        System.out.println("Animal"+ a.habla());
        //System.out.println(a.vuela()); //error
        
        LoroMutante otro = (LoroMutante)a;
        System.out.println(otro.vuela());
        
        //asignacion polimorfica
        Animal prueba= new Perro(true,1,10);
        
        
        
    }
    
}
