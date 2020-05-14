/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author jeissoncc
 */
public class SqlUsuarios extends conexion{
    
    public void Buscar(servicios serv){
        Connection con = getConexion();
        PreparedStatement ps = null;
      try{
        String sql = "SELECT servicio FROM servicios";
        Statement st = (Statement) con.createStatement();
        ResultSet rs =  st.executeQuery(sql);
     
        while(rs.next()){
          String servicio = rs.getString(sql);
        
}       }catch (SQLException ex) {
            java.util.logging.Logger.getLogger(jpfactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    public boolean registrar(usuarios usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO usuarios (id, nombres, apellidos, password, email, usuario, direccion, telefonos, rol) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, usr.getId());
            ps.setString(2, usr.getNombre());
            ps.setString(3, usr.getApellido());
            ps.setString(4, usr.getPassword());
            ps.setString(5, usr.getEmail());
            ps.setString(6, usr.getUsuario());
            ps.setString(7, usr.getDireccion());
            ps.setString(8, usr.getTelefono());
            ps.setInt(9, usr.getRol());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean login(usuarios usr) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT  usuarios.id, usuarios.usuario, usuarios.password, usuarios.nombres, usuarios.rol, roles.nombre_rol, roles.id_rol FROM usuarios INNER JOIN roles ON usuarios.rol = roles.id_rol WHERE usuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPassword().equals(rs.getString(3))) {
                  
                    
                    usr.setId(rs.getInt(1));
                    usr.setNombre(rs.getString(4));
                    usr.setRol(rs.getInt(5));
                    usr.setNombre_rol(rs.getString(6));
                    
                    System.out.println(":"+usr.getRol());
                    System.out.println(":"+usr.getId_rol());
                    return true;
                    
                } else {
                    return false;
                }
            }

            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public int existeCliente(int id){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * count(id_cliente) FROM clientes WHERE id_cliente = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(id);
                String razons = rs.getString("razon_social");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String contacto = rs.getString("contacto");
                return rs.getInt(1);
                
            }

            return 1;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    public boolean esEmail(String correo) {

        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static ArrayList<String> llenar_combo(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT * FROM roles";
        try{
            
            rs = ps.executeQuery(sql);
            System.out.println("Correcto");            
        }catch(Exception e){
            System.out.println("Incorrecto");
        }
        try{
            while(rs.next()){
                lista.add(rs.getString("nombre_rol"));
            }
        }catch(Exception e){
                    
                    }
        return lista;
    }

}
