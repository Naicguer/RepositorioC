package procesos;

import java.io.*;

public class Procesos {

    
    public static void main(String[] args) {
    
        String ruta = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        
        ProcessBuilder ejecutar = new ProcessBuilder(ruta);
        
        try{
            
           Process proceso=ejecutar.start();
           int devolver = proceso.waitFor();
           System.out.println("La ejecucion de "+ruta+" devuelve "+devolver);
           
        }catch(IOException e){
            
            System.err.println("Error"+e.toString());
            System.exit(-1);
            
        }catch(InterruptedException e){
            
            System.err.println("El proceso hijo afinalizo de forma iuncorrecta");
            System.exit(-1);
            
        }
        
        
    }
    
}
