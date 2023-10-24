package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1 {
    public static void main(String[] args) {
        // Lab 1 part 1 - Array

           System.out.println("Part 1:");

        int[] x = { 23, 26, 74, 89, 169 };
        int[] y = { 59, 38, 82, 47, 98 };
        int[] z = new int[5];

        for (int i = 0; i < x.length || i < y.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }
        //print x
        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) 
        {
            System.out.print(x[i]);

            if (i < x.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        //print y
        System.out.print("Array y = {");

        for (int i = 0; i < y.length; i++) 
        {
            System.out.print(y[i]);
            if (i < y.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        //print z
        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) 
        {
            System.out.print(z[i]);
            if (i < z.length - 1) 
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Lab 1 part 2 - ArrayList

        System.out.println("Part 2:");

        ArrayList<String> names = new ArrayList<>();

        //adding names using add()
        names.add("Abdul");
        names.add("Haseeb");
        names.add("Khan");
        names.add("Sergey");
        names.add("Aityan");

        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) 
        {
            String switchedName = Character.toUpperCase(name.charAt(name.length() - 1))
                    + name.substring(1, name.length() - 1) + Character.toLowerCase(name.charAt(0));
            switchedNames.add(switchedName);
        }

        System.out.print("Names = {");
        for (String name : names) 
        {
            System.out.print(name);
            if (names.indexOf(name) < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Names (switched) = {");
        for (String switchedName : switchedNames) {
            System.out.print(switchedName);
            if (switchedNames.indexOf(switchedName) < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

    }
}
