/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/* 
        1º Vamos a crear un metodo que reciba como datos de entrada dos numeros y devuelva el resultado de la suma
        inputs : 2 numeros
        output : suma
        Para LEER datos de teclado : (new java.util.Scanner(System.in)).METODO_PARA_CADA_TIPO_DE_DATOS;


*/
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a, b;
        System.out.println("Introduzca el primer sumando");
        a = (new java.util.Scanner(System.in)).nextDouble();
        System.out.println("Introduzca el segundo sumando");
        b = (new java.util.Scanner(System.in)).nextDouble();
        System.out.println("El resultado es: " + suma(a,b));
    }
    
    public static double suma(double a, double b){
      double resultado;  
      resultado = a + b;
      return resultado;
    }
    
}
