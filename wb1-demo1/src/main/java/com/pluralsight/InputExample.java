package com.pluralsight;
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name;
        name = scanner.nextLine();

        System.out.println("Hi " + name + ", lets do some math!");



        System.out.println("What is the first number?");
        double number1 = scanner.nextDouble();

        System.out.println("What is the second number?");
        double number2 = scanner.nextDouble();


        double product = number1 * number2;

        System.out.printf("The product of %.2f and %.2f is %.4f\n", number1, number2, product);

       // System.out.println("The product of " + String.format("%.2f",number1) + " and " + number2 + " is " + product);


    }
}
