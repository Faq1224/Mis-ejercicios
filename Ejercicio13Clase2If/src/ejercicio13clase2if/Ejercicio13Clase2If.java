/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13clase2if;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13Clase2If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Color;
        String Localidad;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Ingrese una localidad");
        Localidad=myScanner.next();
        System.out.println("Ingrese un color");
        Color=myScanner.next();
        System.out.println(Localidad+" "+Color);
        /*
        if (Color.equals("Rojo"))
        {
            if (Localidad.equals("Avellaneda"))
            {
                System.out.println("Usted es de Independiente");
            }
            if (Localidad.equals("Lanus"))
            {  
                System.out.println("Usted es de Independiente");
            }
        }*/
        
        if (Color.equals("Rojo"))
        {
            if (Localidad.equals("Avellaneda")||Localidad.equals("Lanus"))
            {  
                System.out.println("Usted es de Independiente");
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
