
package Dominio;



public class Calculos {
 
    
    private float promedio_mensual;
    private float promedio_anual;
    private float min;
    private float max;
    
     public void promedio_mensual(int meses){
         
         Mes leer = new Mes();
         float [] m; 
          
         m = leer.leer_meses(meses);
         float promedio = 0;
         
         for(int i = 0; i<m.length;i++){
             promedio = promedio +m[i];   
         }
         
         promedio_mensual = promedio/m.length;
         
         System.out.println("El promedio del mes de "+ leer.Mes_letras(meses) + " es de : " + promedio_mensual );
            
     }
     
     public void promedio_anual(){
         Archivos archivo;
         archivo = new Archivos();
         float [] m;
         float promedio = 0;
         archivo.Leer_txt();
         m = archivo.Strigtokenizer();
          for(int i = 0; i<m.length;i++){
             promedio = promedio +m[i];   
         }
          promedio_anual = promedio/m.length;   
          System.out.println("El promedio anual es de : " + promedio_anual );
     }
     
     public void max_min(int meses) {
       Mes leer = new Mes();
       
       float max_1, min_1;
       
        max_1 = min_1 = leer.leer_meses(meses)[0];
       
       
       for (int i = 0; i < leer.leer_meses(meses).length; i++) {   
        if(leer.leer_meses(meses)[i] >max_1){
            max_1=leer.leer_meses(meses)[i];    
        }
        
        if(leer.leer_meses(meses)[i]<min_1){
            min_1=leer.leer_meses(meses)[i];  
        }    

       }      
       this.max = max_1;
       this.min = min_1;
       
       System.out.println("La temperatura máxima del mes de "+ leer.Mes_letras(meses) +" es de: " + max + " y la minima es de : " + min );
     }

    
  
     
     
     
     
}