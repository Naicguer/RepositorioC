
package t5_ac1;

public class HiloTablaMultiplicar extends Thread {
    
    String Nombre;
    int Numero;
    int Dormir;
    
    public HiloTablaMultiplicar(String Nombre, int Numero, int Dormir) {
        this.Nombre = Nombre;
        this.Numero = Numero;
        this.Dormir = Dormir;
    }
            
    public void run(){
        System.out.println("Vamos  a ver que tal se reproduce tu tabla "+Nombre);
        for(int i=0;i<=10;i++){
            System.out.println(Numero+"X"+i+" = "+ Numero*i);
            try{
                sleep(Dormir);
            }catch(InterruptedException e){
                System.out.println("Error: "+e.toString());
            }
        }
    }
}
