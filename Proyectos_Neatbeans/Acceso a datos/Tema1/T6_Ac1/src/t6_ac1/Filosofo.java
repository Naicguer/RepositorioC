/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6_ac1;

/**
 *
 * @author Naicguer
 */
public class Filosofo implements Runnable {
    private Thread hilo;
    protected Cena cena;
    protected int tizq,tder;
    protected int numero;

    public Filosofo(int x,Cena cena) {
        this.numero=x;
        this.cena = cena;
        tizq=cena.getTenedorIzq(numero);
        tder=cena.getTenedorDer(numero);
        hilo = new Thread(this);
    }
    public void pensar(){
        try{
            System.out.println("Filosofo "+numero+"pensando");
            int espera = (int) (Math.random()*100);
            hilo.sleep(espera);
            System.out.println("filosofo :"+numero+"tiene hambre");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public void tomaTenedores(){
        System.out.println("Tomando tenedores");
        Tenedor t1 = cena.getTenedor(tizq);
        Tenedor t2 = cena.getTenedor(tder);
        t1.usar();
        t2.usar();
    }
    
    public void comer(){
        try{
            System.out.println("Filosofo "+numero + " esta comiendo");
            int espera = (int) (Math.random()*100);
            hilo.sleep(espera);
            System.out.println("filosofo :"+numero+"esta satisfecho");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public void dejarTenedores(){
        System.out.println("Solatando los tenedores");
        Tenedor t1 = cena.getTenedor(tizq);
        Tenedor t2 = cena.getTenedor(tder);
        t1.dejar();
        t2.dejar();
    }
    
    public void run(){
        while(true){
            pensar();
            tomaTenedores();
            comer();
            dejarTenedores();
        }
    }
}
