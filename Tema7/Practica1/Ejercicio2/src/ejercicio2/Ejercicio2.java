package ejercicio2;

import Clases.*;
import Vista.*;
import java.util.ArrayList;

public class Ejercicio2 {
    public static ArrayList<Persona> listaPersona;
    private static VAlta v1;
    private static VListado v2;

    
    public static void main(String[] args) {
        v1=new VAlta();
        v1.setVisible(true);
    }    
    
    public static void llenarListado(String nombre, String apellido, String dni) {
        listaPersona=new ArrayList();        
        
        listaPersona.add(new Persona(nombre, apellido,dni));
    }
    
    public static void listado(){
        v1.dispose();
        
        v2=new VListado();
        v2.setVisible(true);
    }
    
    public static void generarListado(){
        
     
     
    }
    
    
    
    
}
