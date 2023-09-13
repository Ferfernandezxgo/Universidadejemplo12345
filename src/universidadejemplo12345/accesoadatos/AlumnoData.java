/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadejemplo12345.accesoadatos;
import java.sql.*;



public class AlumnoData {
    
    private Connection con=null;
    
    public AlumnoData(){
        con=Conexion.getConexion();
        
        
    public void guardarAlumno(Alumno alumno){
        String sql ="INSERT INTO alumno (dni,apellido,nombre,estado) "
                + "values(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.value);        }
        
    }    
        
        
    }
    
    
}
