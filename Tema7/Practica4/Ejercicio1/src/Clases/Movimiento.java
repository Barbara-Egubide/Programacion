package Clases;

import java.time.LocalDate;

public class Movimiento {
    private LocalDate fecha;
    private String descripcion;
    private int importe;

    public Movimiento() {
    }

    public Movimiento(LocalDate fecha, String descripcion, int importe) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.importe = importe;
    }
                    
    // Setter and Getter

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
}
