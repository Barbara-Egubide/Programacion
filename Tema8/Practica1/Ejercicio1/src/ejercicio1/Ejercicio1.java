package ejercicio1;

import BD.*;
import Clases.*;
import Excepciones.DatoInexistente;
import Vistas.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    private static BaseDatos bd;
    private static TPersonas tp;
             
    private static VPrincipal vp;
    private static VPersonas dp;
    
    private static Persona p; 
    private static int numeroOpciones;

    
    public static void main(String[] args) {
        try{
            bd=new BaseDatos();
            bd.conectar();
            tp=new TPersonas(bd.getCon());
            
            vp=new VPrincipal();
            vp.setVisible(true);
         
        }
        catch(Exception e){
            bd.desconectar();
            System.out.println(e.getMessage());
        }
        
    }

    public static void seleccion(int num) {
       if(numeroOpciones==4)
             numeroOpciones=0;
       else
            numeroOpciones=num;        
    }
    
    public static int opcion() {
        return numeroOpciones;
    }
    public static void vpersona() {
        vp.setVisible(false);
        dp = new VPersonas();
        dp.setVisible(true);
    }
    public static void terminar() {
            vp.dispose();
            System.exit(0);
        
    }

    public static void registrar(String nombre, String edad, String profesion, String telefono) throws SQLException, Exception {
        p=new Persona(nombre,edad,profesion,telefono);
        tp.insertar(p); 
    }

    public static void vprincipal() {
        dp.dispose();
        vp.setVisible(true);
    }

    public static void consultaP(String nombre) throws Exception {
            p=tp.selecionarP(nombre); 
    }

    public static String devolverEdad() {
        return p.getEdad();          
    }
    public static String devolverProfesion() {
        return p.getProfesion();                
    }
    public static String devolverTelefono() {
        return p.getTelefono();
                
    }
    
    
}

    
 
