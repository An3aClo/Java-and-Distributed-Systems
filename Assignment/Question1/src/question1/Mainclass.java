package question1;

import javax.swing.JOptionPane;

public class Mainclass {
    
    public static void main(String[] args) {
        
        //JOptionPane to capture the values
        double lengt = Double.parseDouble
            (JOptionPane.showInputDialog("Enter the lenght of the sqare"));
        double weight = Double.parseDouble
            (JOptionPane.showInputDialog("Enter the weight of the regtangle"));
        double height = Double.parseDouble
            (JOptionPane.showInputDialog("Enter the height of the regtancle"));
        float radius = Float.parseFloat
            (JOptionPane.showInputDialog("Enter radius of the circle"));
      
        //Creation of an object
        OverloadDemo o = new OverloadDemo();
        
        //Display of the area for each shape
        System.out.println("The area of the square are: " + o.Area(lengt));
        System.out.println("The area of the rectangle are: " 
                + o.Area(weight, height));
        System.out.println("The are of the circle are: " + o.Area(radius));
    }
}

