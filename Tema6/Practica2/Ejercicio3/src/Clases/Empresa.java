package Clases;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Cliente> listaCliente; 
    
    public Empresa() {
    }

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Empresa(String nombre, ArrayList<Empleado> listaEmpleado, ArrayList<Cliente> listaCliente) {
        this.nombre = nombre;
        this.listaEmpleado = listaEmpleado;
        this.listaCliente = listaCliente;
    }

            
    // setter and getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    
    
    
}
