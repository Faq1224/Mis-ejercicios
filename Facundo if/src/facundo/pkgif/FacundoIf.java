/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facundo.pkgif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FacundoIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        //nombre="Facundo";
        Scanner miScanner= new Scanner(System.in);
        
        System.out.println("Por favor ingrese su nombre");
        nombre= miScanner.next();
        System.out.println("Por favor ingrese su edad");
        edad= miScanner.nextInt();
        
        System.out.println("Su nombre es "+nombre+" y usted tiene "+edad+" años");
        /* if(edad>17)
        {
            System.out.println("Usted es mayor de edad");
        }
        if (edad<18)
        {
            System.out.println("Usted es menor de edad");
        }*/
        
        if(edad>17)
        {
            System.out.println("Usted es mayor de edad");
        }
        else 
        {
            System.out.println("Usted es menor de edad");
        }
        
    }
    
}
