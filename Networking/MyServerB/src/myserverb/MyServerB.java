package myserverb;

import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class MyServerB {

  
    public MyServerB() throws IOException {
  ServerSocket ss = new ServerSocket(8090);
    Socket s = ss.accept();

    DataInputStream in = new DataInputStream(s.getInputStream());
    DataOutputStream out = new DataOutputStream(s.getOutputStream());

    }

    /*public String captureDetails() {
        String option = JOptionPane.showInputDialog("Enter 1 or 2");
        return option;
    }

    public void sendToServer() throws IOException {

        captureDetails();

        if (captureDetails() == "1") {
            out.writeInt(0);
        } else if (captureDetails() == "2") {
            out.writeUTF("Hi");
        } else {

        }

    }*/

    public static void main(String[] args) throws IOException {
        new MyServerB();
    }

}
