package edu.neu.mgen;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HWtoCh12 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Reading from file and printing in the terminal
        File file = new File("my_test_file.txt");
        System.out.println(file.exists());
        Scanner myReader = new Scanner(file);
        String data = myReader.nextLine();
        System.out.println(data);
        myReader.close();

        // Scanning text from terminal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
            String str = scanner.nextLine();

        // Writing on the file
        FileWriter myWriter = new FileWriter("my_test_file.txt");
        myWriter.write("\n" + data + str);
        myWriter.close();
        scanner.close();
        System.out.println("Successfully wrote to the file.");
    }
}
