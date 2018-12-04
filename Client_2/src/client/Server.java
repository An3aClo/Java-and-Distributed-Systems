package client;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    
    public Server() throws IOException{
        ServerSocket servSoc = new ServerSocket(8090);
//        while (true) {        
            Socket soc = servSoc.accept();
            Thread t1 = new Thread(new Shape(soc));
            t1.start();
//        }
    }

    public static void main(String[] args) throws IOException {
        new Server();
    }

    
}

class Shape implements Runnable {
    
    Socket socket = new Socket();
    DataInputStream cin;
    DataOutputStream cout;  
    
    public Shape(Socket soc) throws IOException{
        this.socket = soc;    
        cin = new DataInputStream(socket.getInputStream());
        cout = new DataOutputStream(socket.getOutputStream()); 
    }

    public String triangle(){
        return "The area of a triangle is " + 55;
    }
    
    public String rectangle(){
        return "The area of a rectangle is " + 66;
    }
    
    @Override
    public void run() {
        try {
            String s = cin.readUTF();
            System.out.println("Client says: " + s);
            if (s.equals("Ndai")) {
                cout.writeUTF(triangle());
            } else {
                cout.writeUTF(rectangle());
            }
        } catch (IOException ex) {
            //Logger.getLogger(Shape.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex);
        }
    }
    
}
