/* Question 26: Check if a String is a Palindrome 
Problem Statement: 
Write a Java program that asks the user for a string and checks whether the string is a 
palindrome. A palindrome is a string that reads the same backward as forward (ignoring 
spaces and punctuation) */

import java.util.*;
public class quest26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    
}
