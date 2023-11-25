/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ac1;

/**
 *
 * @author Naicguer
 */
public class Tenedor {
    private  int numero;
    private boolean enUso;

    public Tenedor(int numero) {
        this.numero = numero;
        enUso = false;
    }
    
    synchronized public void usar(){
        while(enUso){
            System.out.println("Tenedor "+numero+"esta en uso, espera");
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Se ha producido un error: "+e);
            }
        }
        if(!enUso){
        enUso = true;
        System.out.println("Se esta usando el tenedor "+numero);
        }
    }
    synchronized public void dejar(){
        enUso = false;
        System.out.println("Tenedor "+numero+" esta ahora disponible");
        notify();
    }
}
