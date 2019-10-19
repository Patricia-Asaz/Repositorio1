/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectds01;

import java.sql.Connection;import java.sql.DriverManager;
;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {
    Connection connect;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost/viajes", "root", "");
            JOptionPane.showMessageDialog(null, "Correcto.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connect;
        
    }
}
