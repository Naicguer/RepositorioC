/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos.pkg2;

/**
 *
 * @author Naicguer
 */
public class Sumador {
        
    public static int sumar(int numero1,int numero2){
        
        int suma=0;
        
        for (int i = numero1; i<= numero2; i++){
            suma+=i;
        }
        
        return suma;
        
    }
    public static void main(String[] args){
        
        int numero1=Integer.valueOf(args[0]);
        int numero2=Integer.valueOf(args[1]);
        
        int suma = sumar( numero1, numero2);
    }
}
