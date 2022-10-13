
package Dominio;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
 //Aqui leí el texto con filereader y stringtokenizer, falta ponerle 30 como i
public class Archivos {

    private FileReader archivo;
    private BufferedReader lector;
    private String cadena;

    
    public void Leer_txt(){
    
        try {
          archivo = new FileReader("C:\\archivo.txt"); 
          
          if(archivo.ready()){
           lector = new BufferedReader(archivo);    
           
           
    
           while((cadena = lector.readLine()) != null){
               
               String strDatos = cadena;
               StringTokenizer tokens = new StringTokenizer(strDatos, " ");
               int nDatos = tokens.countTokens();
               double[] datos=new double[nDatos];
            
               int i=0;
            
               while(tokens.hasMoreTokens()){
            
            
                   String str=tokens.nextToken();
                   datos[i]=Double.parseDouble(str);
                   System.out.println(datos[i]);
                   i++;
           
               }
           }
         
          }else{
              System.out.println("El archivo no está listo para ser leido");
          }    
    } 
    catch (IOException e) {   
        System.out.println("Error : " + e.getMessage()); 
    }  
    
  
}

  
}



