package client;

import java.io.*;
import java.net.*;

public class Server {
    
    public Server() throws IOException{
        ServerSocket servSoc = new ServerSocket(8090);
        Socket soc = servSoc.accept();
        DataInputStream cin = new DataInputStream(soc.getInputStream());
        DataOutputStream cout = new DataOutputStream(soc.getOutputStream());
        System.out.println("Client sent this: " + cin.readUTF());
        cout.writeUTF("Im out from the server.");
    }

    public static void main(String[] args) throws IOException {
        new Server();
    }

}
