package storedproc;

import java.lang.ProcessBuilder.Redirect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;

public class StoredProc {

    Connection conn;
    int age;
    String name;

    public void dbConnection() throws SQLException {
       // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest", "root", "");
        System.out.println(conn);
    }

    public void search() throws SQLException {

        CallableStatement cbst = conn.prepareCall("{call choose(?,?,?)}");
        cbst.setInt(1, age);
        cbst.registerOutParameter(2,Types.INTEGER);
        cbst.setString(3, name);
        
       // cbst.registerOutParameter(2, Types.INTEGER);
        ResultSet rs = cbst.executeQuery();
      if(cbst.getInt(2)>0){
        while (rs.next()) {
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String id = rs.getString("id");
            int age = rs.getInt("age");
            System.out.println(name+"\t"+surname+"\t"+id+"\t"+age);
        }
      }else{
          System.out.println("There is no records");
      }
    }

    public void enterDetaol() {
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
         name = JOptionPane.showInputDialog("Enter name");
    }

    public static void main(String[] args) throws SQLException {
        StoredProc sp = new StoredProc();
        sp.dbConnection();
        sp.enterDetaol();
        sp.search();
    }

}
