
package Dominio;

import java.util.Arrays;


public class Mes {

    float [] mes_1 ;
    int dias = 30;
    String mes_letras;
    
    
    
        
      public float[] leer_meses(int meses){
       
        Archivos archivo;
        mes_1 = new float[0];
        archivo =  new Archivos();
        archivo.Leer_txt();
        archivo.Strigtokenizer();
       
        switch(meses){
            case 1 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), 0, dias);
            case 2 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias,dias*2);
            case 3 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*2,dias*3);
            case 4 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*3,dias*4);
            case 5 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*4,dias*5);
            case 6 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*5,dias*6);
            case 7 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*6,dias*7);
            case 8 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*7,dias*8);
            case 9 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*8,dias*9);
            case 10 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*9,dias*10);
            case 11  -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*10,dias*11);
            case 12 -> mes_1 = Arrays.copyOfRange(archivo.Strigtokenizer(), dias*11,dias*12);
            default -> {
            }
        }
        
        return mes_1;
     }
    
    public String Mes_letras(int meses){
        switch(meses){
            case 1 -> mes_letras = "Enero";
            case 2 -> mes_letras = "Febrero";
            case 3 -> mes_letras = "Marzo";
            case 4 -> mes_letras = "Abril";
            case 5 -> mes_letras = "Mayo";
            case 6 -> mes_letras = "Junio";
            case 7 -> mes_letras = "Julio";
            case 8 -> mes_letras = "Agosto";
            case 9 -> mes_letras = "Septiembre";
            case 10 -> mes_letras = "Octubre";
            case 11 -> mes_letras = "Noviembre";
            case 12 -> mes_letras = "Diciembre";
            default -> {
            }
        }
        return mes_letras;
        
    }
      
}
