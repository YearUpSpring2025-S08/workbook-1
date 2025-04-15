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
        double grossPay;   // = hoursWorked * payRate;

//        if (hoursWorked <= 40){
//            grossPay = hoursWorked * payRate;
//        }
//        else{
//
//            float overtimeHours = hoursWorked - 40;
//            double basePay = 40 * payRate;
//            double overtimeRate = payRate * 1.5;
//            double overtimePay = overtimeHours * overtimeRate;
//
//            grossPay = basePay + overtimePay;
//
//        }

        if (hoursWorked > 40){
            grossPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
        }
        else{
            grossPay = hoursWorked * payRate;
        }



        //Display the results
        System.out.printf("%s worked %f hours at a rate of %f and made %f", name, hoursWorked, payRate, grossPay);

    }
}
