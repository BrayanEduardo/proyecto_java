/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class restas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //variables
        double numero1, numero2, total;
        
        
        //iniciamos las variables
        System.out.println("Ingrese primer numero:");
        numero1 = leer.nextDouble();
        System.out.println("Ingrese segundo numero:");
        numero2 = leer.nextDouble();
        
        //utilizamos las variables
        total = numero1 - numero2;
        System.out.println("Numero 1 es :" + numero1);
        System.out.println("Numero 2 es :"+ numero2);
        System.out.println("LA RESTA DE LOS NUMEROS ES: "+ total);
    }
    
}
