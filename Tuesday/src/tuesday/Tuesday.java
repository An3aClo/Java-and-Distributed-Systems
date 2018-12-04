package tuesday;

import java.sql.*;
import java.util.Scanner;

public class Tuesday {

    public String id;
    public String name;
    public String surname;
    public int age;
    Connection conn;

    public void dbConnect() throws SQLException {

        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        System.out.println("The connection " + conn);
        dbInsert();
        dbSelect();
    }

    public void dbInsert() throws SQLException {
        String myQuery = "INSERT INTO `detail`(`id`, `name`, `surname`, `age`) VALUES ('12345','Andrea','Cloete',21)";
        PreparedStatement st = conn.prepareStatement(myQuery);
        st.execute();
    }

    public void dbSelect() throws SQLException {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM `detail`");
        while (rs.next()) {
            String id = rs.getString("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            int age = rs.getInt("age");

            System.out.println(id + "\t" + name + "\t" + surname + "\t" + age);
        }

    }
    public void input(){
        Scanner in= new Scanner(System.in);
                System.out.println("Enter id");
        String id=in.next();
    }

    public static void main(String[] args) throws SQLException {
        Tuesday t = new Tuesday();
        t.dbConnect();
    }

}
/*package mytest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyTest {

    public String name = "Reme";
    public String surname = "Cloete";
    public int age = 22;
    Connection conn;

    public void dbConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "");
        // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "");
        System.out.println(conn);
        InsertDB();

    }

    public void InsertDB() throws SQLException {
        String myQuery = "INSERT INTO `info`(`Name`, `Surname`, `age`) VALUES ('" + name + "','" + surname + "','" + age + "' )";
        PreparedStatement st = conn.prepareStatement(myQuery);
        st.execute();
       // Statement s = conn.createStatement();
        //s.execute(myQuery);

    }

    public static void main(String[] args) throws SQLException {
        new MyTest().dbConnection();
    }

}
 */
