package ejercicio1;

import Clases.*;
import Vistas.*;
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
    
    public static void main(String[] args) {
        generarDatos();
        
        ventana1=new V1();
        ventana1.setVisible(true);
    }
    
     public static void generarDatos(){
        movimientos=new ArrayList();
        
        movimientos.add(new Movimiento());
        movimientos.add(new Movimiento());
        movimientos.add(new Movimiento());
         
        cuentas=new ArrayList();
        
        cuentas.add(new Cuenta());
        cuentas.add(new Cuenta());
        cuentas.add(new Cuenta());
        cuentas.add(new Cuenta());
        
        clientes=new ArrayList();
        
        clientes.add(new Cliente());
        clientes.add(new Cliente());
        clientes.add(new Cliente());
                                
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

   
    
}
