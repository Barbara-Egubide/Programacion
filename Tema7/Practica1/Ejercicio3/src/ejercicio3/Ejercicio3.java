package ejercicio3;

import Clases.*;
import Vistas.*;

public class Ejercicio3 {

    private static VentanaPersona v1;
    private static Curso[] listaCursos;
    
    public static void main(String[] args) {
        listaCursos=new Curso[16];
        añadirCursos();
        
        
       mostrarVentana();
    }
    public static void añadirCursos(){
        listaCursos[0]=new Curso("1A");
        listaCursos[1]=new Curso("2A");
        listaCursos[2]=new Curso("3A");
        listaCursos[3]=new Curso("4A");
        listaCursos[4]=new Curso("1B");
        listaCursos[5]=new Curso("2B");
        listaCursos[6]=new Curso("3B");
        listaCursos[7]=new Curso("4B");
        listaCursos[8]=new Curso("1C");
        listaCursos[9]=new Curso("2C");
        listaCursos[10]=new Curso("3C");
        listaCursos[11]=new Curso("4C");
        listaCursos[12]=new Curso("1D");
        listaCursos[13]=new Curso("2D");
        listaCursos[14]=new Curso("3D");
        listaCursos[15]=new Curso("4D");
    }
    
    public static void mostrarVentana(){
        v1=new VentanaPersona();
        v1.setVisible(true);
    }
}
