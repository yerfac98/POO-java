/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.io.FileWriter;
import java.io.IOException;
import sun.util.logging.resources.logging;

/**
 *
 * @author Gerardo Fac
 */
public class Manejo_Excepciones {

    public static void main(String[] args) {
       
		       
		          try
		         {
			         Exception e = new Exception("Este es mi propio error.");
			         throw e;
		         }
		         catch(Exception excepcion)
		         {
			         excepcion.printStackTrace();
		         }
		         finally
		         {
			         System.out.println("Error fatal....");
		         }
	         }
         }
         