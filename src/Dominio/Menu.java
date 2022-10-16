

package Dominio;
import javax.swing.JOptionPane;



public class Menu {
    private int opcion_menu;
    private int opcion_submenu;
            
    
   public void Imprimir_opciones(){
       JOptionPane.showMessageDialog(null, "Bienvenido Usuario \n Tus tres opciones a elegir son: \n 1)Imprimir promedio mensual\n 2)Imprimir promedio anual \n 3)Imprimir temperatura máxima y mínima de un mes");
    }
       
    public void leer_opciones_menu(){
   
       opcion_menu =Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion : 1/2/3"));
       
       while(opcion_menu != 1 && opcion_menu != 2 && opcion_menu != 3){
       JOptionPane.showMessageDialog(null, "Ingresa una opción correcta de tipo : 1/2/3");
       opcion_menu =Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion: 1/2/3")); 
       } 
       
       if(opcion_menu == 1){
           opcion_submenu =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes de su preferencia: 1-12")); 
            while(opcion_submenu > 12){
                JOptionPane.showMessageDialog(null, "Ingresa una opción correcta");
                opcion_submenu =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes de su preferencia: 1-12"));
            } 
        }else if(opcion_menu == 3){
         opcion_submenu =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes de su preferencia: 1-12"));
         while(opcion_submenu > 12){
                JOptionPane.showMessageDialog(null, "Ingresa una opción correcta");
                opcion_submenu =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes de su preferencia: 1-12"));
            }
        }
       
       
       
    }
     public void arrojar_respuestas(){
       
        Calculos calculos = new Calculos();
     
        switch (opcion_menu) {
            case 1 -> calculos.promedio_mensual(opcion_submenu);
            case 2 -> calculos.promedio_anual();
            case 3 -> calculos.max_min(opcion_submenu);
            default -> {
            }
        }    
    
     
         
    }
   
   
   
  
    
  
    
   

   
    
    
    
    
    
    
    
}
