/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interestcalculation;

import java.util.Scanner;

public class InterestCalculation {

    public void calaNewValues(double amt, int interest) {

        System.out.println("The total balance: R" + accSum(amt, interest));

    }

    public double accSum(double amt, int interest) {

        double interestDes = interest / 100;
        double totalInterest=0;
  
        for (int i = 0; i <= 15; i++) {
            totalInterest = amt * interestDes;
            
        }
      double balance = amt + totalInterest;
        return balance;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double investAmt = s.nextDouble();
        int interest = s.nextInt();

        InterestCalculation i = new InterestCalculation();

        i.calaNewValues(investAmt, interest);
    }

}
