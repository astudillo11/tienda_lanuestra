package Sentencias;

import ConexionBD.ConexionBD;
import Ventas.*;
import java.sql.*;
import javax.swing.JOptionPane;

        
public class TablaVenta extends VentaPOA {
    ConexionBD conexion = new ConexionBD();
    
    @Override
    public boolean insertarVenta(int id, int producto_id, String cantidad, int precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarVenta(int id, int producto_id, String cantidad, int precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarProveedor(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet consultarProductoCombo(){
        ResultSet resultado = null;
        try {
            String sentenciaSql = "Select id, nombre, precio from productos";
            conexion.conectar();
            Statement st = conexion.conex.createStatement();
            resultado = st.executeQuery(sentenciaSql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: "+ e.getMessage());
        }
            return resultado;
    }
    
}
