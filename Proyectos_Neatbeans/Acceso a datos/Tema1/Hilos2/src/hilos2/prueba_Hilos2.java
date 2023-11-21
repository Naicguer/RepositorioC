/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2;

/**
 *
 * @author Naicguer
 */
public class prueba_Hilos2 {
    
    public static void main(String[] args){
        Hilos2 hilo1=new Hilos2("Hilo 1",1000);
        Hilos2 hilo2=new Hilos2("Hilo 2",1000);
        
        Thread hebra1= new Thread(hilo1);
        Thread hebra2= new Thread(hilo2);
        
        hebra1.start();
        hebra2.start();
    }
}
