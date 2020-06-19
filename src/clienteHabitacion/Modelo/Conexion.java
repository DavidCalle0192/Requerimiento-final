/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteHabitacion.Modelo;

import com.sun.tools.javac.code.Attribute;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author usuario
 */
public class Conexion {
    Connection con;
    public Conexion(){
    
           try {
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jbdc:mysql://localhost:3306/lsd_corba_bd_dcalle_jmelo","root","");
        } catch (Exception e) {
        }
    }
}
