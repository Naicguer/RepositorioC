/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;


public class Hilos extends Thread {
    
    private String nombre;
    private int dormir;

    public Hilos(String nombre, int dormir) {
        this.nombre = nombre;
        this.dormir = dormir;
    }

    public void run(){
        
        for (int i= 0; i<10;i++){
            System.out.println("Soy el hilo1 "+nombre+" en la interación "+i);
            try{
                sleep(dormir);
            }catch(InterruptedException e){
                System.out.println("Error: "+e.toString());
            }
        }
    }
    
}
