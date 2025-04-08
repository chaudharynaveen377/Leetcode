package A_Copilot;

import java.util.Scanner;

public class Lemda_function {
    @FunctionalInterface
    interface CharChecker {
        boolean isVowel(char ch);
    }
        public static void main(String[] args) {

            // Lambda function to check if a character is a vowel
            CharChecker isVowel = (char ch) -> ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';

            // Test the lambda function
            char testChar = 'a';
            if (isVowel.isVowel(testChar)) {
                System.out.println(testChar + " is a vowel.");
            } else {
                System.out.println(testChar + " is not a vowel.");
            }
        }


}

