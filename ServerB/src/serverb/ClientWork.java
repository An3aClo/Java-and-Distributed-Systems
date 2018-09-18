package serverb;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class ClientWork {

    public ClientWork(int number, String type) throws IOException {
        Socket soc = new Socket("localhost", 8090);
        /*DataInputStream cin = new DataInputStream(soc.getInputStream());
        DataOutputStream cout = new DataOutputStream(soc.getOutputStream());
        cout.writeUTF("My name is Andrea");
        System.out.println("Server said: " + cin.readUTF());*/
        selectRandomNumber(number);
        calcCost(type);

    }

    public void selectRandomNumber(int number) {
        Random r = new Random();
        
        int num=r.nextInt(number);
       
        System.out.println("The number given is: "+num);

    }

    public void calcCost(String type) {
        //String type = "H";
        double totalVat = 0, total = 0;

        if (type == "H") {
            totalVat = ((50 + 30) * 0.14);
            total = 50 + 30 + ((50 + 30) * 0.14);
        } else if (type == "L") {
            totalVat = ((60.50 + 36.25) * 0.14);
            total = 60.50 + 36.25 + ((60.50 + 36.25) * 0.14);
        } else if (type == "O") {
            totalVat = ((74.87 + 40.50) * 0.14);
            total = 74.87 + 40.50 + ((74.87 + 40.50) * 0.14);
        }
        System.out.println("The vat is:" + totalVat + " the total is");
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number as the end of the range");
        int num = s.nextInt();
        String type = s.next();
        
        new ClientWork(num, type);
    }
}
