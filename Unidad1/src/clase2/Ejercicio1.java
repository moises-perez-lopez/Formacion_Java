/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/* 
        Antes se empezaba por la programacion de la interfaz, en Java se empieza diseñando las clases de la logica del negocio
        las clases que actuan solo con los datos en memoria y en cada clase se refleja un concepto o entidad. En este caso la
        entidad CuentaBancaria. Por lo tanto lo primero definir las variables, sus correspondientes metodos get/set y las operaciones
        que nos pide el enunciado. 
        Si una variable tiene get y set, se dice que existe la propiedad con el nombre de la variable. Por ejemplo la propiedad
        "numeroCuenta".
        1º Para separar bien los conceptos en este primer ejemplo, vamos a crear la clase Consola que se va a encargar de mostrar
        los datos por pantalla, aunque valdría directamente desde la clase Principal. Otros de los conceptos de la programcion 
        orientada a objetos, es la separacion entre 3 tipos de clases. 

        - Las CLASES DE LA LOGICA DEL NEGOCIO no tienen ninguna instruccion de interfaz de usuario ni ninguna instruccion de acceso directo 
          a las variables que existen en memoria. 
        - Las clases de INTERFAZ de usuario, son las encargadas de la interaccion con el usuario (en nuestro caso la clase Consola). 
        - La ultima capa son las clases de ACCESO A DATOS que se encargan de acceder directamente a los almacenes fisicos de datos. 

        2º Las clases de INTERFAZ DE USUARIO, utilizan directamente las clases de LA LOGICA DEL NEGOCIO
           Las clases de LA LOGICA DEL NEGOCIO, utilizan direcamente las clase de ACCESO A DATOS.
        3º En la clase Consola vamos a escribir o leer un mensaje con los datos requeridos en cada caso, para ello creamos un metodo escribir()
        que no devuelve ningun dato como tal, solo va a escribir por la consola de NetBeans y un metodo para leer datos por teclado 
        que vamos a llamar leerLinea().
        4º Cuando se crean variables a nivel de la clase estas se llaman variables de instancia. Si le ponemos el atributo
        static, pasan a ser variables estaticas o variables compartidas. Cuando se crean variables a nivel de la clase tanto
        static como no static, siempre se les da por defecto un valor inicial a las variables, pero no ocurre lo mismo con las 
        variables creadas dentro de un metodo y estas tienen un valor indeterminado. 
        5º Vamos a crear una variable del tipo CuentaBancaria dentro de la clase Consola. Como esta en otro paquete, habra que 
        indicarle al compilador donde se encuentra la clase mediante la instruccion import con la ruta de la clase que nos
        interesa y creamos un objeto de la clase CuentaBancaria a la que le asignamos el nombre que queramos por teclado y luego 
        lo mostramos por pantalla. 
        6ºLos metodos get/set permiten realizar una validacion del valor de las respectivas variables que me estan pasando 
        desde la clase Consola, antes de guardarlo en memoria, por ejemplo para que no pueda asignar a la variable nombreTitular
        "·$%&·$%&%&" que evidentemente no es un nombre de persona valido.
*/

public class Ejercicio1 {

   
}
