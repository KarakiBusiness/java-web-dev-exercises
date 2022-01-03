package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String safeFirstLine = firstLine.toLowerCase();

        System.out.println("Please enter search term");
        String searchTerm = input.nextLine();
        String safeSearchTerm = searchTerm.toLowerCase();

        Boolean SearchResult = safeFirstLine.contains(safeSearchTerm);
        System.out.println("Survey says term was found? " + SearchResult);

        int index = safeFirstLine.indexOf(safeSearchTerm);
        System.out.println("The index of the search term is " + index);
        System.out.println("The length of the search term is " + safeSearchTerm.length());
        String newFirstLine = firstLine.replace( searchTerm, "");
        System.out.println("Original sentence without search Term: " + newFirstLine);

    }
}