import java.util.Scanner;
import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("input.txt");
        System.out.print("Enter text: ");
        fw.write(sc.nextLine());
        fw.close();
        System.out.println("Saved!");
    }
}
