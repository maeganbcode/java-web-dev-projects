package org.launchcode;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’" +
                " thought Alice ‘without pictures or conversation?";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a term to search for within the sentence");
        String searchTerm = input.nextLine();

        boolean found = sentence.toLowerCase().contains(searchTerm.toLowerCase());

        if(found) {
            System.out.println("True - The term \"" + searchTerm + "\" was found in the sentence.");
        } else {
            System.out.println("False - The term \"" + searchTerm + "\" was not found in the sentence.");
        }

        Integer index = sentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + "." +
                "Your term is " + length + " characters long.");
            String modifiedSentence = sentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

        input.close();

    }
}
