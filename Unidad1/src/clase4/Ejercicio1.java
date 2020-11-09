/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author moises
 */
public class Ejercicio1 {
    
    /*
    
    CLASE DE LA LÓGICA DEL NEGOCIO --> Calculadora. La calculadora debe permitir introducir inputs (números y operador) para ir
    almacenándolos y a continuación realizar la operación.
    
    - Método addNumero()
    - Método addOperacion()
    - Método getResultado() --> Devuelve 0 si la coleccion items esta vacia, y sino retorna el valor calculado en el método calcular()
    - Método limpiar() --> Limpia los valores almacenados
    - Método calcular() --> El primer elemento del ArrayList va a ser un numero, validaremos despues si los datos que nos meten 
        son correctos (Por ahora metemos el numero entero en una posicion del ArrayList,tenga uno o mas digitos). Recuperamos el 
        primer valor del ArrayList y lo asignamos en una variable valor. A continuación recorresmos el ArrayList comprobando si el 
        elemento leído es un número o una operación.
        Si es una operacion : 
            - NEGATIVO: Se aplica sobre el valor previo del resultado.
            - MULTIPLICACION. Multiplicar el resultado almacenado por el siguiente elemento al de la operación del ArrayList 
            - SUMA y RESTA. 
        Analizar bien los aumentos del i, teniendo en cuenta si la operacion es unaria o no en el bucle que va 
        analizando los elementos del ArrayList. 
    
        Finalmente el método tiene que devolvver la variable VALOR.
    
    CLASE CON ENUMERACIÓN DE LAS OPERACIONES DISPONIBLES --> TipoOperacion : SUM, RESTA, MULTIPLICACION, NEGACIÓN.
    
    CLASE ITEM --> Clase que encapsula números y tipo de operación, para poder añadir al ArrayList objetos de esta clase
    
    - Variable boolean que indique si lo que tengo almacenado hay que interpretarlo como un Número o Tipo de operación.
    - Constructor para pasar operación y esNumero = false 
    - Constructor para pasar operación y esNumero = true
    - getEsNumero
    - getValores del ArrayList
    
    */
    
    public static void main(String[] args) {
        
        Calculadora cal = new Calculadora();
        cal.addNumero(3);
        cal.addOperacion(TipoOperacion.SUMA);
        cal.addNumero(2);
        cal.addOperacion(TipoOperacion.MULTIPLICACION);
        cal.addNumero(3);
        cal.addOperacion(TipoOperacion.RESTA);
        cal.addNumero(2);
        cal.addOperacion(TipoOperacion.SUMA);
        cal.addNumero(21);
        cal.addOperacion(TipoOperacion.NEGACION);
        
        System.out.println(cal.getResultado());

    }
}
