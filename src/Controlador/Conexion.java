/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Crist
 */
public class Conexion {
    //Declaracion de variables necesarias para la conexion
    String nombreBD= "Proyecto_Taller";
    String url = "jdbc:postgresql://localhost:5432/"+nombreBD;
    String usuario = "postgres";
    String contrasena= "1234";
    Connection con = null;   
    public Conexion(){
        
    }
    

     public Connection conectar(){
        try{
            con = DriverManager.getConnection(url,usuario,contrasena);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la conexion--"+e);
        }
        return con;
    }
}
