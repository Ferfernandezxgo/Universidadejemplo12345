/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo12345.accesoadatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String  URL="jdbc:mariadb://localhost/";
    private static final String  DB="universidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    
    private static Connection connection;

    public Conexion() {
    }
    
    
    public static Connection getConexion(){
        
        if(connection==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB,
                        USUARIO ,PASSWORD);
                
                
                
            
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"error al cargar la base de datos"+ex);
           
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,"error al cargar los Drivers"+ex);           
            }
        }
        return connection;
    }
    
    
}
