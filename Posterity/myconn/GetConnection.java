package myconn;
import java.sql.*;

public class GetConnection 
{
 private static final String URL="jdbc:mysql://localhost:3306/genconnect";
 private static final String USER="root";
 private static final String PASS="root";
 
 public static Connection getConnect()
 {
   Connection con=null;
    
   try
   {
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection(URL, USER, PASS);
   }
   catch(ClassNotFoundException | SQLException e)
   {
    System.out.println("Exception : "+e);
   }
   
   return con;
 }
 public static void main(String args[]){
   GetConnection gc = new GetConnection();
   System.out.println("connection "+gc.getConnect());
 }
}
