package arrays;

import javax.swing.JOptionPane;

public class Arrays {

    private int[][] data = new int[3][4];

    public void Enter() {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = Integer.parseInt(JOptionPane.showInputDialog("enter number"));
            }
        }
    }

    public void Display() {

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] % 3 == 0) {
                    System.out.print("* \t");
                } else {
                    System.out.print(data[i][j] + "\t ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Arrays a = new Arrays();
        a.Enter();
        a.Display();
    }

}
