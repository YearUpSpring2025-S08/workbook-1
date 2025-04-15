package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get our know values...
        System.out.print("What is the first number? ");
        double number1 = scanner.nextDouble(); //leaves a CRLF next on the stream.

        System.out.print("What is the second number? ");
        double number2 = scanner.nextDouble(); //leaves a CRLF next on the stream.
        scanner.nextLine();  //do this to remove the CRLF to prepare for getting a string below.

        System.out.println("Possible calculations");
        System.out.println("    (A)dd");
        System.out.println("    (S)ubtract");
        System.out.println("    (M)ultiply");
        System.out.println("    (D)ivide");
        System.out.print("Please select an option: ");

        String operation = scanner.nextLine(); //should be text response to above prompt

        //Calculate our unknown values...
        double result = number1 * number2;

        //Display the results...
        System.out.printf("%f %s %f = %f", number1, operation, number2, result);


    }
}