import java.io.*;

public class LineCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        int count = 0;
        while (br.readLine() != null) count++;
        System.out.println("Total Lines: " + count);
        br.close();
    }
}
