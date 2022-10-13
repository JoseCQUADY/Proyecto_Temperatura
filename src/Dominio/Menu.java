

package Dominio;
import java.util.*;
import javax.swing.JOptionPane;



public class Menu {
    
    private Scanner valor;
    private int opcion;
    private Mes promedio_mensual;
    private Mes promedio_anual;
    private Promedios temp_max;
    private Promedios tem_min;
    
    
    public void leer_opcion(){
       valor = new Scanner(System.in);
       System.out.println("Ingrese su opción: ");
       opcion = valor.nextInt();
       //Aqui quiero validar las entradas :deben ser 1) , 2) y 3) las opciones
       
     
    }
    
    public void Imprimir_opciones(){
       JOptionPane.showMessageDialog(null, "Bienvenido Usuario \n Tus tres opciones a elegir son: \n 1)Imprimir promedio mensual\n 2)Imprimir promedio anual \n 3)Imprimir temperatura máxima y mínima de un mes");
     
    }
    
    
    
    
}
