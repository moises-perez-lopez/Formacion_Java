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
public class Item {
    
    private double valor;
    private TipoOperacion tipo;
    private boolean esNumero;

    public Item(double valor) {
        this.valor = valor;
        this.esNumero = true;
    }
    
    public Item(TipoOperacion tipo) {
        this.tipo = tipo;
        this.esNumero = false;
    }

    public double getValor() {
        return valor;
    }

    public TipoOperacion getTipo() {
        return tipo;
    }

    public boolean isEsNumero() {
        return esNumero;
    }
    
    
}
