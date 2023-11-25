/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ac2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Naicguer
 */
public class T5_Ac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        String nombre;
        int numero;
        
        
        
        HiloMuestraNumero[] Hilos ;
        
        Hilos= new HiloMuestraNumero[10];
        
        for(int i = 0;i<10;i++){
            
            System.out.println("Intyroduce el nombre del hilo");
            nombre=sc.nextLine();
           
            System.out.println("Intyroduce el numero del hilo");
            numero=sc.nextInt();
            sc.nextLine();
            Hilos[i]=new HiloMuestraNumero(nombre,numero);
            
        }
        
        for(HiloMuestraNumero hilo:Hilos){
            
            hilo.start();
        }
        
        
    }
    
}
