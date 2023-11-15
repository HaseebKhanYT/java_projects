package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Collections;

public class HWtoCh8 {

    private static void printStrings(String[] str) { // method to print strings
        for (String element : str) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array");
        System.out.println();
    }

    private static void printStrings(ArrayList<String> str) { // method to print ArrayList of strings (an overloading method)
        for (String element : str) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array");
        System.out.println();
    }

    private static String capitalizeFirstLetter(String input) { // method to capitalize the first character of the string
        return Character.toUpperCase(input.charAt(0)) + input.substring(1).toLowerCase();
    }

    private static String reverseString(String input) { // method to reverse a string
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }

    private static void reverseStrings(String[] str) { //method to reverse the Array of strings

        ArrayList<String> reversed = new ArrayList<String>();

        for (int i = 0; i < str.length; i++) {
            String originalString = str[i];
            String reversedString = reverseString(originalString);
            reversed.add((capitalizeFirstLetter(reversedString)));
        }

        Collections.reverse(reversed);

        printStrings(reversed);

    }

    public static void main(String[] args) {
        String[] names = { "Anne", "John", "Alex", "Jessica" };
        String[] planets = { "Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter" };

        // print Original Array
        System.out.println();
        System.out.println("Original Array:");
        printStrings(names);

        // print Resultant Array
        System.out.println();
        System.out.println("Resultant Array:\n");
        reverseStrings(names);
        
        // print Original Array
        System.out.println();
        System.out.println("Original Array:");
        printStrings(planets);

        // print Resultant Array
        System.out.println();
        System.out.println("Resultant Array:\n");
        reverseStrings(planets);

    }
}
