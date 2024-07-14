package Databasee;

import java.sql.*;

public class Database1 {
    public static void main(String[] args) throws Exception {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:Sqlite:C://sqlite//univ");
        
        Statement stm=con.createStatement();

        ResultSet rs=stm.executeQuery("select * from students");

        while(rs.next())
        {
            System.out.println(rs.getInt("roll"+" "));
            System.out.println(rs.getString("name")+" ");
        }

      stm.close();
      con.close();
    }
}
