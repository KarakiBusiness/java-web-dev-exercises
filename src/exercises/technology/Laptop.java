package exercises.technology;

import java.util.Scanner;

public class Laptop extends Computer{

    static Integer angle;

    public static void bend() {
        Scanner input = new Scanner(System.in);
        System.out.println("To what angle would you like to bend");
        angle = input.nextInt();
    }
}
