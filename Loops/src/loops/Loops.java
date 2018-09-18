package loops;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        int count;
        int sum = 0;

        for (count = 1; count <= 15; count++) {
            sum = sum + count;
        }
        System.out.println("For loop " + sum);

        sum = 0;
        count = 0;
        while (count < 16) {
            sum = sum + count;
            count++;
        }
        System.out.println("For while loop " + sum);

        count = 1;
        sum = 0;
        do {
            sum = sum + count;
            count++;
        } while (count <= 15);
        System.out.println("Do while loop " + sum);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = s.next();

        String newName = "";
        for (count = name.length() - 1; count >= 0; count--) {
            newName = newName + name.charAt(count);

        }
        System.out.println("The name in reverse: " + newName);
        
        
        if(newName.equals(name)){
            System.out.println("They are the same");
        }else{System.out.println("Not the same");}
    }
}
