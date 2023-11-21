/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author Naicguer
 */
public class prueba_Hilo1 {
    
    public static void main(String[] args){
        
    Hilos hilo1=new Hilos("Hilo 1 ",1000);
    Hilos hilo2=new Hilos("Hilo 2 ",1000);
    
    hilo1.start();
    hilo2.start(); 
    
    }
}
