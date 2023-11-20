/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3_ac1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Naicguer
 */
public class T3_Ac1 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        try{
            ProcessBuilder builder_echo = new ProcessBuilder("CMD");
            Process proceso_echo=builder_echo.start();
            
            final Scanner in = new Scanner(proceso_echo.getInputStream());
            new Thread(){
                public void run(){
                    while(in.hasNextLine()){
                        System.out.println(in.nextLine());
                    }
                }
            }.start();
            
            PrintWriter salida = new PrintWriter(proceso_echo.getOutputStream());
            System.out.println("Introduce la ruta del directorio :" );
            String ruta=sc.nextLine();
            salida.println(ruta);
            salida.flush();
            System.out.println("Introduce el comando" );
            String comando = sc.nextLine();
            salida.println(comando);
            salida.flush();
            
            salida.close();
        }catch(IOException e){
            System.err.println("erro: "+e.toString());
        }
    }
    
}
