package Sentencias;
import Proveedores.*;
import java.sql.Statement;
import javax.swing.JOptionPane;
import ConexionBD.ConexionBD;
import java.sql.ResultSet;
/**
 *
 * @author FRESKMANN SILVA 
 */
public class TablaProveedor extends ProveedorPOA {
         ConexionBD conexion = new ConexionBD();
    @Override
    public boolean insertarProveedor(int codigoProveedor, String nombre, int telefono, String direccion) {
         boolean resultado = false;
        try {
            String sql = "insert into proveedor (Cod_proveedor,nombre,telefono,Direccion) values ('"+codigoProveedor+"','"+nombre+"','"+telefono+"','"+direccion+"',)";
            conexion.conectar();
            Statement st = conexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones
            conexion.conex.close();
            st.close();
            
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al insertar. "+e.getMessage());
        }        
        return resultado;
    }

    @Override
    public boolean actualizarProveedor(int codigoProveedor, String nombre, int telefono, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProveedor(int codProveedor) {
          boolean resultado = false;
        try {
            String sql = "Delete from proveedor where codProveedor = "+codProveedor;
            Statement st = conexion.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            //Se cierran las conexiones.
            conexion.conex.close();
            st.close();
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error al eliminar. "+e.getMessage());
        }        
        return resultado;
       
    }

    
    @Override
    public String consultarProveedor(int codProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet cargarProveedor (){
         ResultSet result = null;
         try {
            String sql = "SELECT Cod_proveedor, nombre, telefono, Direccion FROM proveedor";
            conexion.conectar();
            Statement st = conexion.conex.createStatement();
            result = st.executeQuery(sql);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
        }
         return result;
    }
    
    
    
    
    
}
