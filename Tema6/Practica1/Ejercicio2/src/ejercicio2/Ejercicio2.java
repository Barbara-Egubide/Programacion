package ejercicio2;

import Clases.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        try{
            ArrayList<Alumno> listaClase=new ArrayList();
            obtenerAlumnos( listaClase);
            buscarAlumno(listaClase);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error " + e.getMessage());
        }
    }

    public static void obtenerAlumnos(ArrayList<Alumno> listaClase) {
       
            int cod=Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo del alumno"));
            String nombre=JOptionPane.showInputDialog("Teclea el nombre del alumno");
            String domicilio=JOptionPane.showInputDialog("Teclea el domicilio");
            int telefono=Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de telefono"));
        
            Alumno a1= new Alumno(cod,nombre,domicilio, telefono);
            /*listaClase.add(0,a1);*/
            listaClase.add(a1);
        
    }
    
    public static void buscarAlumno( ArrayList<Alumno> listaClase){
        int cod=Integer.parseInt(JOptionPane.showInputDialog("Teclea el codigo del alumno que quieres buscar"));  
        int x;
        for(x=0;x<listaClase.size() && cod!=listaClase.get(x).getCod();x++){}
        if(x==listaClase.size())
           JOptionPane.showMessageDialog(null,"Alumno no encontrado" );
        else
            JOptionPane.showMessageDialog(null,"Alumno encontrado" + listaClase.get(x));
    }
    
    
    
    
}
