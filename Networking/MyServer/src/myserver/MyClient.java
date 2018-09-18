package myserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {

    public MyClient() throws IOException {
        Socket s = new Socket("localhost", 8090);
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        out.writeUTF("I am from the client");
        System.out.println("From the server: "+in.readUTF());
    }

    public static void main(String[] args) throws IOException {
        MyClient myClient = new MyClient();
    }
}
