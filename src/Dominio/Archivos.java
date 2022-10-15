
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
    double[] datos;
    double[] guardar_datos;
    private Archivos leer;
    private Mes meses;
    private double sacar_promedio;
    private double promedio = 0;
    
    

    
    public void Leer_txt(){
        leer = new Archivos();
        
        
        try {
          archivo = new FileReader("C:\\Users\\You\\Desktop\\Texto\\archivo.txt"); 
          
          if(archivo.ready()){
           lector = new BufferedReader(archivo);    
          
           while((cadena = lector.readLine()) != null){
 
               String strDatos = cadena;
               StringTokenizer tokens = new StringTokenizer(strDatos, " ");
               int nDatos = tokens.countTokens();
               datos = new double[nDatos];
       
      
                int i = 0;
                
                while(tokens.hasMoreTokens()){
                   String str=tokens.nextToken();
                   datos[i]=Double.parseDouble(str);
                    
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
    

    public void leer_meses(){
         
        meses = new Mes();
         int k = 0;
        for (int j = 0 ; j <= meses.getDias() ; j++ ){
                    
          System.out.println(datos[j]);
         
         if(j == 4){
             promedio  = datos[j] + promedio;   
             k++;
         }else if(j > 4 && j <= 6){
             promedio  = datos[j] + promedio;   
             k++;
         }
         
             
   
         
         }
        
        sacar_promedio = promedio/k ;
        
        System.out.println(sacar_promedio);
      
    
    }

    
}
    
    