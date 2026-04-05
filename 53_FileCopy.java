import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("source.txt");
        FileOutputStream out = new FileOutputStream("dest.txt");
        int data;
        while ((data = in.read()) != -1) out.write(data);
        in.close(); out.close();
        System.out.println("File Copied.");
    }
}
