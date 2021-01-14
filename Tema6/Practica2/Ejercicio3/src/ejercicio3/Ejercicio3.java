package ejercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import Clases.*;

public class Ejercicio3 {
    static ArrayList<Empleado> listaEmpleado;
    static ArrayList<Directivo> listaDirectivo; 
    static ArrayList<Empresa> listaEmpresa; 
    
    public static void main(String[] args) {
        try{
            crearListaEmpleado();
            crearListaDirectivo();
            crearListaEmpresa();
            calcularMaxEmple();
        
        }
        catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Error, " + e.getMessage());
        }
        
    }
    public static void crearListaEmpleado(){
        listaEmpleado=new ArrayList();
        
        Empleado e1=new Empleado(9862,"Ana",23);
        listaEmpleado.add(e1);
        
        Empleado e2=new Empleado(6545,"Eva",60);
        listaEmpleado.add(e2);
        
        Empleado e3=new Empleado(6451,"Ariadna",45);
        listaEmpleado.add(e3);
        
        Empleado e4=new Empleado(5648,"Edna",30);
        listaEmpleado.add(e4);
        
        Empleado e5=new Empleado(6515,"Martina",45);
        listaEmpleado.add(e5);
    
    }
    public static void crearListaDirectivo(){
        listaDirectivo=new ArrayList();
               
        ArrayList<Empleado> lista=new ArrayList();
        lista.add(listaEmpleado.get(0));
        lista.add(listaEmpleado.get(4));
        
        Directivo d1=new Directivo("categoria 1",lista,5461,"Palmiro",34);
        listaDirectivo.add(d1);
        
        lista=new ArrayList();
        lista.add(listaEmpleado.get(2));
        lista.add(listaEmpleado.get(3));  
        lista.add(listaEmpleado.get(4));
        
        Directivo d2=new Directivo("categoria 2",lista,6141,"Pepe",45);
        listaDirectivo.add(d2);
        
        lista=new ArrayList();
        lista.add(listaEmpleado.get(2));
        lista.add(listaEmpleado.get(3));  
        lista.add(listaEmpleado.get(1));
         lista.add(listaEmpleado.get(0));
        
        Directivo d3=new Directivo("categoria 1",lista,5652,"Alfonso",24);
        listaDirectivo.add(d3);
    
    }
    public static void crearListaEmpresa(){
        listaEmpresa=new ArrayList();
        
    
    }
    public static void calcularMaxEmple(){
        int max=0;
        Directivo posicion=null;
        int x;
        for(x=0;x<listaDirectivo.size();x++){
            if(listaDirectivo.get(x).getListaEmpleado().size()>max)
                max=listaDirectivo.get(x).getListaEmpleado().size();
                posicion=listaDirectivo.get(x);
        }
   
    JOptionPane.showMessageDialog(null, "El directivo con mas empleados es: "+ posicion);
    
    }
    
    
    
}
