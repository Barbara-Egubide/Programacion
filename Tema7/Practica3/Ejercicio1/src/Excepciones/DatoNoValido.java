
package Excepciones;

public class DatoNoValido extends Exception{
    private String message;

    public DatoNoValido() {
    }
    
    public DatoNoValido(String messaje) {
        message = messaje;
    }

    @Override
    public String getMessage() {
        return  message;
    }
    
}
