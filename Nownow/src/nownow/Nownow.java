package nownow;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Nownow {

    public int[][] numbers = new int[3][4];

    public void display() {
        getDetail();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                if (numbers[i][j] % 3 == 0) {
                    System.out.println("*");
                } else {
                    System.out.println(numbers[i][j]);
                }
                numbers[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            }

        }

    }

    public void getDetail() {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                numbers[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            }
        }

        // int row = Integer.parseInt(JOptionPane.showInputDialog("Enter your number of rows"));
        // int colums = Integer.parseInt(JOptionPane.showInputDialog("Enter your number of rows"));
    }

    public static void main(String[] args) {

        Nownow n = new Nownow();
        n.display();

    }

}
