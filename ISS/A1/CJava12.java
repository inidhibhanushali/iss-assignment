import java.io.*;

public class CJava12 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        readingFile(inputFile);
        writingFile(outputFile);
        readingFile(outputFile);
    }

    public static void readingFile(String inputFile) {
        // Read from file using Input Stram
        int byteData;
        try{
            InputStream reader = new FileInputStream(inputFile);
            while ((byteData = reader.read()) != -1) {
                System.out.print((char)byteData);
            }
            System.out.println("\n");
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from the file " + e.getMessage());
        }
    }

    public static void writingFile(String outputFile) {
        // Write to file using BufferedWritter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("First Line");
            writer.newLine();
            writer.write("This is a eg text.");
            writer.newLine();
            writer.write("End of this file here");
        } catch (IOException e) {
            System.out.println("Error writing to the file " + e.getMessage());
        }
    }
}
