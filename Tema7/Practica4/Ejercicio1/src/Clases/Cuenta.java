package Clases;

import java.util.ArrayList;

public class Cuenta {
    private String numero;
    private ArrayList<Movimiento>  listaMovimiento;

    public Cuenta() {
    }

    public Cuenta(String numero, ArrayList<Movimiento> listaMovimiento) {
        this.numero = numero;
        this.listaMovimiento = listaMovimiento;
    }
    
    // Setter and Getter

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public ArrayList<Movimiento> getListaMovimiento() {
        return listaMovimiento;
    }

    public void setListaMovimiento(ArrayList<Movimiento> listaMovimiento) {
        this.listaMovimiento = listaMovimiento;
    }
    
}
