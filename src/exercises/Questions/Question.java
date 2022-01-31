package exercises.Questions;

import org.launchcode.java.demos.lsn7interfaces.Flavor;

import java.util.ArrayList;

abstract class Question {
    String text;

    public void displayQuestion(ArrayList<String> questions){
        for (int i=0; i<questions.size(); i++)
        System.out.println(questions.get(i));
    }

    public void display(){}


}
