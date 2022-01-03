package exercises;

import java.util.Scanner;

public class HelloWorld{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        String name = input.nextLine();
        String named = name.toLowerCase();
        System.out.println("Hello " + named.substring(0,1).toUpperCase() + named.substring(1));



    }


}