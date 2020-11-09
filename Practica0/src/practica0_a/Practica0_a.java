/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0_a;

/**
 *
 * @author moises
 */
public class Practica0_a {

    /*
    
    Crear una clase Consola con los métodos estáticos:
    
    - leerLinea() --> para leer un dígito del teclado
    - acertar() --> para mostrar por pantalla que se ha acertado el número
    - pasar(int apuesta, int numCorrecto) --> el número introducido es mayor en x unidades
    - corto(int apuesta, int numCorrecto) --> el número introducido es menor en x unidades
    
    Desde el método main de esta clase, 
    - Se genera un número aleatorio
    - Se solicita al usuario que escriba un número para ver si acierta
    - Si el número que inserta es igual al número aleatorio se muestra el mensaje correspondiente
    - Si el número que inserta es mayor que el número aleatorio se muestra el mensaje correspondiente
    - Si el número que se inserta es menor que el número aleatorio se muestra el mensaje correspondiente
    - Se ejecuta este bucle hasta que el usuario acierte el número
    
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int apuesta;
        int a;
        int numCorrecto;
        java.util.Random random=new java.util.Random();
        numCorrecto = (random.nextInt(10)+1);
        
        do {
            apuesta = Consola.leerLinea();
            if (apuesta == numCorrecto){
                a = Consola.acertar();
            }else 
                if (apuesta > numCorrecto){
                    a = Consola.pasar(apuesta,numCorrecto);
                }else
                    a = Consola.corto(apuesta, numCorrecto);
                
        } while (a != 1);
    }
    
}
