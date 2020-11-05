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
public class CuentaBancaria_ej2 {
    public static double interes = 0.01;
    private String nombreTitular;
    private String numeroTitular;
    private double saldo;
    private Integer contadorHistorial = 0;
    private Movimiento_ej2 [] arrayMovimientos;
    
    private static final int MAX_MOVIMIENTOS=100;

    public CuentaBancaria_ej2() {
        this(MAX_MOVIMIENTOS);
    }
    
    public CuentaBancaria_ej2(int movimientos) {
        arrayMovimientos = new Movimiento_ej2 [movimientos];
    }

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
        Movimiento_ej2 mov = new Movimiento_ej2();
        mov.setFecha(new Date());
        mov.setOperacion("Ingreso");
        mov.setCantidad(ingreso);
        mov.setSaldo(saldo);
        if (contadorHistorial < arrayMovimientos.length){
            arrayMovimientos[contadorHistorial++] = mov;
        }
    }
    
    public void reintegra(double reintegro){
        saldo = saldo - reintegro;
        Movimiento_ej2 mov = new Movimiento_ej2();
        mov.setFecha(new Date());
        mov.setOperacion("Reintegro");
        mov.setCantidad(reintegro);
        mov.setSaldo(saldo);
        if (contadorHistorial < arrayMovimientos.length){
            arrayMovimientos[contadorHistorial++] = mov;
        }
        
    }
}
