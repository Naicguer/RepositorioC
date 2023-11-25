/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6_ac1;

/**
 *
 * @author Naicguer
 */
public class Filosofos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cena de los Filosofos");  
        Cena cena = new Cena();
        for(int i=0;i<5;i++){
            Filosofo pensante = new Filosofo(i,cena);
            Thread hilo=new Thread(pensante);
            hilo.start();
        }
        
    }
    
}
