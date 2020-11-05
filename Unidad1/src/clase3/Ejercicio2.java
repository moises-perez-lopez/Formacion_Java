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
public class Ejercicio2 {
    
    /* 
    
        Para fijar el número de elementos que va a tener el Array al crear cada objeto de CuentaBancaria, hay que hacer uso del 
        constructor para pasarle el número máximo de elementos. 
        Tendremos dos constructores, uno con parámetro y otro sin él y el constructor sin parámetro llamará a su vez al constructor
        con parámetro, para tener concentrado en el constructor con más parámetros las validaciones que puedan ser necesarias a la
        hora de crear el objeto. 
    
        Llamada desde el constructor sin argumentos al constructor con argumentos:  this(elementos_del_array)
    
        El valor máximo por defecto, lo vamos a definir mediante una constante. La instrucción this debe ser la primera en 
        ejecutarse y si no definimos la constante como STATIC se va a producir un error de compilación. Esto se produce porque la 
        asignación de los bloques anónimos para las constantes no se realizaría previamente y daría error. La variable la llamaremos MAX_MOVIMIENTOS
    
    */
    
    public static void main(String[] args){
        
        CuentaBancaria_ej2 cuenta = new CuentaBancaria_ej2(3);
    }
    

}
