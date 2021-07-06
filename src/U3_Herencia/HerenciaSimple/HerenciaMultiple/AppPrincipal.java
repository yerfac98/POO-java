/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U3_Herencia.HerenciaSimple.HerenciaMultiple;

/**
 *
 * @author Gerardo Fac
 */
public class AppPrincipal {
    
    public static void curar(PuedeCurar pc){
        pc.curar();
        
    }
     public static void consultar(PuedeConsultar pc){
        pc.consultar();
     }
      public static void medico(Cirujano mc){
          mc.operar();
      }
      
       public static void recetar(PuedeRecetar pr){
          pr.recetar();
      }
      
      public static void main(String[] args) {
        
          Medico m= new Medico();
          curar(m);
          consultar(m);
          medico(m);
          recetar(m);
          
          
    }
     
}
