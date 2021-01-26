package Clases;

public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private Curso curso;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public Persona(String nombre, String apellidos, String dni, Curso curso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.curso = curso;
    }

     
  
    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
        
    
}
