package ejercicio1;

import Clases.*;
import Vistas.*;
import java.util.ArrayList;
import javax.swing.JComboBox;

public class Ejercicio1 {
    
    private static CompraVenta c;
    private static ArrayList<Producto> listaProductos;
    private static ArrayList<Proveedor> litaProveedor;
    private static ArrayList<Cliente> listaCliente;
    private static ArrayList<Proveedor> lista;
    
    private static Producto objetoProd;
    private static Proveedor objetoProv;
    private static Cliente objetoCliente;   
    
    public static void main(String[] args) {
        llenarListas();
        
        c=new CompraVenta();
        c.setVisible(true);
    }
    public static void llenarListas(){
        // lista proveedores
        litaProveedor=new ArrayList();
        litaProveedor.add(new Proveedor("Juan"));
        litaProveedor.add(new Proveedor("Marta"));
        litaProveedor.add(new Proveedor("Mirem"));
        litaProveedor.add(new Proveedor("Martin"));
        litaProveedor.add(new Proveedor("Jon"));
        
        // lista productos
        listaProductos=new  ArrayList();
            
        lista=new  ArrayList();
            lista.add(litaProveedor.get(0));
            lista.add(litaProveedor.get(1));
        listaProductos.add(new Producto("Aguacates",22,1.90,lista));
        
        lista=new  ArrayList();
            lista.add(litaProveedor.get(3));
            lista.add(litaProveedor.get(2));
            lista.add(litaProveedor.get(4));
            lista.add(litaProveedor.get(1));
        listaProductos.add(new Producto("Peras",22,1.50,lista));
        
         lista=new  ArrayList();
            lista.add(litaProveedor.get(2));
            lista.add(litaProveedor.get(4));
            lista.add(litaProveedor.get(1));
        listaProductos.add(new Producto("Manzanas",22,2.50,lista));
        
        // lista clliente
        listaCliente=new  ArrayList();
    }


    public static boolean ValidarNombreProd(String nombre) {
        int x;
        for(x=0;x<listaProductos.size() && listaProductos.get(x).getNombre().equalsIgnoreCase(nombre);x++){}
        if(x==listaProductos.size()){
            objetoProd=null;
            return false;        
        }        
        objetoProd=listaProductos.get(x);
        return true;
                
    }

    public static boolean llenarProveedores(JComboBox<String> Proveedores) {   
        try{
            for(int x = 0; x < objetoProd.getProveedor().size(); x++)
            {
                Proveedores.insertItemAt(objetoProd.getProveedor().get(x).getNombre(), x);
            }
            return true;
        }
        catch(Exception e){
            return false;
        }    
    }

    public static double precioVenta() {
        return objetoProd.getPrecioUnitario();
    }

    public static float importeVenta(int unidades, boolean prontoPago, boolean volumen) {
        float importe;
        int dto = 0;
        importe=(float) (objetoProd.getPrecioUnitario() *unidades);
        if (prontoPago)
        {
            dto=dto + 3;
        }
        if (volumen)
        {
           dto=dto + 2;
        }
        importe=importe * (100 - dto)/100;
        return importe;
    }

    
    
        
    
    
    
}
