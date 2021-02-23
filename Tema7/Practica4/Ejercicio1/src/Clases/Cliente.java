package Clases;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String nif;
    private String clave;
    private ArrayList<Cuenta> numCuenta;

    public Cliente() {
    }

    public Cliente(String nombre, String nif, String clave) {
        this.nombre = nombre;
        this.nif = nif;
        this.clave = clave;
    }

    public Cliente(String nombre, String nif, String clave, ArrayList<Cuenta> numCuenta) {
        this.nombre = nombre;
        this.nif = nif;
        this.clave = clave;
        this.numCuenta = numCuenta;
    }

        
    // Setter and Getter

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cuenta> getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(ArrayList<Cuenta> numCuenta) {
        this.numCuenta = numCuenta;
    }

    
    
}
