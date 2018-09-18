package employee;

import java.util.Scanner;

public class Employee {

    private String name, surname;
    private double gross;

    Scanner s = new Scanner(System.in);

    public Employee() {
     this.name = name;
        this.surname = surname;
        this.gross = gross;
    }

    public void enterDetail() {
        System.out.println("Enter Name");
        name = s.next();
        System.out.println("Enter surname");
        surname = s.next();
        System.out.println("Enter gross salary");
        gross = s.nextDouble();
    }

    public double calculateSalary() {
       
        double netSalary = 0;
        if (gross < 50000) {
            netSalary = gross - (gross * (11.3/100));
        } else if (gross >= 35000 && gross <= 50000) {
            netSalary = gross - (gross * (9.72/100));
        } else if (gross > 50000) {
            netSalary = gross - (gross * (7.11/100));
        }
        return netSalary;
    }

    public void show() {
        enterDetail();
        System.out.println(name + " " + surname + " your gross salary is: R " + gross + " and the net salalary is: R " + calculateSalary());
    }

    public static void main(String[] args) {
        new Employee().show();
    }

}
