import java.io.*;
import java.util.*;
public class Que7 {
	public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("java.txt")
            );
            HashMap<String, Integer> words = new HashMap<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] wordArray = line.split("\\s+");
                for (String word : wordArray) {
                    word = word.toLowerCase();
                    word = word.replaceAll("[^a-zA-Z0-9]", "");
                    if (!word.isEmpty()) {
                        if (words.containsKey(word)) {
                            words.put(word, words.get(word) + 1);
                        } else {
                            words.put(word, 1);
                        }
                    }
                }
            }
            System.out.println("Duplicate words are:");
            for (String word : words.keySet()) {
                if (words.get(word) > 1) {
                    System.out.println(word);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}