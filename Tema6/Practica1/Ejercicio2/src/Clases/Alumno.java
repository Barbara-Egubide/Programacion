package Clases;

public class Alumno {
    private int cod;
    private String nombre;
    private String domicilio;
    private int telefono;

    public Alumno() {
    }

    public Alumno(int cod, String nombre, String domicilio, int telefono) {
        this.cod = cod;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    
    
    
    /* Set and Get */
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
            return "El alumno con el codigo " + cod + " tiene el nombre "+ 
                nombre + " vive en " + domicilio + " y tiene el telefono " 
                + telefono;
    }

        
    
}
