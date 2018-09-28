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
public class CalculadoraV2 {
    public static int NumeroUno;
    public static int NumeroDos;
    public static int Resultado;
    
    private static void pedirDatos()
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese dos números, uno seguido del otro");
        CalculadoraV2.NumeroUno=myScanner.nextInt();
        CalculadoraV2.NumeroDos=myScanner.nextInt();
    }
    public static void sumar()
    {
        System.out.println("Usted está sumando");
        CalculadoraV2.pedirDatos();
        CalculadoraV2.Resultado=CalculadoraV2.NumeroUno+CalculadoraV2.NumeroDos;
        CalculadoraV2.mostrarResultado();
        /*
        System.out.println("El resultado es "+CalculadoraV2.Resultado);
        */
    }
    public static void restar()
    {
        System.out.println("");
        System.out.println("Usted está restando");
        CalculadoraV2.pedirDatos();
        CalculadoraV2.Resultado=CalculadoraV2.NumeroUno-CalculadoraV2.NumeroDos;
        CalculadoraV2.mostrarResultado();
        /*
        System.out.println("El resultado es "+CalculadoraV2.Resultado);
        */
    }
    public static void multiplicar()
    {
        System.out.println("");
        System.out.println("Usted está multiplicando");
        CalculadoraV2.pedirDatos();
        CalculadoraV2.Resultado=CalculadoraV2.NumeroUno*CalculadoraV2.NumeroDos;
        CalculadoraV2.mostrarResultado();
        /*
        System.out.println("El resultado es "+CalculadoraV2.Resultado);
        */
    }
    public static void dividir()
    {
        System.out.println("");
        System.out.println("Usted está dividiendo");
        CalculadoraV2.pedirDatos();
        CalculadoraV2.Resultado=CalculadoraV2.NumeroUno/CalculadoraV2.NumeroDos;
        CalculadoraV2.mostrarResultado();
    }
    private static void mostrarResultado()
    {
        System.out.println("El resultado es "+CalculadoraV2.Resultado);
    }
    public static void calcular()
    {
        int opcion;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 4. 1=Sumar. 2=Restar. 3=Multiplicar. 4=Dividir");
        opcion=myScanner.nextInt();
        switch (opcion)
        {
            case 1:
                CalculadoraV2.sumar();
                break;
            case 2:
                CalculadoraV2.restar();
                break;
            case 3:
                CalculadoraV2.multiplicar();
                break;
            case 4:
                CalculadoraV2.dividir();
                break;
        }
    }
    
    
}
