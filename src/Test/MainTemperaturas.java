
package Test;

import Dominio.Archivos;
import Dominio.Menu;
import java.util.*;


public class MainTemperaturas {

    
    public static void main(String[] args) {
      
        
        Archivos a = new Archivos();
        a.Leer_txt();
        
        Menu menu = new Menu();
        menu.Imprimir_opciones();
        menu.leer_opcion();
        
       
        
        
        
        
        

        }    
    }
    
