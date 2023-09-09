

import java.sql.Connection;

import java.util.logging.Logger;
import java.sql.DriverManager;



public class ConnectDb {
    
    private static final String username = "etonam";
    private static final String password = "Georginio";
    private static final String dataConn ="jdbc:mysql://localhost:3306/Student_mangement";
    private static  Connection con;
    
    public static Connection getConnection(){
      try {
          Class.forName("com.mysql.cj.jdbc.driver");
          con = DriverManager.getConnection(dataConn, username, password);
          
      }catch (Exception ex) {
          System.out.println(ex.getMessage());
      }
      return con;
      
      
    }
}
