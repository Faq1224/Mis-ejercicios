/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11clase2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio11Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas;
        int salario;
        double SueldoBruto;
        double SueldoNeto;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("¿Cuanto le pagan por hora?");
        salario=myScanner.nextInt();
        System.out.println("¿Cuantas horas trabaja?");
        horas=myScanner.nextInt();
        
        SueldoBruto=(salario*horas);
        SueldoNeto=(SueldoBruto * 0.85);
        
        System.out.println("Su salario es de "+SueldoNeto+" pesos");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
