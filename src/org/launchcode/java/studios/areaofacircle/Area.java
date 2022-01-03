package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius of circle:");
        Double radius = input.nextDouble();
//        Double PI = 3.14159265359;
//        Double area = PI * radius * radius;
//        System.out.println("Radius is: " + radius + " Area is: " + area);
        Double calculation = Circle.getArea(radius);
        System.out.println(calculation);
    }


}
