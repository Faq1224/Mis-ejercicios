/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.objetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    public static void sumar()
    {
        Scanner myScanner = new Scanner(System.in);
        int NumeroUno;
        int NumeroDos;
        int Resultado;
        
        /*System.out.println("Ingrese el primer número");
        */
        System.out.println("Usted esta sumando");
        System.out.println("Ingrese dos números, uno seguido del otro");
        NumeroUno=myScanner.nextInt();
        /*
        System.out.println("Ingrese el segundo número");
        */
        NumeroDos=myScanner.nextInt();
        /*
        System.out.println("El número uno es "+NumeroUno);
        System.out.println("El número dos es "+NumeroDos);
        */
        Resultado=NumeroUno+NumeroDos;
        System.out.println("El resultado es "+Resultado);
    }
    public static void restar()
    {
        Scanner myScanner = new Scanner(System.in);
        int NumeroUno;
        int NumeroDos;
        int Resultado;
        
        /*
        System.out.println("Ingrese el primer número");
        */
        System.out.println("Usted esta restando");
        System.out.println("Ingrese dos números, uno seguido del otro");        
        NumeroUno=myScanner.nextInt();
        /*
        System.out.println("Ingrese el segundo número");
        */
        NumeroDos=myScanner.nextInt();
        Resultado=NumeroUno-NumeroDos;
        System.out.println("El resultado es "+Resultado);
    }
    public static void multiplicar()
    {
        Scanner myScanner = new Scanner(System.in);
        int NumeroUno;
        int NumeroDos;
        int Resultado;
        /*
        System.out.println("Ingrese el primer número");
        */
        System.out.println("Usted esta multiplicando");
        System.out.println("Ingrese dos números, uno seguido del otro");
        NumeroUno=myScanner.nextInt();
        /*
        System.out.println("Ingrese el segundo número");
        */
        NumeroDos=myScanner.nextInt();
        Resultado=NumeroUno*NumeroDos;
        System.out.println("El resultado es "+Resultado);
        
    }
    
}
