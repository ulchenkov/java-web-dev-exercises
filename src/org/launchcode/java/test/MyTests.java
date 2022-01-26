package org.launchcode.java.test;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyTests {
    public static void main(String[] args) {
        String text = "";
        File file = new File("bands.txt");

        // Create file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write file
        try {
            FileWriter writer = new FileWriter(file);
            writer.write("abcdbd");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read file
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String nextLine = reader.nextLine();
                text += nextLine;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(text);
    }
}
