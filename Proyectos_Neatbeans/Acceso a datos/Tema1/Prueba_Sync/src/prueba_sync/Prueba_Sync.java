/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_sync;

/**
 *
 * @author Naicguer
 */
public class Prueba_Sync {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final int Domir_Producto = 1000,Dormir_Consumidor=2000;
        
        Buffer almacen = new Buffer();
        Producto productor= new Producto(almacen, Domir_Producto);
        Consumidor consumidor = new Consumidor(almacen,Dormir_Consumidor);
        
        productor.start();
        consumidor.start();
    }
    
}
