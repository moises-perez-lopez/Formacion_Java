/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/* 

        1º Tengo que crear un programa para gestionar cuentas bancarias. Cada una debe almacenar el nombre del titular,
        el numero de cuenta y el saldo de la cuenta. El programa debera permitir asgignar los datos, hacer ingresos, 
        reintegros y recuperar el saldo actual. 
        2º La clase CuentaBancaria solo va a tener instrucciones que trabajen en memoria, no va a tener ni una sola instruccion
        que solicite datos por teclado ni que muestre datos por consola. Este debera ser siempre el primer paso, crear la o las
        clases que trabajan solo en memoria que son las CLASES DE LA LOGICA DEL NEGOCIO. La interfaz de usuario viene a continuacion,
        podra ser una aplicacion de consola con un menu, una aplicacion grafica o paginas web que son las que gestionaran
        los datos de la clase CuentaBancaria, pero primero hay que crear esta clase que manipule datos en memoria, ficheros o datos
        de una base de datos. 
        3º Si pensamos en CuentaBancaria como un bloque habrá unos inputs y unos outputs. La manera de reflejar esto en las
        clases es diferente a los metodos. En la clase, los inputs van a ser los datos de entrada a asignar (nombre del titular,
        el numero de la cuenta y el saldo). Las operaciones de hacer ingresos, reintegros y recuperar el saldo actual son metodos.
        4º Definimos en la clase las variables que nos piden en el enunciado, sus get y set correspondientes y los metodos
        que nos piden en el enunciado: ingresa(),reintegra() y recuperar el saldo actual que se corresonde con getSaldoCuenta()


 */

public class Ejercicio2 {
    
    /**
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        
        CuentaBancaria_ej2 cuenta = new CuentaBancaria_ej2();
        cuenta.setNombreTitular("Moisés Pérez López");
        cuenta.setNumeroTitular("123456");
        cuenta.setSaldo(22.34);
        
        System.out.println("Los titulares son: " + cuenta.getNombreTitular());
        System.out.println("Los Numeros son: " + cuenta.getNumeroTitular());
        System.out.println("El saldo es: " + cuenta.getSaldo());
        
        cuenta.ingresa(20);
        System.out.println("El saldo después del ingreso es: " + cuenta.getSaldo());
        
        cuenta.reintegra(30);    
        System.out.println("El saldo después del reintegro es: " + cuenta.getSaldo());
        
    }
}
