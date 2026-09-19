import java.io.*;
public class Que4 {
	public static void main(String[] args) {
        String longestWord = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("java.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
            }
            System.out.println("Longest word: " + longestWord);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}