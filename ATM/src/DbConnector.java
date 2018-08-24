/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnector {
    Connection conn=null;
    public static Connection dbConnector(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Dell\\Documents\\NetBeansProjects\\ATM.sqlite");
        JOptionPane.showMessageDialog(null, "success");
        return conn;
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
    
}
