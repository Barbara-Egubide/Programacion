package Clases;

import java.util.ArrayList;

public class Cuenta {
    private int numero;
    private ArrayList<Movimiento>  listaMovimiento;

    public Cuenta() {
    }

    public Cuenta(int numero) {
        this.numero = numero;
    }

    public Cuenta(int numero, ArrayList<Movimiento> listaMovimiento) {
        this.numero = numero;
        this.listaMovimiento = listaMovimiento;
    }
    
    // Setter and Getter

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Movimiento> getListaMovimiento() {
        return listaMovimiento;
    }

    public void setListaMovimiento(ArrayList<Movimiento> listaMovimiento) {
        this.listaMovimiento = listaMovimiento;
    }
    
}
