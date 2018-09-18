/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cent;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Cent {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter amount");
        double gross = s.nextDouble();
        double netSal = 0;
        double amount = 0;

        if (gross > 50000) {
            netSal = gross - (gross * (12.1 / 100));
            amount = amount + netSal;
        }
        if (gross >= 35000 && gross <= 50000) {
            netSal = gross - (gross * (11.3 / 100));
            amount = amount + netSal;
        }
        if (gross < 35000) {
            netSal = gross - (gross * (9.2 / 100));
            amount = amount + netSal;
        }
        System.out.println("The amount is " + amount);
    }

}
