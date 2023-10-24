package edu.neu.mgen;

import java.util.Scanner;

public class HWtoCh6 {

    enum Length {
        SHORT,
        MEDIUM,
        LONG,
    }

    public static void main(String[] args) {
        //Declarations
        Scanner input = new Scanner(System.in);
        Length strLength;

        // Input for a word
        System.out.println("Enter any word: ");
        // 
        double start = System.currentTimeMillis();
        String str = input.nextLine();
        
        double end = System.currentTimeMillis();
        double time = (end-start)/ 1000;

        if (str.length() <= 0) {
            System.out.println("You did not enter any word");
            return;
        } else if (str.length() > 0 && str.length() <= 5) {
            strLength = Length.SHORT;
        } else if (str.length() > 5 && str.length() <= 10) {
            strLength = Length.MEDIUM;
        } else {
            strLength = Length.LONG;
        }

        System.out.println("Your word is " + str);
        System.out.println("It is a " + strLength);
        System.out.println("The length of the word is " + str.length());
        System.out.println("Your reaction time is " + time + " seconds");


    }
}
