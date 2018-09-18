package mytreeset;

import java.util.HashSet;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet();//sorting from a to z it doesnt print doubles --import
        t.add("Zfdsd");
        t.add("Adffsd");
        t.add("Adds");
        t.add("Msd");

        for (String b : t) {//print b not t
            System.out.println("Treeset: " + b);
        }

        t.remove("Msd");//removes an item

        for (String b : t) {//print b not t
            System.out.println("New Treeset: " + b);
        }

        for (String c : t) {
            c = c.toLowerCase();
            System.out.println("To lower case: " + c);
        }
        for (String c : t) {
            c = c.toUpperCase();
            System.out.println("To uppercase case: " + c);
        }
        System.out.println("The size of the tree set is: "+t.size());

        System.out.println();

        System.out.println("");

        HashSet<String> myHash = new HashSet();//import
        //sort and remove double elments
        myHash.add("a");
        myHash.add("z");
        myHash.add("a");

        for (String a : myHash) {
            System.out.println("Hase set:" + a);
        }

    }

}
