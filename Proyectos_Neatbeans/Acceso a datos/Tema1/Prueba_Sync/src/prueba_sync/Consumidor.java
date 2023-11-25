/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_sync;

/**
 *
 * @author Naicguer
 */
public class Consumidor extends Thread{

    private Buffer alamcen;
    private int dormir;

    public Consumidor(Buffer alamcen, int dormir) {
        
        this.alamcen = alamcen;
        this.dormir = dormir;
        
    }

    public void run(){
        
        int valor= 0;
        
        for(int i = 0;i<10;i++){
            
            valor = alamcen.get();
            System.out.println("Consumidr saca: "+valor);
            
            try{
                
                sleep(dormir);
                
            }catch(InterruptedException e){
                
                System.err.println("Error en el consumidor: "+e.toString());
                
            }
        }
    }

    
}
