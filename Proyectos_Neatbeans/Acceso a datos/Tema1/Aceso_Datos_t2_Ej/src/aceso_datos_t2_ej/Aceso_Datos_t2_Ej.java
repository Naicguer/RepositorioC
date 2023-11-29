/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceso_datos_t2_ej;

import java.io.*;

public class Aceso_Datos_t2_Ej {

    
    public static void main(String[] args) {
        PipedOutputStream salida = new PipedOutputStream();
        PipedInputStream entrada = new PipedInputStream();
        Thread escritor = new Thread(new Escritor(salida));
        Thread lector = new Thread(new Lector(entrada));
        escritor.start();
        lector.start(); 
    }
}

    class Escritor implements Runnable{
        
        private PipedOutputStream salida;
        
        public Escritor(PipedOutputStream salida){
            this.salida=salida;
        }
        
        @Override
        public void run(){
            try{
                for(int i = 1;i<=5;i++){
                    salida.write(i);
                    System.out.println("Escrito: "+i);
                    Thread.sleep(1000);
                }
                salida.close();
            }catch(IOException | InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    class Lector implements Runnable{
        private PipedInputStream entrada;
        
        public Lector(PipedInputStream entrada){
            this.entrada = entrada;
        }
        
        @Override
        public void run(){
            try{
                int dato;
                while ((dato = entrada.read())!= -1){
                    System.out.println("leido: "+dato);
                }
                entrada.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }