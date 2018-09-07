/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facundo.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FacundoClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato;
        System.out.println("por favor ingrese una edad:");
        Scanner lector=new Scanner(System.in);
        dato=lector.nextInt();
        System.out.println("su edad es :"+dato);
    }
    
}
