
package procesos.pkg2;

import java.io.*;
import java.util.*;

public class Procesos2 {

    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int numero1,numero2;
        
        System.out.println("Dame un numero");
        numero1=sc.nextInt();
        System.out.println("Dame otro numero");
        numero2=sc.nextInt();
        
        try{
            
        int estado_ejecucion = ejecutarClaseProceso(Sumador.class, numero1, numero2);
        
        if (estado_ejecucion==0){
            System.out.println("Procesos ejecutado correctamente.");
        }else{
            System.out.println("Error ejecutado el proceso");
        }
        }catch(IOException | InterruptedException ex){
            System.err.println("Error: "+ex.toString());
            System.exit(-1);
        }
        
    }
    
    public static int ejecutarClaseProceso(Class clase , int n1 ,int n2)throws IOException, InterruptedException{
        
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator+ "bin" + File.separator + "java";
        
        String classpath=System.getProperty("java.class.path");
        String className=clase.getCanonicalName();
        
        ProcessBuilder builder = new ProcessBuilder(javaBin, "-cp",classpath,className,String.valueOf(n1),String.valueOf(n2));
        
        builder.redirectError(new File("Errores.txt"));
        builder.redirectOutput(new File("Errores.txt"));
        
        Process process = builder.start();
        process.waitFor();
        return process.exitValue();
        
       
    }
    
}
