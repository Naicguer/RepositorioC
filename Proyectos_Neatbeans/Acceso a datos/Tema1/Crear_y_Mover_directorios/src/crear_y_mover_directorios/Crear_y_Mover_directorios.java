package crear_y_mover_directorios;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class Crear_y_Mover_directorios {

   
    public static void main(String[] args) {
       
        
        boolean fin = false;
        String decision;
        
        
        do{
        System.out.println("Sleeciona que desas hacer");
        System.out.println("Quieres crear archivos escribe (crear)");
        System.out.println("Quieres ver la utima modificacion (revisar)");
        System.out.println("Quieres mover archivos (mover)");
        System.out.println("Si desea cerrar el programa ponga (fin)");
        
        decision=sc.nextLine();
        switch(decision){
            case "crear":
                System.out.println("Se a selecionado crear");
                crearArchivos();
            break;
            case "revisar":
                System.out.println("Se a selecionado revisar");
                ultModific();
            break;
            case "mover":
                System.out.println("Se a selecionado mover");
                moverCarp();
            break;
            case "fin":
                System.out.println("finalizando programa");
                fin =true;
            break;
            default:
                System.out.println("datos intorducidos errorenos ");
              
        }
        }while(fin==false);
        sc.close();
    }
    public static Scanner sc = new Scanner(System.in);
    private static void moverCarp(){
        System.out.println("Introduce el nombre de archivo que quieres mover");
        String arch= sc.nextLine();
        File movArch = new File(arch);
        System.out.println("Escribe la nueva ruta");
        String ruta =sc.nextLine();
        if(movArch.renameTo(new File(ruta))){
            movArch.delete();
            System.out.println("Se movio correctamente ");
        }
        return;
    }
    private static void ultModific(){
        File f = new File("C:\\temp");
        File[] ficheros =f.listFiles();
        
        
        for(File archivo:ficheros ){
            long fichMod = archivo.lastModified();
            Date fecha =new Date(fichMod);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm aa");
            String FormatoFecha =formato.format(fecha);
            System.out.println("Ultima modificacion de "+archivo.getName()+" : "+ FormatoFecha);
        
            
        }
        return;
    }
    private static void crearArchivos() {
        System.out.println("Ingrese la ruta de los archivos");
        String rutaDirec ="C:\\temp";
        System.out.println("Cantidad ?");
        int cantArchivos=sc.nextInt();
        
        sc.nextLine();
        
        File[] archivos  = new File[cantArchivos];
        
        for(int i=0; i<cantArchivos;i++){
            System.out.println("Ingresa el nombre del archivo "+(i+1));
            String nombreArch=sc.nextLine();
            
            File archivo = new File(rutaDirec,nombreArch);
            
            try{
                if(archivo.createNewFile()){
                    System.out.println("Archivo creado crrectamente: "+archivo.getName());
                }else{
                    System.out.println("El archivo ya existe.");
                    
                }
            }catch(IOException e){
                System.out.println("Error al crear el archivo: "+e.getMessage());
                return;
            }
            archivos[i]=archivo;
           
        }
        return;
    }
    
}

