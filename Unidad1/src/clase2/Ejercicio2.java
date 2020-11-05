/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import clase1.CuentaBancaria_ej2;
import iu.Consola_cl2_ej1;



public class Ejercicio2 {

    /*
    
        - NO STATIC (INSTANCIA)
        Las variables de una clase, suelen ser NO STATIC. Significa que son variables de instancia o de objeto y la idea es que
        cada vez que creo un objeto, se reserve memoria para cada una de las variables de instancia por lo que "duplican" zonas
        de memoria para cada una de ellas en cada objeto creado.
        
        - STATIC
        Si a nivel de una clase, creamos una variable que comparten todos los objetos creados de la misma con el mismo valor, 
        en vez de crearlo en todos los objetos, lo definimos como STATIC y solo se va a reservar una posición de memoria para ella
        permitiendo que la compartan todos los objetos. Por ejemplo, un tipo de interés que se mantiene para todas las cuentas
        bancarias.
    
        Un método STATIC no accede directamente a una variable NO STATIC. Los métodos no se guardan en los objetos, pero por cuestión
        de concepto se determina que los métodos STATIC son métodos comunes que trabajan en general sobre la clase. Un objeto
        Consola --> c1, no me va a dar acceso a los métodos definidos como STATIC.
        A través de una variable (objeto), en este caso c1, se accede a los miembros NO STATIC, mientras que a los miembros STATIC
        se accede directamente a través del nombre de la clase --> Consola.escribir()
    
        La idea es que los métodos NO STATIC estén relacionados con las variables NO STATIC, es decir, las de instancia y modifiquen 
        el valor de una variable NO STATIC concreta de ese objeto, no en general para todos los objetos.
    
        VARIABLE STATIC --> COMÚN PARA TODOS LOS OBJETOS
        METODO STATIC --> COMÚN PARA TODOS LOS OBJETOS
        ACCESO A MÉTODO STATIC --> NOMBRE DE LA CLASE : nombreClase.metodo
    
        VARIABLE NO STATIC --> PROPIA DE CADA OBJETO
        METODO NO STATIC --> PROPIO DE CADA OBJETO
        ACCESO A MÉTODO NO STATIC --> VARIABLE OBJETO : c1.metodo, siendo c1 una variable del tipo de la clase correspondiente
    
        Privacidad de variables:
    
        PUBLIC --> Acceso desde cualquier sitio
        Sin nada --> Acceso desde clases del mismo paquete
        PRIVATE --> Acceso solo desde la clase
    
    */
    
    public static void main(String[] args) {
        // ACESO A METODO STATIC
        CuentaBancaria_ej2 c = new CuentaBancaria_ej2();
        c.getNombreTitular();
   
        // ACCESO A VARIABLE Y METODO NO STATIC
        Consola_cl2_ej1.escribir("Prueba");
        CuentaBancaria_ej2.interes = 2;
        
    }
    
}
