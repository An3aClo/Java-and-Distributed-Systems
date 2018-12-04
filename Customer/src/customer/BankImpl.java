package customer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankImpl extends Bank {

    BankImpl() throws RemoteException {
    }

    public List<Customer> getCustomer() {

        List<Customer> list = new ArrayList<Customer>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM `detail`");
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            Customer c= new Customer();
            c.setAccountNum(rs.getInt(1));
            c.setName(rs.getString(2));
            c.setSurname(rs.getString(3));
            c.setEmail(rs.getString(4));
            c.setAmount(rs.getInt(5));
            list.add(c);
            conn.close();
            }
                   
        } catch (Exception e) {
            System.out.println("Error is: "+e);
        }

        return list;
    }
}
