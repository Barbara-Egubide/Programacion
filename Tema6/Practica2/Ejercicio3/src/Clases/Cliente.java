package Clases;

public class Cliente extends Persona{
    private int telefonoDeContacto;

    public Cliente() {
    }

    public Cliente(int telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    public Cliente(int telefonoDeContacto, String nombre, int edad) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }
    
    // setter and getter

    public int getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(int telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }

    // Funciones
    @Override
    public String toString() {
        return super.toString()+" este cliente tiene un  telefonoDeContacto: " + telefonoDeContacto  ;
    }
    
   
    
    
}
