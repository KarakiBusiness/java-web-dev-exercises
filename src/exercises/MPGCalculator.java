package exercises;

import java.util.Scanner;

public class MPGCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("HOw many miles have you traveled?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas was used?");
        double gallonsConsumed = input.nextDouble();

        double mpg = milesDriven / gallonsConsumed;
        System.out.println("vehicle MPG is " + mpg + "miles per gallon");

    }




}
