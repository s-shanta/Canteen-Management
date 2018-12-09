/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodmanagement;

/**
 *
 * @author pikachu12
 */
import java.sql.*;
public class Connect {
     Connection con=null;
     
     public static Connection ConnecrDb(){
    try{
           Class.forName("org.sqlite.JDBC");
           Connection con=DriverManager.getConnection("jdbc:sqlite:F:\\2.1 projectfood\\FoodManagement\\food.sqlite.sqlite");
          
          return con;
        }
        catch(Exception e)
        {
            System.out.println(""+e);
            return null;
        }
    
} 
    
}
