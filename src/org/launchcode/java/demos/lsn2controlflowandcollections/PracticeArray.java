package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(numbers));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("I","me","you","them","whose","nobody", "someone"));
        fiveLetterAuthentication(names);
        userLetterAuthentication(names);

    }

   public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int i: arr){
            if ( i % 2 == 0 ){
                total += i;
            }
        }
        return total;
   }

   public static void fiveLetterAuthentication(ArrayList<String> arr){

        for (String i : arr){
            if (i.length() == 5){
                System.out.println(i);
            }
        }

   }

   public static void userLetterAuthentication(ArrayList<String> arr){
       System.out.println("Please enter the desired word length criterion");
       Scanner input = new Scanner(System.in);
       int inputLength = input.nextInt();
       for (String i : arr){
           if (i.length() == inputLength){
               System.out.println(i);
           }
       }
   }

   public static void userLetterAuthenticationFromStory(ArrayList<String> arr){
       System.out.println("Please enter the desired word length criterion(StoryCheck)");
       Scanner input = new Scanner(System.in);
       int inputLength = input.nextInt();
       for (String i : arr){
           if (i.length() == inputLength){
               System.out.println(i);
           }
       }

   }


}
