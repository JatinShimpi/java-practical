package com.jatin.practical12;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String inputFilePath = "E:\\dev\\E-commerse-website\\java practical\\src\\com\\jatin\\practical12\\input.txt";    // Path of the input file
        String outputFilePath = "output.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));

                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File has been copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
