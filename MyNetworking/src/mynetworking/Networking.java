/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynetworking;


import java.io.*;
import java.net.*;

public class Networking {
    
    private MyNetworking obj;
    
    public Networking () throws IOException, ClassNotFoundException {
        ServerSocket servSoc = new ServerSocket(8080);
        while (true) {
            Socket soc = servSoc.accept();
            ObjectInputStream objin = new ObjectInputStream(soc.getInputStream());
            FileOutputStream fout = new FileOutputStream("car.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            obj = (MyNetworking)objin.readObject();
            String details = "Color: " + obj.getColor() + ", Year: " + obj.getYear();
            objout.writeObject(details);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new Networking();
    }

}