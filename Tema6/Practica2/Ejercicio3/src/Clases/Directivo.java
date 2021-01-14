package Clases;

import java.util.ArrayList;

public class Directivo extends Empleado{
    private String categoria;
    private ArrayList<Empleado> listaEmpleado;

    public Directivo() {
    }

    public Directivo(String categoria) {
        this.categoria = categoria;
    }

    public Directivo(String categoria, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
    }

    public Directivo(String categoria, ArrayList<Empleado> listaEmpleado, double sueldoBruto, String nombre, int edad) {
        super(sueldoBruto, nombre, edad);
        this.categoria = categoria;
        this.listaEmpleado = listaEmpleado;
    }

    
    // setter and getter

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    // Funciones
    @Override
    public String toString() {
        return super.toString() + ", su categoria es " + categoria ;
    }
    
    
    
}
