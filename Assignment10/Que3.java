import java.io.*;
public class Que3 {
	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("java.txt"));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}