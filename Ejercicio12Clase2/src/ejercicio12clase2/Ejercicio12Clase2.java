/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12clase2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio12Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double precioProducto;
        double precioFinal;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto importado en Pesos Argentinos");
        precioProducto=myScanner.nextInt();
        /* impuesto interno=35%
        */
        precioFinal=(precioProducto * 1.35);
        
        System.out.println("El precio con impuesto agregado del producto es de "+precioFinal);
        
                
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
