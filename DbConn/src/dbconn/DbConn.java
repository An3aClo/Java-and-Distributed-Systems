package dbconn;

import java.sql.*;

public class DbConn {

    public String name = "Reme";
    public String surname = "Cloete";
    public int age = 22;
    Connection conn;

    public void dbConnection() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "");
        // conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest", "root", "");
        System.out.println(conn);
        InsertDB();
        selectAll();

    }

    public void InsertDB() throws SQLException {
        String myQuery = "INSERT INTO `info`(`Name`, `Surname`, `age`) VALUES ('" + name + "','" + surname + "','" + age + "' )";
        PreparedStatement st = conn.prepareStatement(myQuery);
        st.execute();
        // Statement s = conn.createStatement();
        //s.execute(myQuery);

    }
    public void selectAll() throws SQLException{
        Statement statement = conn.createStatement();
    String s="SELECT `Name`, `Surname`, `age` FROM `info`";
    ResultSet rs=statement.executeQuery(s);
    while(rs.next()){
        String n=rs.getString("Name");
        String su= rs.getString("Surname");
        int age=rs.getByte("age");
        
        System.out.println("Nmae:"+n+" Surname: "+su+" age: "+age);
    }
    }

    public static void main(String[] args) throws SQLException {
        new DbConn().dbConnection();
    }

}
