/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java;

import java.util.Scanner;

/**
 *
 * @author bf247
 */
public class Suma_de_4_numeros {
 public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
       // Aka declaramos las variables
        double numero1, numero2, numero3, numero4, total;
        
        // aka iniciamos las variables
        System.out.println("Ingrese el primer número: ");
        numero1= leer.nextDouble();
        System.out.println("Ingrese su segundo número: ");
        numero2= leer.nextDouble();
        System.out.println("Ingrese el tercer número: ");
        numero3= leer.nextDouble();
        System.out.println("Ingrese su cuarto número: ");
        numero4= leer.nextDouble();
        
        //Aka utilizamos las variable
        total = numero1 + numero2 + numero3 + numero4;
        System.out.println("EJECUTAREMOS LA SUMA");
        System.out.println("Numero1 es :" + numero1);
        System.out.println("Numero2 es :" + numero2);
         System.out.println("Numero3 es :" + numero1);
        System.out.println("Numero4 es :" + numero2);
        System.out.println("EL TOTAL DE LA SUMA ES:" + total );
        
        
        
        
    }
    
}
