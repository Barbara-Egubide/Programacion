package ejercicio1;

import Clases.Circunferencia;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        int r=Integer.parseInt(JOptionPane.showInputDialog("Teclea la longitud del radio"));
        /*if (r<0)
            throw new DatoNoValido();
        */            
        
        Circunferencia n1=new Circunferencia();
        n1.setRadio(r);
        
    
        
        JOptionPane.showMessageDialog(null, "La longitud de la circunferencia es: "+ n1.getLongitud()+
              "\nEl area es: " + n1.getArea()+
               "\nEl volumen de la esfera es: " + n1.getVolumen());
    }
    
}
