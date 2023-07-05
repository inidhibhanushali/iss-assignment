import java.io.*;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CJava6 {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught - " + e.getMessage());
        } finally {
            System.out.println("\nThis is printed whether try or catch whatever executes by finally...\n\n");
        }

        try {
            readFromFile("file.txt");
        } catch (IOException e) {
            System.out.println("IOException caught with " + e.getMessage());
        }

        try {
            process();
        } catch (MyException e) {
            System.out.println("MyException caught with " + e.getMessage());
        }
    }

    public static void divide(int dividend, int divisor) {
        try {
            int quotient = dividend / divisor;
            System.out.println("Answer = " + quotient);
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static void readFromFile(String filename) throws IOException {
        // Code for reading from a file
        throw new IOException("File not found of name " + filename);
    }

    public static void process() throws MyException {
        try {
            // Some processing code
            throw new MyException("Custom exception occurred");
        } catch (Exception e) {
            throw new MyException("Error while processing: " + e.getMessage());
        }
    }
}
