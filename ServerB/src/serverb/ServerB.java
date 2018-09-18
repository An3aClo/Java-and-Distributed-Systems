package serverb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerB {
    
     public ServerB() throws IOException{
        ServerSocket servSoc = new ServerSocket(8090);
        Socket soc = servSoc.accept();
        DataInputStream cin = new DataInputStream(soc.getInputStream());
        DataOutputStream cout = new DataOutputStream(soc.getOutputStream());
       /* System.out.println("Client sent this: " + cin.readUTF());
        cout.writeUTF("My name is Eric.");*/
       
       
    }

    public static void main(String[] args) throws IOException {
         new ServerB();
    }
    
}
