/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynetworking;


import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class Client {
    
    Socket soc;
    ObjectOutputStream objOut;
    
    private String color;
    private int year;
    MyNetworking mv;
    
    public Client () throws IOException {
        soc = new Socket("localhost",8080);
        objOut = new ObjectOutputStream(soc.getOutputStream());
        enterDetails();
        mv = new MyNetworking(color,year);
        objOut.writeObject(mv);
    }
    
    private void enterDetails () {
        color = JOptionPane.showInputDialog("Enter the Mini Van color");
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the Mini Van year"));
    }

    public static void main(String[] args) throws IOException {
        new Client();
    }

}
