package mycar;

import java.io.*;
import java.net.*;

public class Server {
    
    private MyCar mc;
    
    public Server() throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Car.txt"));
        mc = (MyCar)in.readObject();
        String detail = "Color"+mc.getColor()  + "Year "+mc.getYear();
        out.writeObject(detail);
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Server();
    }
}
