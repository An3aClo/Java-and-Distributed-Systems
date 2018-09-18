package client;

import java.io.*;
import java.net.*;

public class Client {

    public Client() throws IOException{
        Socket soc = new Socket("localhost",8090);
        DataInputStream cin = new DataInputStream(soc.getInputStream());
        DataOutputStream cout = new DataOutputStream(soc.getOutputStream());
        cout.writeUTF("My name is Eric");
        System.out.println("Server said: " + cin.readUTF());
    }
    
    public static void main(String[] args) throws IOException {
        new Client();
    }

}
