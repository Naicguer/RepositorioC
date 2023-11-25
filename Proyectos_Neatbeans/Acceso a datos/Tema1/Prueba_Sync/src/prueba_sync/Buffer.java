/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_sync;

/**
 *
 * @author Naicguer
 */
public class Buffer {
    
    private int contenido;
    private boolean disponible = false;
    
    public synchronized int get(){
        
        while(disponible == false ){
            
            try{
                wait();
            }catch(InterruptedException e){} 
        }
        disponible = false;
        notify();
        return contenido;
    }
    
    public synchronized void put(int value){
        
        while(disponible == true ){
            
            try{
                wait();
            }catch(InterruptedException e){} 
        }
        contenido = value;
        disponible = true;
        notify();
    }
    
    
}
