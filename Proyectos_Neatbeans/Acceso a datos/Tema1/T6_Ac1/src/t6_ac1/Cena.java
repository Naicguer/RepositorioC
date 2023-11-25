/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ac1;

/**
 *
 * @author Naicguer
 */
public class Cena {
    private Tenedor tenedores[];
    private int comensales=5;

    public Cena(){
    tenedores = new Tenedor[comensales];
    for(int i = 0; i<5;i++){
        tenedores[i]=new Tenedor(i);
        }
    }
    
    public Tenedor getTenedor(int numero){
        return tenedores[numero];
    }
    
    public int getTenedorDer(int numero){
        return ( numero+1)%comensales;
    }
    public int getTenedorIzq(int numero){
        return numero;
    }
}
