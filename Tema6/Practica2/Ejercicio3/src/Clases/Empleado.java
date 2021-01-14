package Clases;

public class Empleado extends Persona{
    private double sueldoBruto;

    public Empleado() {
    }

    public Empleado(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(double sueldoBruto, String nombre, int edad) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }
    
    // setter and getter

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
    
    // Funciones    
    @Override
    public String toString() {
        return super.toString() +", tiene un sueldo bruto de " + sueldoBruto +"€ ";
    }
    
     public String calcularSalarioNeto(){
         return null;
     }
    
}
