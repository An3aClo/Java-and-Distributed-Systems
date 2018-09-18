package myhashmap;

import java.util.*;
import javax.swing.JOptionPane;

public class MyHashMap {

    public void CaptureDetail() {
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();//Doesnt allow doubles 

        for (int i = 1; i < 4; i++) {
            String name = JOptionPane.showInputDialog("Enter name");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID"));
            myMap.put(id, name);
        }
        System.out.println(myMap);

        Set<Integer> myId = myMap.keySet();// CREATE A SET OF THE KEYS IN THE HASMAP

        for (Integer x : myId) {//FOR EACH
            System.out.println(x);
        }

        Collection<String> name = myMap.values();//CREATE A COLLECTION OF THE VALUES OF THE HASHMAP
        for (String y : name) {
            System.out.println(y);
        }

        String myName;
        for (Integer x : myId) {//FOR EACH
            myName = myMap.get(myMap.values());
            System.out.println("Printed with a for each " + myName);//returns null
        }

        /* Creat hashmap<Integer, name>
              use for each print the id and the name
           
          Create a treemap
           
         */
    }

    public static void main(String[] args) {
        new MyHashMap().CaptureDetail();
    }

}
