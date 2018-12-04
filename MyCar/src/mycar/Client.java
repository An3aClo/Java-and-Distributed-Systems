package mycar;

import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

public class Client {

    public String color;
    public String year;

    public Client() throws IOException {
//        1. Create socket
//        2. make new output object
//        3. call input method
//        4. Initiate class
//        5. write to file
        Socket s = new Socket("localhost", 8080);
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        getDetail();
        MyCar mc = new MyCar(color, year);
        out.writeObject(mc);
    }

    public void getDetail() {
        color = JOptionPane.showInputDialog("Enter color");
        year = JOptionPane.showInputDialog("Enter year");
    }

    public static void main(String[] args) throws IOException {
        new Client();
    }
}
