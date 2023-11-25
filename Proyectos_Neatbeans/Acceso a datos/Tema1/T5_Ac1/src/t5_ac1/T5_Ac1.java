/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5_ac1;

import java.util.Scanner;

/**
 *
 * @author Naicguer
 */
public class T5_Ac1 {

   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        int n1;
        int dormir;
        
        System.out.println("Introduce tu nombre");
        name=sc.nextLine();
        
        System.out.println("Introduce el numero que quieres multiplicar");
        n1=sc.nextInt();
        
        System.out.println("Introduce el intervalo que salen los numeros recuerda que 1000 = 1 S");
        dormir=sc.nextInt();
        
        HiloTablaMultiplicar tabla1= new HiloTablaMultiplicar(name,n1,dormir);
        
        tabla1.start();
    }
    
}
