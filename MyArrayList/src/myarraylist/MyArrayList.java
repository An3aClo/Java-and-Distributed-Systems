package myarraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

public class MyArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();//import
        list.add("Ndai");
        list.add("David");
        list.add("Lee");
        list.add("Taylor");

        //prints the arraylist
        for (int b = 1; b < 6; b++) {
            String name = JOptionPane.showInputDialog("Enter a number");//import javax.swing.*
            list.add(name);
        }

        for (String y : list) {
            System.out.println("Names printed via a for loop: " + y);
        }

        //Iterator prints the array lists
        Iterator myList = list.iterator();// import java.util.*
        // hasNext();
        myList.toString();
        while (myList.hasNext()) {
            System.out.println("Names printed with an iterator: " + myList.next());
        }
        
        //Sorts elements
        TreeSet<String> t=new TreeSet(); //import java.util.*
        t.add("Andrea");
        t.add("Rene");
        t.add("Jeandre");
       for (String y : t) {//print y not t
            System.out.println("Names printed via a for each loop: " + y);
        }
        
    }

}
