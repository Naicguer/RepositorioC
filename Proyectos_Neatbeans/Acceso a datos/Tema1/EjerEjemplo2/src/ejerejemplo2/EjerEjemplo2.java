
package ejerejemplo2;

import java.io.*;

public class EjerEjemplo2 {

    
    public static void main(String[] args) {
        File directorio = new File("Hola directorio");
        directorio.mkdir();
        System.out.println("Se ha creado el directorio: "+directorio.getAbsolutePath());
        
        File archivo= new File(directorio,"nuevo_archivo.txt");
        try{
            archivo.createNewFile();
            System.out.println("Se ha creado el archivo: "+archivo.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }
        if(directorio.isDirectory()){
            System.out.println("Elementos en "+ directorio.getAbsolutePath()+":");
            String[] elemetos = directorio.list();
            for(String elemento : elemetos){
                System.out.println(elemento);
            }
        }else{
            System.out.println("El directorio no es válido");
        }
    }
    
}
