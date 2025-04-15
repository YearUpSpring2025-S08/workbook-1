package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Get the known values.
        System.out.print("Please enter the employee name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter the number of hours worked this pay period: ");
        float hoursWorked = scanner.nextFloat();

        System.out.print("Please enter the base pay rate: ");
        double payRate = scanner.nextDouble();


        //Calculate the unknown
        double grossPay = hoursWorked * payRate;


        //Display the results
        System.out.printf("%s worked %f hours at a rate of %f and made %f", name, hoursWorked, payRate, grossPay);

    }
}
