import java.io.*;
import java.util.*;
public class Que6 {
	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("java.txt")
            );
            HashSet<String> words = new HashSet<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] wordArray = line.split("\\s+");
                for (String word : wordArray) {
                    word = word.toLowerCase();
                    word = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (!word.isEmpty()) {
                        words.add(word);
                    }
                }
            }
            System.out.println("Unique words are:");
            for (String word : words) {
                System.out.println(word);
            }
            System.out.println("Total unique words: " + words.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}