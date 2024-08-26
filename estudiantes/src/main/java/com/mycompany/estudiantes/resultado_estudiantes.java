/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;

import java.util.Scanner;

/**
 *
 * @author roxo2
 */
public class resultado_estudiantes {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
     System.out.println("bienvenido al sistema de estudiantes");
     System.out.println("cuantos estudiantes va a ingresar");
     int i = teclado.nextInt();
    int CC[] = new int[i];
    int Ultcc[] = new int[i];
    
        for (int j = 0; j < i; j++) {
            System.out.println("ingrese la cedula del estudiante "+j);
            CC[j]= teclado.nextInt();
            
        }
        for (int j = 0; j < i; j++) {
            
            Ultcc[j] = CC[j]%10;
            System.out.println(Ultcc[j]);
        } 
    
    C_estudiantes estudiantes = new C_estudiantes(Ultcc,i);
    //estudiantes.SetUltimodigito();
    estudiantes.setCalculos();
    
    
    System.out.println("el modelo 1 deben hacerlo "+ estudiantes.getMet1() + " estudiantes");
    System.out.println("el modelo 2 deben hacerlo "+ estudiantes.getMet2() + " estudiantes");
    System.out.println("el modelo 3 deben hacerlo "+ estudiantes.getMet3() + " estudiantes");
    System.out.println("el modelo 4 deben hacerlo "+ estudiantes.getMet4() + " estudiantes");
    System.out.println("el modelo 5 deben hacerlo "+ estudiantes.getMet5() + " estudiantes");
    
    
    
    
    
    
    
    
    
    
    
    }

   
}
