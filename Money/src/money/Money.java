package money;

import java.util.Scanner;

public class Money {

    public double coinage(double amount) {
        
        double remainder200, remainder100, remainder50, remainder20, remainder10, remainder5, remainder050, remainder020 = 0;
        double twoHundred, oneHundered, fifty, twenty, ten, five, fivtyCents, twentyCents;

        twoHundred = amount / 200;
        remainder200 = amount % 200;

        oneHundered = remainder200 / 100;
        remainder100 = amount % 100;

        fifty = remainder100 / 50;
        remainder50 = amount % 50;

        twenty = remainder50 / 20;
        remainder20 = amount % 20;

        ten = remainder20 / 10;
        remainder10 = amount % 10;

        five = remainder10 / 5;
        remainder5 = amount % 5;

        fivtyCents = remainder5 / 0.50;
        remainder050 = amount % 0.50;

        twentyCents = remainder020 / 0.20;
        remainder020 = amount % 0.20;

        System.out.println(" The amount of R200 notes is : " + remainder200);
        System.out.println(" the amount of R100 notes is : " + remainder100);
        System.out.println(" the amount of R50 notes is :" + remainder50);
        System.out.println("the amount of R20 notes is : " + remainder20);
        System.out.println("the amount of R10 notes is : " + remainder10);
        System.out.println("the amount of 50c cons is : " + remainder050);
        System.out.println("the amount of 20c coins is : " + remainder020);
        return amount;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter amount");

        double amount = s.nextDouble();
        new Money().coinage(amount);
    }

}
