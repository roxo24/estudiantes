/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;

/**
 *
 * @author roxo2
 */
public class C_estudiantes {
    private int met1=0;
    private int met2=0;
    private int met3=0;
    private int met4=0;
    private int met5=0;
    private int Ultcc[];
    private int i;
    
    public C_estudiantes(int Ultcc[], int i){
    this.Ultcc = Ultcc;
    this.i = i;
    
    }
    
       
    
    
    /*public void SetUltimodigito ()
    {
        for (int j = 0; j < i; j++) {
            
            Ultcc[j] = CC[j]%10;
            System.out.println(Ultcc[j]);
        } 
    }*/
    
    public void setCalculos(){
    
        for (int j = 0; j < i; j++) {
            switch (Ultcc[j])
    {
    
        case 1 -> {
            
            met1++;
            }
        case 2 -> {
            
            met2++;
            }
        case 3 -> {
            
            met3++;
            }
        case 4 -> {
            
            met4++;
            }
        case 5 -> {
            
            met5++;
            }
        case 6 -> {
            
            met1++;
            }
        case 7 -> {
            
            met2++;
            }
        case 8 -> {
            
            met3++;
            }
        case 9 -> {
            
            met4++;
            }
        case 0 -> {
            
            met5++;
            }
        
        }
    
    
        }
    
    }
    
    public int getMet1(){
    return met1;
    }
    public int getMet2(){
    return met2;
    }
    public int getMet3(){
    return met3;
    }
    public int getMet4(){
    return met4;
    }
    public int getMet5(){
    return met5;
    }
    
    
    
    
    
    
    
    
    
    
}
