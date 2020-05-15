
package proyecto_java;

import java.util.Scanner;


public class Sumas {

  
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
       // Aka declaramos las variables
        double numero1, numero2, total;
        
        // aka iniciamos las variables
        System.out.println("Ingrese el primer número: ");
        numero1= leer.nextDouble();
        System.out.println("Ingrese su segundo número: ");
        numero2= leer.nextDouble();
        
        //Aka utilizamos las variable
        total = numero1 + numero2;
        System.out.println("EJECUTAREMOS LA SUMA");
        System.out.println("Numero1 es :" + numero1);
        System.out.println("Numero2 es :" + numero2);
        System.out.println("EL TOTAL DE LA SUMA ES:" + total );
        
        
        
        
    }
    
}
