import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        // Automatically closes the resource
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String msg = "Hello GitHub!";
            fos.write(msg.getBytes());
            System.out.println("Data written successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
