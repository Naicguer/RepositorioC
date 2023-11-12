
package recorrer_letra_h;

import java.io.*;
import java.util.Date;

public class Recorrer_Letra_h {

    
    public static void main(String[] args){
        
        try{
            //crear directorio h 
        File Directo = new File("C:\\temp\\H");
        Directo.mkdirs();
        File A1 = new File("C:\\temp\\H\\Archivo1.txt");
        A1.createNewFile();
        File A2 = new File("C:\\temp\\H\\ContH.txt");
        A2.createNewFile();
        java.util.Date fecha = new Date();
        FileReader fr = new FileReader(A1);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        int num=0;
        int numH=0;
        String Datos;
            linea=br.readLine();
            
            for(int i=1;i<linea.length();i++){
                num++;
                char lineah = linea.charAt(num);
                if(lineah=='h'){
                 numH++;
                 
                }
            }
            Datos = "Hay "+ numH +" H en el dia "+ fecha ;
            try(FileWriter fw = new FileWriter(A2,true)){
             
            System.out.println("Hay "+ numH+" H el dia "+fecha);
            fw.write(Datos+"\r\n");
            
            System.out.println("los datos an sido mandados");
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
