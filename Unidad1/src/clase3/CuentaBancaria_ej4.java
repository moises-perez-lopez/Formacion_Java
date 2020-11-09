package clase3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author moises
 */
public class CuentaBancaria_ej4 {
    public static double interes = 0.01;
    private String nombreTitular;
    private String numeroTitular;
    private double saldo;
    private Integer contadorHistorial = 0;
    private ArrayList<Movimiento_ej4> arrayMovimientos = new ArrayList <Movimiento_ej4>();
    
    private static final int MAX_MOVIMIENTOS=100;

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
        Movimiento_ej4 mov = new Movimiento_ej4();
        mov.setFecha(new Date());
        mov.setOperacion(TipoMovimiento_ej4.ingreso);
        mov.setCantidad(ingreso);
        mov.setSaldo(saldo);
        if (arrayMovimientos.size() < MAX_MOVIMIENTOS){
            arrayMovimientos.add(mov);
        }
    }
    
    public void reintegra(double reintegro){
        saldo = saldo - reintegro;
        Movimiento_ej4 mov = new Movimiento_ej4(new Date(),TipoMovimiento_ej4.reintegro,25.0);
        mov.setSaldo(saldo);
        if (arrayMovimientos.size() < MAX_MOVIMIENTOS){
            arrayMovimientos.add(mov);
        }
        
    }
}
