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
public class promedios {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Declaramos variables
        
        String nombre, materia, grado;
        int edad;
        double nota1, nota2, nota3, promedio;
        
        
        //Iniciamos las variables
        
        System.out.println("Digite el Nombre del Alumno: ");
        nombre = leer.nextLine();
        
        System.out.println("Materia: ");
        materia = leer.nextLine();
        
         System.out.println("Grado al que cursa el alumno: ");
        grado = leer.nextLine();
        
         System.out.println("Digite edad: ");
        edad = leer.nextInt();
        
        System.out.println("Digite nota1: ");
        nota1 = leer.nextDouble();
        
        System.out.println("Digite nota2: ");
        nota2 = leer.nextDouble();
        
        System.out.println("Digite nota3: ");
        nota3 = leer.nextDouble();
        
  
        
        //Utilizamos las variables
        promedio = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Alumno: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Grado: " + grado);
        System.out.println("Edad: " + edad + " Años" );
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        System.out.println("nota3: " + nota3);
        System.out.println("Su Promedio es: " + promedio);
        
    }

}
