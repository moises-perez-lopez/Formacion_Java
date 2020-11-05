/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author moises
 */
public class Ejercicio1 {
    
    /*
    
        Vamos a crear un Array para establecer el historial de objetos de tipo Movimiento que vamos a crear en la clase CuentaBancaria.
   
        Un array NO se puede redimensionar directamente y se define así:
        tipoVariable [] nombreVariable = new tipoVariable[tamañoArray];
        Movimiento_ej1 [] arrayMovimientos = new Movimiento_ej1 [100];
    
        Para mostrar por pantalla el valor de un Array:
        System.out.println(Arrays.toString(nombreArray));
    
        1º  Crear un Array de objetos de tipo Movimiento con tamaño 100. Cada vez que se cree un objeto de CuentaBancaria, es decir una
            cuenta de un cliente, se va a crear un Array para almacenar 100 movimientos asociados a esa cuenta. Cada una de las celdas
            del Array se inicializan a null.
        
        2º  Cada vez que se realiza un ingreso o un reintegro, se crea un objeto Movimiento con los datos correspondientes y a continuación
            se almacena en el Array. Para asignarle la fecha actual, basta con instanciar un objeto Date. Para saber la posición en la que 
            se debe almacenar en el Array, necesitamos un contadorHistorial que iremos incrementando cada vez que se almacene un dato en el
            Array. Si nos pasamos de 100 elementos, el programa lanzará una excepción
    
    */
}
