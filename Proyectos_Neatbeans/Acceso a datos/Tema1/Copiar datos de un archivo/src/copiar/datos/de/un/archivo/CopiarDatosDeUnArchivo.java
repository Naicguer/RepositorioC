/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copiar.datos.de.un.archivo;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Naicguer
 */
public class CopiarDatosDeUnArchivo {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        System.out.println("Introduce el nombre de archivo que quieres copiar");
        String lerAr=sc.nextLine();
        File buscarLerAr=new File(lerAr);
        
        
        System.out.println("Introduce el nombre del archivo al que quieres pasar los datos");
        String pegarAr=sc.nextLine();
        File buscarPegarAr=new File(pegarAr);
        
        
        
        try{
        FileInputStream dentro = new FileInputStream(buscarLerAr);
        FileOutputStream fuera = new FileOutputStream(buscarPegarAr);
        
        int recorrer;
        while ((recorrer = dentro.read())!=-1){
        fuera.write(recorrer);
        }
        
        sc.close();
        System.out.println("Los datos an sido copiados");
        
        
        }catch(IOException e){
            System.out.println("Ocurrio un error"+e.getMessage());
        }
        
        
    }
    
}
