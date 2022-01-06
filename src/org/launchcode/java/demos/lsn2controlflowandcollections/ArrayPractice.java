package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {


    public static ArrayList<String> main(String[] args) {

        int[] numbers = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.println("odd number: " + numbers[i]);
            }
        }
        String sentence = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";

        String[] sentences = sentence.split("\\.");
        System.out.println(Arrays.toString(sentences));

        String[] strSplit = sentence.split("\\ ");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strSplit));
        System.out.println(strList);
        return(strList);
    }





}