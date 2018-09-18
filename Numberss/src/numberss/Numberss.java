package numberss;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Numberss {

    public ArrayList captureDetails() {

        ArrayList<Integer> myList = new ArrayList<Integer>();
        for (int n : myList) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            myList.add(num);
        }

        return myList;
    }

    public void printDetail(ArrayList<Integer> aa) {

        for (int a : aa) {
            System.out.println(aa);
        }

    }

    public static void main(String[] args) {

      new Numberss().printDetail( new Numberss().captureDetails());
    }

}
