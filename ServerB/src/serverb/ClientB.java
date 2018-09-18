package serverb;

import java.io.IOException;
import java.net.Socket;

public class ClientB {
    
}
 public ClientWork() throws IOException {
        Socket soc = new Socket("localhost", 8090);
        /*DataInputStream cin = new DataInputStream(soc.getInputStream());
        DataOutputStream cout = new DataOutputStream(soc.getOutputStream());
        cout.writeUTF("My name is Andrea");
        System.out.println("Server said: " + cin.readUTF());*/
        selectRandomNumber(number);
        calcCost(type);

    }