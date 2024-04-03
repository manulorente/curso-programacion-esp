/*
 *  @(#)Practica4Ejercicio05.java
 *
 *  Fundamentos de Programacion II. GITT.
 *  Departamento de Ingenieria Telematica
 *  Universidad de Sevilla
 *  
 */


/**
 * Descripcion: Error de ejecución acceso a un método con una
 *              referencia nula.
 *
 * version 1.0 Mayo 2011
 * Fundamentos de Programacion II
 */
 
package fp2.poo.practica4;

import java.util.Random;
import java.lang.ArithmeticException;

public class Practica4Ejercicio05 {
    public static void main (String args[]){
        int  a =0, b =0, c =0;
        Random r = new Random();

        for ( int i = 0; i < 10; i++ ){
            try {	
                b = r.nextInt();
                c = r.nextInt();
                a = 12345/(b/c);			
            } catch ( ArithmeticException e ){ 
                System.out.println("División por cero."  + e);
                a = 0; //asigna cero y continua
            }
            System.out.println( "a: " + a );
        }
    }
}

