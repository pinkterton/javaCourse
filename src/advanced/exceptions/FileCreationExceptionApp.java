package advanced.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationExceptionApp {
    public static void main(String[] args) {
        createFile("OutputFile.txt");
    }

    private static void createFile(String fileName) {
//        PrintWriter outputFile = null;
        try (PrintWriter outputFile = new PrintWriter(new FileWriter(fileName))){
            outputFile.println("Hello World");
        } catch (IOException exception) {
            System.err.println("Caught an IOexception: " + exception.getMessage());
            createFile("1-" + fileName);
        }
        System.out.println("This line comes after we tried to create a file.");

    }
    }
