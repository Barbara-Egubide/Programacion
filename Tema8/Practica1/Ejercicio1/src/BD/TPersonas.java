package BD;

import Clases.*;
import java.sql.*;


public class TPersonas {
    private Connection con;

    public TPersonas(Connection con) {
        this.con = con;
    }
    
     public void insertar(Persona p) throws Exception {
        String insert="INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(insert);
        ps.setString(1, p.getNombre());
        ps.setString(2, p.getEdad());
        ps.setString(3, p.getProfesion());
        ps.setString(4, p.getTelefono());
        
        int n = ps.executeUpdate();
        //ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }
    public Persona selecionarP(String nombre) throws Exception {
        String select="select * from personas where nombre = ?;";
        PreparedStatement ps = con.prepareStatement(select);
        ps.setString(1, nombre);
        
        ResultSet resultado = ps.executeQuery();
        if(resultado.next()){
            Persona p=new Persona();
            
            p.setNombre(resultado.getString("nombre"));
            p.setEdad(resultado.getString("edad"));
            p.setProfesion(resultado.getString("profesion"));
            p.setTelefono(resultado.getString("telefono"));
            return p;
        }        
        else
            
        return null;
        
       
    } 
    
}
