package org.launchcode.java.demos.lsn2controlflowandcollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//exercise 1 below
public class Practice {
    static void sumOfEven(int[] array){
        int sum = 0;
        for (int i=0; i<array.length; i++){
            if (i%2 == 0){
                sum += i;

            }
        }
        System.out.println(sum);
    }
//exercise 2 below
    static void printStringOfFive(ArrayList<String> list){
        for (int i=0; i<list.size(); i++){
            if(list.get(i).length() == 5) {
                System.out.println(list.get(i));
            }
        }

    }
//exercise 3 below
    static void printStringOfUserSize(ArrayList<String> list){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter string search length");
        int length = input.nextInt();
        for (int i = 0; i<list.size(); i++){
            if (list.get(i).length() == length){
                System.out.println(list.get(i));

            }
        }
    }

    static void printSizedArrayComponent(ArrayList<String> list){


    }




//main ignition
    public static void main(String[] args) {
        //Exercise 1
        int dataSet[] = {1,2,3,4,5,6,7,8,9,0};
        sumOfEven(dataSet);

        //Exercise 2
        ArrayList<String> pronouns = new ArrayList<>(Arrays.asList("I","me","you","them","whose","nobody", "someone"));
        printStringOfFive(pronouns);

        //Exercise 3
        // we used line 37 ;
        printStringOfUserSize(pronouns);

    }
}
