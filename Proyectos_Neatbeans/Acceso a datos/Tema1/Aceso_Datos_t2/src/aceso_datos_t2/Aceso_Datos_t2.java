/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceso_datos_t2;

import java.io.*;

public class Aceso_Datos_t2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException , IOException {
        RandomAccessFile archivo = new RandomAccessFile("datos", "rw");
        
        byte[]array = "Hola mundo!".getBytes();
        archivo.write(array);
        
        archivo.seek(0);
        
        byte[]datosLeidos= new byte[array.length];
        archivo.read(datosLeidos);
        
        String texto = new String(datosLeidos);
        System.out.println("Texto leido: "+texto);
        
        archivo.close();
    }
    
}
