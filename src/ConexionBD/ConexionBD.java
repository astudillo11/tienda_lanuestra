/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.*;
import java.sql.DriverManager;

/**
 *
 * @author felipe
 */
public class ConexionBD {
       public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/empresa_freskda","root","");
            System.out.println("Conexion establecida.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conex;
    }
    
}
