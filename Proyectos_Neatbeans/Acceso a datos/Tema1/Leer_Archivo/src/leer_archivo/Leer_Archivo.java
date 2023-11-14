
package leer_archivo;

import java.io.*;
import java.util.Scanner;


public class Leer_Archivo {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
       System.out.println("Introduce la ruta del archivo que deseas leer ");
       String ruta = sc.nextLine();
       File leer = new File(ruta);
       
       try{
           
       BufferedReader lector = new BufferedReader(new FileReader(leer));
       String imprimir;
       int numeroCol= 0;
       
       while((imprimir = lector.readLine())!=null){
           
           
           if (numeroCol %2 == 0){
                    System.out.println("Columna 0 " + numeroCol+":"+ imprimir );
                    
            }
            numeroCol++;
        }
        }catch(IOException e){
           System.out.println("Error : "+ e.getMessage());
        }
    }
}
