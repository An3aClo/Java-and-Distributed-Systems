package myserverb;

import java.io.DataInputStream;
import java.io.*;
import java.net.*;

public class ClientWork {

    public ClientWork() throws IOException {
        Socket s= new Socket("localhost",8090);
        DataInputStream in= new DataInputStream(s.getInputStream());
        DataOutputStream out= new DataOutputStream(s.getOutputStream());
    }
    
    public static void main(String []args) throws IOException{
    new ClientWork();
    }
    
}
