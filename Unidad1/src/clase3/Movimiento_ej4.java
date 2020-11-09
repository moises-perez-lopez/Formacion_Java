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
public class Movimiento_ej4 {
    private Date fecha;
    private TipoMovimiento_ej4 operacion;
    private Double cantidad;
    private Double saldo;

    public Movimiento_ej4(Date fecha, TipoMovimiento_ej4 operacion, Double cantidad) {
        this.fecha = fecha;
        this.operacion = operacion;
        this.cantidad = cantidad;
    }
    
    public Movimiento_ej4(){
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public TipoMovimiento_ej4 getOperacion() {
        return operacion;
    }

    public void setOperacion(TipoMovimiento_ej4 operacion) {
        this.operacion = operacion;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
