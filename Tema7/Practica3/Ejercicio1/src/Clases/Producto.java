package Clases;

import java.util.ArrayList;

public class Producto {
    private String nombre;
    private int unidadesDisponibles;
    private double precioUnitario;
    private ArrayList<Proveedor> proveedor;
    
    public Producto() {
    }

    public Producto(String nombre, int unidadesDisponibles, double precioUnitario) {
        this.nombre = nombre;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precioUnitario = precioUnitario;
    }

    public Producto(String n, int u, double p, ArrayList<Proveedor> proveedor) {
        this.nombre = n;
        this.unidadesDisponibles = u;
        this.precioUnitario = p;
        this.proveedor = proveedor;
    }
    
    
    // Getter and Setter
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList<Proveedor> getProveedor() {
        return proveedor;
    }

    public void setProveedor(ArrayList<Proveedor> proveedor) {
        this.proveedor = proveedor;
    }
    
    // Funciones

    
    
}
