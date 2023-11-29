/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conectando_a_bd;

import java.sql.*;

/**
 *
 * @author Naicguer
 */
public class Conectando_a_BD {

    private static final String DRIVER = "org.mysql.dbc.Driver";
    private static final String URL_CONEXION="jdbc:mysql://localhost:3306/Pruebas";
    
    public static void main(String[] args) throws SQLException {
    
        final String usuario="user_db";
        final String password="password_db";
        Connection dbConnection = null;
        Statement statement = null;
        
        try{
            
            Class.forName(DRIVER);
            dbConnection = DriverManager.getConnection(URL_CONEXION,usuario , password);
            String selectTableSQL="SELECT ID,USERNAME,PASSWORD,NOMBRE FROM Usuarios";
            statement =dbConnection.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            
            while(rs.next()){
                String id = rs.getString("ID");
                String usr = rs.getString("USERNAME");
                String psw = rs.getString("PASSWORD");
                String nombre = rs.getString("NOMBRE");
                
                System.out.println("userid"+id);
                System.out.println("usr"+usr);
                System.out.println("psw"+psw);
                System.out.println("nombre"+nombre);
                
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());   
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }finally{
            if (statement != null){
                statement.close();
            }
        }
        
    }
    
}
