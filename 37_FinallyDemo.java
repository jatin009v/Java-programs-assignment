import java.io.*;

public class FinallyDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            System.out.println("Closing resources...");
        }
    }
}
