/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynetworking;


import java.io.Serializable;

public class MyNetworking implements Serializable{
    
    String color;
    int year;

    public MyNetworking(String color, int year) {
        this.color = color;
        this.year = year;
    }    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }    

    public static void main(String[] args) {
        
    }

}
