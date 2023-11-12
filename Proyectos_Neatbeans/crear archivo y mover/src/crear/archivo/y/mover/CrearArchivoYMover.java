/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crear.archivo.y.mover;

import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 *
 * @author Naicguer
 */
public class CrearArchivoYMover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        File A1= new File("C:\\temp\\text1.txt");
        File Directori = new File ("C:\\temp\\text");
        File A2= new File("C:\\temp\\text\\text2.txt");
        
        
        if(!A1.exists()){
        A1.createNewFile();
        System.out.println("El archivo tuvo que ser creado");
        }if(!Directori.exists()){
        Directori.mkdirs();
        A2.createNewFile();
        System.out.println("El direcotrio y el archivo tuvieron que ser creados");
        }else{
            System.out.println("El archivo ya existe");
        }
        
        if(A1.renameTo(A2)){
            System.out.println("El fichero se movió correctamente!");
        }else{
            System.out.println("El fichero no pudo moverse!");
        }
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
