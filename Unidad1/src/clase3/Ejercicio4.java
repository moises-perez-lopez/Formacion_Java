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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        /*
        
        La clase ArrayList es más útil que la clase Array:
       
        - Redimensiona automáticamente el tamaño del Array
        - Se le puede especificar el tipo de los elementos de cada celda
        - Este tipo va dentro de ángulos
        - Tiene un método add() que permite añadir elementos en orden, se aumenta el índice de forma automática.
        
        Se crea el ArrayList en la clase CuentaBancaria. Si queremos seguir controlando la dimensión máxima del Array tendremos 
        que hacerlo mediante código, no en el constructor como hacíamos antes. 
        
        Hasta el momento uno de los valores de cada objeto Movimiento, es el tipo que tenemos definido como un String por lo que acepta
        cualquier valor que asignemos. Lo interesante, es que acepte solo ciertos valores. Para ello se utilizan las enumeraciones. Es una
        forma de crear un nuevo tipo de dato con un rango de posibles valores (ingreso, reintegro, tranferencia, cierre).
        
        Para crear una enumeración, dentro del paquete ejemplo4, crearemos una enumercación de TipoMovimiento. Las enumeraciones realmente
        son clases y por lo tanto pueden tener un constructor, pero este ha de ser obligatoriamente private para que no se puedan crear
        más objetos que los correspondientes a las constantes. 
        El único problema de las enumeraciones, es que aceptan valor nulo debido a que las constantes de las enumeraciones son objetos y 
        por lo tanto deberemos comprobar por código antes de asignar el valor si es o no es nulo.
        
        */
        
        CuentaBancaria_ej4 cuenta = new CuentaBancaria_ej4();
        cuenta.ingresa(3.4);
        System.out.println("Saldo 1 " + cuenta.getSaldo());
        cuenta.reintegra(2.3);
        System.out.println("Saldo 2" + cuenta.getSaldo());

    }
}
