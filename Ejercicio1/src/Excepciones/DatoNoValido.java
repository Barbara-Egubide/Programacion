
package Excepciones;

public class DatoNoValido extends Exception{
    private String mensage;

    public DatoNoValido() {
    }
    
    public DatoNoValido(String mensaje) {
       mensage = mensaje;
    }

    
    public String getMensage() {
        return mensage ;
    }

   
    
    
    
}
