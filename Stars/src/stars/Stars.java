package stars;

import java.util.Scanner;

public class Stars {
    
    public void triangle(int height){
          for (int x=0;x<=height;x++){
    for(int i=0; i<x; i++){
        System.out.println("* \t");
    }
        System.out.println(" \t");
    }
    
    }

    public static void main(String[] args) {
        Stars s=  new Stars();
     Scanner in= new Scanner(System.in);
        System.out.println("Enter height");
     int height= in.nextInt();
        s.triangle(height);
    }
    
}
