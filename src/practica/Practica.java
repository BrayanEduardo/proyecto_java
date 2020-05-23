/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author bf247
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int resultado;
      
      for(int i=1; i<=10; i++){
          System.out.println("");
          System.out.println("Tabla del " + i);
          
         for(int j=1; j<=10; j++){
         resultado = i*j;
             System.out.println(i+"x"+j+"="+resultado);
         
         } 
       }
    }
    
}
