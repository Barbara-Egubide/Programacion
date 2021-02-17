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

    
    // Funciones
    
    
}
