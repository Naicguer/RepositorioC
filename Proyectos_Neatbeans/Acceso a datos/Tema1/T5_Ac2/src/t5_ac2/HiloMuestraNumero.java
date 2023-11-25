/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5_ac2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Naicguer
 */
public class HiloMuestraNumero extends Thread {
    
    String Nombre;
    int Numero;

    public HiloMuestraNumero() {
    }
    

    public HiloMuestraNumero(String Nombre, int Numero) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        
    }
    
    public void run (){
        Random aleatorio = new Random();
        
        int dormir = aleatorio.nextInt(2001)+1000;
        int Prioridad = aleatorio.nextInt((Thread.MAX_PRIORITY-Thread.MIN_PRIORITY)+1)+Thread.MIN_PRIORITY;
        
        
        System.out.println("El hilo "+Nombre+" mostrara el numero "+ Numero+ " con la prioridad de "+Prioridad+" y ahora dormira "+ dormir );
        try {
            sleep(dormir);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloMuestraNumero.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
}
