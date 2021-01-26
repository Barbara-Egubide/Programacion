package Clases;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private ArrayList<Persona> listaPersonas;

    public Curso() {
    }

    public Curso(String codigo) {
        this.codigo = codigo;
    }
    
    public Curso(String codigo, ArrayList<Persona> listaPersonas) {
        this.codigo = codigo;
        this.listaPersonas = listaPersonas;
    }    
    
    // Setter and Getter

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }



  
}
