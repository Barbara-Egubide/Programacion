package ejercicio1;

import javax.swing.JOptionPane;
import Clases.*;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio1 {

    public static ArrayList<Estudio> listaEstudio;
    public static ArrayList<Pelicula> listaPelicula;
    
    public static void main(String[] args) {
        try{
            llenarListaEstudio();
            llenarListaPelicula();
            mostrarPeliculaMasLarga();
            buscarEstudioMasPeliculas();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error "+ e.getMessage());
        }
    }
    public static void llenarListaEstudio(){
        listaEstudio=new ArrayList();
        
        ArrayList<Integer> telefonos = new ArrayList();
        telefonos.add(111113611);
        telefonos.add(111181111);
        Estudio e1=new Estudio("Universal","","","",LocalDate.of(1999,10,23),"",telefonos);
        listaEstudio.add(e1);
        
        telefonos = new ArrayList();
        telefonos.add(111111181);
        telefonos.add(116111111);
        Estudio e2=new Estudio("Paramount","","","",LocalDate.of(2000,4,4),"",telefonos);
        listaEstudio.add(e2);
        
        telefonos = new ArrayList();
        telefonos.add(118111111);
        telefonos.add(111711111);
        Estudio e3=new Estudio("Warnet","","","",LocalDate.of(1955,9,23),"",telefonos);
        listaEstudio.add(e3);
    
    }
    
    public static void llenarListaPelicula(){
        listaPelicula=new ArrayList();
        
        char año=2020;
        
        ArrayList <Estudio> lista=new ArrayList();
        lista.add(listaEstudio.get(0));
        Pelicula p1=new Pelicula("Buscando a dori",año,110,"",lista);
        listaPelicula.add(p1);
        
        char año2=2020;

        lista=new ArrayList();
        lista.add(listaEstudio.get(0));
        lista.add(listaEstudio.get(2));
        Pelicula p2=new Pelicula("E.T.",año2,90.5f,"",lista);
        listaPelicula.add(p2);
        
        char año3=2020;

        lista=new ArrayList();
        lista.add(listaEstudio.get(1));
        lista.add(listaEstudio.get(2));
        lista.add(listaEstudio.get(0));
        Pelicula p3=new Pelicula("Titanic",año3,180,"",lista);
        listaPelicula.add(p3);
    
    }
    
    
    public static void mostrarPeliculaMasLarga(){
        
        float maxDuracionPelicula=0;
        Pelicula objeto=null;
        
        for(int x=0;x<listaPelicula.size();x++){
            if(listaPelicula.get(x).getDuracion()>maxDuracionPelicula){
                maxDuracionPelicula=listaPelicula.get(x).getDuracion();
                objeto=listaPelicula.get(x);
            }
        }
        String estudios="";
        
        for(int x=0;x<objeto.getListaEstudios().size();x++)
            estudios=" "+objeto.getListaEstudios().get(x).getNombre();
            
        JOptionPane.showMessageDialog(null, "La pelicula mas larga llamada "+ 
                    objeto.getTitulo()+ " tiene los estudios siquientes: "+
                    estudios);
        
    }
    public static void buscarEstudioMasPeliculas(){
        
         int [] numeroPeliculas = new int[5];
        Arrays.fill(numeroPeliculas, 0);
        for(int z = 0;z < listaEstudio.size(); z++)
          for(int x=0; x < listaPelicula.size();x++)
            {
                boolean salir = false;
                for(int y=0; y < listaPelicula.get(x).getListaEstudios().size() && !salir; y++)
                {
                    //if (listaPeliculas.get(x).getListaEstudios().get(y)== listaEstudios[z])
                    if (listaPelicula.get(x).getListaEstudios().get(y).equals(listaEstudio.get(z)))
                    {
                        numeroPeliculas[z]+= 1;
                        salir = true;                    
                    }
                }
            }
    
    int max = 0;
        int posicion = 0;
        for (int x = 0; x < numeroPeliculas.length; x++)
            if(numeroPeliculas[x] > max)
            {
                max = numeroPeliculas[x];
                posicion = x;
            }
        
        javax.swing.JOptionPane.showMessageDialog(null,"El estudio que más películas ha producido es: " + listaEstudio.get(posicion).getNombre() + " y ha producido "+ max);
    }
    
}
