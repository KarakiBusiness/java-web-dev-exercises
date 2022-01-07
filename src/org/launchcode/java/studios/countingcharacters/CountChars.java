package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        HashMap<Character,Integer> tony= new HashMap<>();
        //String myStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String myStr = scan.nextLine();
        myStr = myStr.toLowerCase();
        char[] charactersInString = myStr.toCharArray();

        for (char ch : charactersInString){
            if(!tony.containsKey(ch)){
                tony.put(ch,1);
            }else {
                tony.put(ch,tony.get(ch) + 1);
            }
        }
       // System.out.println(tony);
        for ( Map.Entry<Character, Integer> entry : tony.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


}
