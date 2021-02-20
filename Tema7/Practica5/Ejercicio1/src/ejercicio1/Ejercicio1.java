package ejercicio1;

import Vistas.*;

public class Ejercicio1 {
    
    private static VPrincipal v;
    private static Menu m;

    public static void main(String[] args) {
        v= new VPrincipal();
        v.setVisible(true);

    }

    

    public static boolean usuario(String usuario) {
        
        return true;

    }
    
    public static void menu() {
        v.dispose();
        
        m=new Menu();
        m.setVisible(true); 
    }
     
    public static void salir() {
        if(v!=null){
            v.dispose();
            System.exit(0); 
        }
        if(m!=null){
            m.dispose();
            System.exit(0); 
        }
    }

   
}
