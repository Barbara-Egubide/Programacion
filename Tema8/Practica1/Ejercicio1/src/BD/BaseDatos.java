package BD;
import java.sql.*;
public class BaseDatos {

    private Connection con;
    public BaseDatos() {
    }
    
    public void conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String bd="bd1";
            String url="jdbc:mysql://localhost:3307/"+bd;
            String login="root";
            String password = "usbw";
            con=DriverManager.getConnection(url, login, password);
            
            if (con==null){
                throw new Exception("Problemas con la conexión");
            }
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    
    }
    public void desconectar(){
        try{
            con.close();
        
        }
        catch(Exception e){
               System.out.println("Problemas cerrando la conexión");
        
        }    
    
    }
    public Connection getCon(){
        return con;
    
    }
    
    
    
    
    
    
    
}
