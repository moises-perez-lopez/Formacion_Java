/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;


/*

    Tenemos una clase CuentaBancaria que me permite hacer ingresos, reintegros y consultar saldo. Si ahora queremos tener un 
    historia de movimientos de la cuenta, tenemos que crear otra clase Movimientos en la que se van a ir creando objetos con cada
    una de las operaciones que se hagan en la clase CuentaBancaria.
    Es decir, sigue valiendo el código de la clase CuentaBancaria pero en la clase Movimientos se genera un objeto cada vez que
    se produce un Movimiento con los siguientes datos: fecha, tipo de operación que se hace, la cantidad y como queda el saldo en 
    ese momento. Por lo tanto serán 4 variables de instancia.
    En el caso de la fecha, que es una clase especial, aquí no hay que pensar en cómo se lee o como se escribe. Estamos en una clase
    de la LÓGICA DEL NEGOCIO por lo que solo tenemos que pensar en los tipos de los datos para que se almacenen en memoria.
    Creamos las variables con cada uno de sus tipos y a continuación las propiedades de cada uno.
    Ya tenemos una clase a parte de CuentaBancaria en la que vamos a poder ir creando el objeto correspondiente a cada Movimiento.
    En la próxima clase veremos como ir creando un historial de la clase CuentaBancaria de objetos Movimiento cada vez que se
    produzca uno. Se va a utilizar un Array o ArrayList de objetos tipo Movimiento.

*/

public class Ejercicio3 {
    
}
