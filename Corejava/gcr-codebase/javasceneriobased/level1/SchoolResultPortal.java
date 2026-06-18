import java.io.*;
import java.util.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "reportcard.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile, true)) // append mode
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[0];
                int marks1 = Integer.parseInt(data[1]);
                int marks2 = Integer.parseInt(data[2]);
                int marks3 = Integer.parseInt(data[3]);

                double average = (marks1 + marks2 + marks3) / 3.0;

                bw.write("----- Report Card -----");
                bw.newLine();
                bw.write("Name: " + name);
                bw.newLine();
                bw.write("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
                bw.newLine();
                bw.write("Average: " + average);
                bw.newLine();
                bw.write("-----------------------");
                bw.newLine();
                bw.newLine();
            }

            System.out.println("Report cards generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while processing file: " + e.getMessage());
        }
    }
}