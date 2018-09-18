package myserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public MyServer() throws IOException {
        ServerSocket ss = new ServerSocket(8090);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        System.out.println("From the client: " + in.readUTF());
        out.writeUTF("Im from the server");
       
    }

    public static void main(String[] args) throws IOException {
        MyServer myServer = new MyServer();
    }

}
