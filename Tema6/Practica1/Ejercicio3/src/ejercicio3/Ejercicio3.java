package ejercicio3;

import Clases.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    private static ArrayList<Persona> listaPersonas; 

    public static void main(String[] args) {
        try{
            listaPersonas=new ArrayList();
            añadirPersonas();
            
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error, "+ e.getMessage());
        }
        
    }
    public static void añadirPersonas() throws Exception{
        do{    
            try{
                String nombre=JOptionPane.showInputDialog("Teclea el nombre");
                
                int dNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Teclea el dia de tu nacimiento"));
                int mNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Teclea el mes de tu nacimiento"));
                int aNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Teclea el año de tu nacimiento"));
                String direccion=JOptionPane.showInputDialog("Teclea la direccion");
                String codPostal=JOptionPane.showInputDialog("Teclea el codigo postal");
                String ciudad=JOptionPane.showInputDialog("Teclea el nombre de la ciudad");
            
                Persona n1=new Persona(nombre,dNacimiento,mNacimiento,aNacimiento,
                    direccion,codPostal,ciudad);
                listaPersonas.add(n1);
                
            }
            catch(NullPointerException e){
        
            }
        }
        while();
    }
    
}
