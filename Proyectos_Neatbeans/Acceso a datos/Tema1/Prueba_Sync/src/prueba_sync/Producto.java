/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba_sync;

/**
 *
 * @author Naicguer
 */
public class Producto extends Thread{
    
    private Buffer almacen;
    private int dormir;

    public Producto(Buffer almacen, int dormir) {
        this.almacen = almacen;
        this.dormir = dormir;
    }
    
    public void run(){
        for (int i = 0;i<10;i++){
            
            almacen.put(i);
            System.out.println("Prodcutor pone: "+i);
            try{
               sleep(dormir);
            }catch(InterruptedException e){
                System.err.println("Error en el productor: "+e.toString());
            }
        }
    }
}
