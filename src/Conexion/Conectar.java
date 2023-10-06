/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author danie
 */
public class Conectar {
    Connection cn;
    Statement st;
    
    public Connection conexion(){
        
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/tarea8","root","Grupo3@");
            System.out.println("Conectado");
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
       return cn;
                
    }
    
}
