
package Dominio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;


 //Aqui leí el texto con filereader y stringtokenizer, falta ponerle 30 como i
public class Archivos {

    private FileReader archivo;
    private BufferedReader lector;
    private float[] datos;
    private Archivos leer;

    
    public String Leer_txt(){
        
        String texto = "";
        
        leer = new Archivos();
        String cadena;
        
        try {
          archivo = new FileReader("C:\\Users\\You\\Desktop\\Texto\\archivo.txt"); 
          String temp = "";
          if(archivo.ready()){
           lector = new BufferedReader(archivo);  
           
          
           while((cadena = lector.readLine()) != null){
 
                temp = temp + cadena;
              
           }  
          }else{
              System.out.println("El archivo no está listo para ser leido");
          }    
          
          
      texto = temp;    
    } 
    catch (IOException e) {   
        System.out.println("Error : " + e.getMessage());   
    }  
        return texto;
     }
    
     public float[] Strigtokenizer(){
         
         StringTokenizer tokens = new StringTokenizer(leer.Leer_txt(), " ");
               int nDatos = tokens.countTokens();
               datos = new float[nDatos];
       
      
                int i = 0;
                
                while(tokens.hasMoreTokens()){
                   String str=tokens.nextToken();
                   datos[i]=Float.parseFloat(str);
 
                   i++;         
               }
        
         return datos;       
                
     }  
    

    
    
    
    
    
    
    
    
    
}
    
    