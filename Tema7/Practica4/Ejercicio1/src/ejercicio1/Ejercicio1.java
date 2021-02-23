package ejercicio1;

import Clases.*;
import Excepciones.*;
import Vistas.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio1 {
    
    private static VLogIn ventana2;
    private static V1 ventana1; 
    private static Operaciones o;
    private static Consultas c;
    private static Movimientos m;
    private static ArrayList<Cliente> clientes;
    private static ArrayList<Cuenta> cuentas;
    private static ArrayList<Movimiento> movimientos;
    private static ArrayList<Cuenta> listaC;
    private static Cliente c1;
    
    public static void main(String[] args) {
        generarDatos();
        
        ventana1=new V1();
        ventana1.setVisible(true);
    }
    
     public static void generarDatos(){
        movimientos=new ArrayList();
        
        movimientos.add(new Movimiento(LocalDate.now(),"Ingreso",1000));
        movimientos.add(new Movimiento(LocalDate.now(),"Ingreso",20));
        movimientos.add(new Movimiento(LocalDate.now(),"Ingreso",40));
         
        cuentas=new ArrayList();
        
        cuentas.add(new Cuenta(12));
        cuentas.add(new Cuenta(2));
        cuentas.add(new Cuenta(3));
        cuentas.add(new Cuenta(44));
        
        clientes=new ArrayList();
            listaC=new ArrayList();
            listaC.add(cuentas.get(1));
            listaC.add(cuentas.get(3));
        clientes.add(new Cliente("Pepe","11111111B","123",listaC));
        
            listaC=new ArrayList();
            listaC.add(cuentas.get(2));
        clientes.add(new Cliente("Marta","11111111A","123",listaC));
        
            listaC=new ArrayList();
            listaC.add(cuentas.get(0));
        clientes.add(new Cliente("Juan","11111111C","123",listaC));
                                
    }

    public static void logIn() {
        ventana1.dispose();
        
        ventana2=new VLogIn();
        ventana2.setVisible(true);
    }
    public static void operaciones() {
        ventana2.dispose();
        
        o=new Operaciones();
        o.setVisible(true);
    }
    public static void consultas() {
        if(o.isVisible())
            o.dispose();
        
        c=new Consultas();
        c.setVisible(true);
        if(m!=null)
            if(m.isVisible())
                m.dispose();
    }

    public static void movimientos() {
        if(o.isVisible())
            o.setVisible(false);
        
        m=new Movimientos();
        m.setVisible(true);
        if(c!=null)
            if(c.isVisible())
                c.dispose();
    }

    public static void nuevaVentana() {
        m.dispose();
        m=new Movimientos();
        m.setVisible(true);
    }

    public static boolean validarNif(String nif) {
         try{
            int x;
            
            for(x=0;x>clientes.size() && !clientes.get(x).getNif().equalsIgnoreCase(nif);x++){} 
            if(x==clientes.size())
               throw new DatoNoValido();
            
            c1= clientes.get(x);
            return true;               
           
        }
        catch(DatoNoValido e){
            c1= null;
            return false;
        }
    }

    public static boolean validarClave(String clave) {
        try{
            if(!c1.getClave().equalsIgnoreCase(clave))
                throw new DatoNoValido(); 
            return true;    
        }
        catch(DatoNoValido e){
            c1= null;
            return false;
        }    
    }



   
    
}
