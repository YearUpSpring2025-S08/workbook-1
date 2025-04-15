package com.pluralsight;

public class MethodsExample {




    public static void main(String[] args){
        //do what comes here....


        foo();

        message = "another greeting";

        moo();
        foo();

        message = "final greeting";

        foo();

        //as this method ends, the program is over...
    }

    public static void foo(){

        System.out.println(message);
        System.out.println("FOOO 1");
        System.out.println("FOOO 2");
        System.out.println("FOOO 3");
    }

    public static String message = "Hello World";

    public static void moo(){
        System.out.println("MOO 1");
        System.out.println("MOO 2");
        System.out.println("MOO 3");
    }


}
