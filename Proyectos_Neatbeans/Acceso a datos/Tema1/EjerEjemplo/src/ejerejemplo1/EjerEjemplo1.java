
package ejerejemplo1;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class EjerEjemplo1 {

    public static void main(String[] args) {
        //se da un nombre al archivo
        File archivo1= new File("archivo1");
        
        try{
            //se crea el archivo
            archivo1.createNewFile();
            //se imprime por pantalla el nombre dle archiv + su ruta
            System.out.println("Se a creado el archivo: "+archivo1.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }
        
        //comprobar si sea creado dicho archivo
        if(archivo1.exists()){
            System.out.println("El archivo existe.");
        }else{
            System.out.println("El archivo no existe");
        }
        
        String directorioActual = System.getProperty("user.dir");
        File directorio = new File(directorioActual);
        
        //Listar archivos en carpeta
        if(directorio.isDirectory()){
            System.out.println("Archivos en " + directorio.getAbsolutePath()+":");
            String[] archivos = directorio.list();
            for(String archivo: archivos){
                System.out.println(archivo);
                
            }
        }
        
        
    }
    
}
