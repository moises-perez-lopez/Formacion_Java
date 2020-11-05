/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Date;

/**
 *
 * @author moises
 */
public class CuentaBancaria_ej1 {
    public static double interes = 0.01;
    private String nombreTitular;
    private String numeroTitular;
    private double saldo;
    private Integer contadorHistorial = 0;
    private Movimiento_ej1 [] arrayMovimientos = new Movimiento_ej1 [100];

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroTitular() {
        return numeroTitular;
    }

    public void setNumeroTitular(String numeroTitular) {
        this.numeroTitular = numeroTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void ingresa(double ingreso){
        saldo = saldo + ingreso;
        Movimiento_ej1 mov = new Movimiento_ej1();
        mov.setFecha(new Date());
        mov.setOperacion("Ingreso");
        mov.setCantidad(ingreso);
        mov.setSaldo(saldo);
        arrayMovimientos[contadorHistorial++] = mov;

    }
    
    public void reintegra(double reintegro){
        saldo = saldo - reintegro;
        Movimiento_ej1 mov = new Movimiento_ej1();
        mov.setFecha(new Date());
        mov.setOperacion("Reintegro");
        mov.setCantidad(reintegro);
        mov.setSaldo(saldo);
        arrayMovimientos[contadorHistorial++] = mov;
        
    }
}
