/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.actividad2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Naicguer
 */
public class T3Actividad2 {

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
            System.out.println("Intorduzca la aplicacion que quiere iniciar" );
            System.out.println("Acrobat Reader / Calculadora / Word / Bloc de notas" );
            String elecion = sc.nextLine();
            switch(elecion){
                case "Acrobat Reader":
                    salida.println("start \"\" \"C:\\Program Files\\Adobe\\Acrobat DC\\Acrobat\\Acrobat.exe\"");
                    salida.flush();
                    break;  
                case "Calculadora":
                    salida.println("calc");
                    salida.flush();
                    break;
                case "Word":
                    salida.println("start winword");
                    salida.flush();
                    break;
                case "Bloc de notas":
                    salida.println("notepad");
                    salida.flush();
                    break;
                default:
                    System.out.println("Erorr intorduciendo los datos" );
            }
            salida.flush();
            /*
            
            System.out.println("Introduce la ruta del directorio :" );
            String ruta=sc.nextLine();
            salida.println(ruta);
            salida.flush();
            System.out.println("Introduce el comando" );
            String comando = sc.nextLine();
            salida.println(comando);
            salida.flush();
            */
            
            salida.close();
        }catch(IOException e){
            System.err.println("erro: "+e.toString());
        }
    }
    
}
