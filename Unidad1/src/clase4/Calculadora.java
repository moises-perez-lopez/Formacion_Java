/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.ArrayList;

/**
 *
 * @author moises
 */
public class Calculadora {
    
   private ArrayList<Item> lista = new ArrayList<Item>();
   
   public void addNumero(double valor){
       lista.add(new Item(valor));
   }
   
   public void addOperacion(TipoOperacion operacion){
       lista.add(new Item(operacion));
   }
   
   public void limpiar(){
       lista.clear();
   }
   
   public double getResultado(){
       if (lista.isEmpty()){
           return 0.0;
       }else{
           return calcular();
       }
   }
   
   
   private double calcular(){
       double resultado = lista.get(0).getValor();
       for (int i=1; i<lista.size();i++){
           if (! lista.get(i).isEsNumero()){
               TipoOperacion tipo = lista.get(i).getTipo();
               switch (tipo){
                   case SUMA :
                   resultado = resultado + lista.get(i+1).getValor();
                   i++;
                   break;
                   case RESTA :
                   resultado = resultado - lista.get(i+1).getValor();
                   i++;
                   break;
                   case MULTIPLICACION :
                   resultado = resultado * lista.get(i+1).getValor();
                   i++;
                   break;
                   case NEGACION:
                   resultado = -resultado;
                   break;
               }
                       
           }
       }
       return resultado;
   }
    
}
