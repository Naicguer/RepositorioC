
package actividad1;

import java.io.*;

public class Actividad1 {

   
    public static void main(String[] args) throws FileNotFoundException ,IOException{
        RandomAccessFile archivo = new RandomAccessFile("datos","rw");
        
        long posicion = archivo.getFilePointer();
        System.out.println("posicion primera :" + posicion);
        
        archivo.seek(0);
        
        posicion = archivo.getFilePointer();
        System.out.println("Posicion segunda:" + posicion);
        
        archivo.write(68);
        
        posicion = archivo.getFilePointer();
        System.out.println("Posicion tercer:"+posicion);
        
        archivo.seek(4);
        int numero = archivo.read();
        System.out.println("Numero: "+numero);
        
        archivo.seek(0);
        int numero2=archivo.read();
        System.out.println("Numero:"+ numero2);
        System.out.println("Es la letra: " + (char)numero2);
        
        archivo.close();
    }
    
}
