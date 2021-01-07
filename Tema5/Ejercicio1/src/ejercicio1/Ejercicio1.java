package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    
    private static ArrayList<Float> numeros;
     private static float subtotal=0;
    public static void main(String[] args) {
        try{
            numeros=new ArrayList();
            llenarArrayList();
            int menu;
            do{
                menu=rellenarMenu();
                switch(menu){
                    case 1:
                        maxYmin();
                        break;
                    case 2:
                        buscarNum();
                        break;
                    case 3:
                        borrarNum();
                        break;
                    case 4:
                        comvertirEnArray();
                        break;
                    case 5:
                        if(!numeros.isEmpty())
                            contenidoArrayList();
                        else
                            JOptionPane.showMessageDialog(null, "El ArrayList esta vacío");
                        break;
                    case 6:
                        nuevoElemento();
                        break;
                    case 7:
                        nuevoElementoPosicion();
                        break;
                    case 8:
                        borrarNumPosicion();
                        break;
                    case 9:
                        mediaArrayList();
                        break;                    
                }        
            }while(menu!=10);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puede estar vacío");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
        }
    }
    public static int rellenarMenu(){
        int menu=0;
        try{
            do{
                menu=Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Visualizar el valor maximo y el mínimo\n"+
                    "2. Solicitar un numero y buscarlo\n"+
                    "3. Solicitar un numero, buscarlo y borrarlo\n"+
                    "4. Convertir el arrayList en un array\n"+
                    "5. Si no esta vacío, mostrar el numero de elementos que contiene\n"+
                    "6. Insertar un nuevo elemento por el final\n"+
                    "7. Insertar un nuevo elemento\n" +
                    "8. Borrar un elemento de una posicion concreta\n"+
                    "9. Calcular la suma y la media aritmetica de los valores contenidos\n"+
                    "10. Finalizar\n" + " ")); 
            }while(menu<1 ||menu>10);    
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "No puede estar vacío");
        }
    
        return menu;
    }
    public static void llenarArrayList() throws Exception{
        int pregunta;
        do{
            numeros.add(pedirNumeros());
            pregunta=JOptionPane.showConfirmDialog(null, "Quiere añadir mas numeros?");
        }
        while(pregunta==0);
    }
    public static float pedirNumeros() throws Exception{
        boolean error=true;
        float num=0;
        do{
            try{
                num=Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que desea añadir"));
                
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
        return num; 
     
    }
     public static float pedirPosicion() throws Exception{
        boolean error=true;
        float num=0;
        do{
            try{
                num=Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que desea añadir"));
                
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
        return num; 
     
    }
    public static void maxYmin() throws Exception{
        
               

    }
    public static void buscarNum() throws Exception{
        
        boolean error=true;
        do{
            try{
                float num=Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero que desea buscar"));
                if(numeros.contains(num))
                    JOptionPane.showMessageDialog(null, "El numero se encuentra en la posición "+numeros.indexOf(num));
                else
                    JOptionPane.showMessageDialog(null, "El numero "+num+" no se encuentra en el ArrayList");
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
               
    }
    public static void borrarNum() throws Exception{
        boolean error=true;
        do{
            try{
                float num=Float.parseFloat(JOptionPane.showInputDialog("Teclea el numero que desea borrar"));
                if(numeros.contains(num)){
                    numeros.remove(num); 
                    JOptionPane.showMessageDialog(null, "El numero"+num+" se ha borrado correctamente");
                }                 
                else
                    JOptionPane.showMessageDialog(null, "El numero "+num+" no se encuentra en el ArrayList, por lo tanto no se ha borrado");
                
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
        
    }
    public static void comvertirEnArray() throws Exception{
        /*float[] num=new toArray(int Float(numeros.size()));*/
        
    }
    public static void contenidoArrayList() throws Exception{
        JOptionPane.showMessageDialog(null, "El ArrayList tiene "+numeros.size()+" numeros");

    }
    public static void nuevoElemento() throws Exception{
       
        float num=pedirNumeros();
        numeros.add(num);
                
           
        

    }
    public static void nuevoElementoPosicion() throws Exception{
        boolean error=true;
        int pos=-1;
        do{
            try{
                float num=pedirNumeros();
                pos=Integer.parseInt(JOptionPane.showInputDialog("Teclea la posición del numero que lo quiere añadir"));
                numeros.add(pos, num);
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
        

    }
    public static void borrarNumPosicion() throws Exception{
        boolean error=true;
        do{
            try{
                int pos=Integer.parseInt(JOptionPane.showInputDialog("Teclea en que posición esta el numero que quiere eliminar"));
                               
                numeros.remove(pos);
                error=false;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Teclea un numero");
            }
        }
        while(error);
        
    }
    public static void mediaArrayList(){
       /*Iterator<Double> iterator=numeros.iterator();*/
       
       numeros.forEach((elemento)-> {subtotal+=elemento;});
        JOptionPane.showMessageDialog(null, "La suma es igual a: "+ subtotal+ " y la media: "+(subtotal/numeros.size()));
    }
}