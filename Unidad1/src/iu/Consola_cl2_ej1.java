/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import clase1.CuentaBancaria_ej2;
import java.util.Scanner;

/**
 *
 * @author moises
 */
public class Consola_cl2_ej1 {
    /**
    * @param args the command line arguments
    */
    
    public static void main(String[] args) {
        
        CuentaBancaria_ej2 cuenta = new CuentaBancaria_ej2();
        cuenta.setNombreTitular(leerLinea("Escribe el nombre del titular de la cuenta"));
        System.out.println("El nombre del titular es: " + cuenta.getNombreTitular());
        
    }
    
    public static String leerLinea(String texto){
        escribir(texto);
        return (new Scanner(System.in)).nextLine();
    }
    
    public static void escribir(String texto){
        System.out.println(texto);
        
    }
}
