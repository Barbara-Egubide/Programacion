package Clases;

public class Circunferencia {
   
    private int radio;

    public Circunferencia() {
    }

        
    public Circunferencia(int radio) {
        this.radio = radio;
    }
         
    /* Set and Get */
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double getLongitud(){
    return 2 * Math.PI * radio;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }
    
    public double getVolumen(){
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
     
}

