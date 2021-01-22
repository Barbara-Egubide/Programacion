package ejercicio2;

import Clases.*;
import Vista.*;
import java.util.ArrayList;

public class Ejercicio2 {
    public static ArrayList<Persona> listaPersona;
    private static VAlta v1;
    private static VListado v2;

    
    public static void main(String[] args) {
        listaPersona=new ArrayList();
        v1=new VAlta();
        v1.setVisible(true);
        
    }    
    
    public static void llenarListado(String nombre, String apellido, String dni) {
          
        listaPersona.add(new Persona(nombre, apellido,dni));
    }
    
    public static void listado(){
        v1.dispose();
        
        v2=new VListado(generarListado());
        v2.setVisible(true);
    }
    
    public static String generarListado(){
        String datos="";
        for(int x = 0; x < listaPersona.size(); x++)
        {
            datos += listaPersona.get(x).getNombre() + "  " + listaPersona.get(x).getApellido() + "  " + listaPersona.get(x).getDni() + " \n" ;
        }
        if (datos.compareTo("")== 0)
            datos = "No hay datos ";
        return datos;
    }
    
    
    
    
}
