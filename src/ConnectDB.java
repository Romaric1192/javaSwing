
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Messie
 */
public class ConnectDB {
   
     static Connection conn;
    
    public ConnectDB(){
                 try{
    Class.forName("com.mysql.jdbc.Driver");
    }catch(ClassNotFoundException e){
    System.err.println(e);
//pour afficher l erreur
    }
    try{
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ftic","root","");
        //System.out.println("connection established");
    }catch(SQLException e){System.err.println(e);}
    
    }
    Connection resultatConnexion(){
        return conn;
    }

    public static void main(String[] arg){
        ConnectDB connect = new ConnectDB();
        connect.resultatConnexion();
    }
  
    
    
    }
     

    
  
    

