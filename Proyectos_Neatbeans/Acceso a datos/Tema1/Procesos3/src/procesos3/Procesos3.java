/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos3;

import java.io.*;
import java.util.*;
/**
 *
 * @author Naicguer
 */
public class Procesos3 {

    /**
     * @param args the command line arguments
     */
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
            for (int i = 0;i<10;i++){
                salida.println("echo interacion"+i);
                salida.flush();
            }
            salida.println("ipconfig");
            salida.flush();
            
            salida.close();
        }catch(IOException e){
            System.err.println("erro: "+e.toString());
        }
    }
    
}
