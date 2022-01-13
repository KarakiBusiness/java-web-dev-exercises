package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        Double radius;
        //        Double PI = 3.14159265359;
        //        Double area = PI * radius * radius;
        //        System.out.println("Radius is: " + radius + " Area is: " + area);
        //radius= input.nextDouble();



            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                while (radius < 0 ){
                    System.out.println("Please Do not enter a negative number. Scanner is open for retry:");
                    radius = input.nextDouble();
                }
                System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
            } else {
                System.out.println("Not a valid number. Restart to retry");
                while (input.hasNextDouble());
            }


    }



}



