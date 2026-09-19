import java.io.*;

public class Que1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("1.txt");
        String resultFileName = "Result.txt";
        
        int i;
        int linecount = 0;
        int wordcount = 0;
        int charcount = 0;

        while ((i = fr.read()) != -1) { 
            charcount++;

            if (i == '\n') {
                linecount++;
            }

            if (i == ' ') {
                wordcount++;
            }
        }
        fr.close();

        int totalLines = linecount + 1;
        int totalWords = wordcount + totalLines;

        FileWriter fw = new FileWriter(resultFileName);
        fw.write("Number of characters: " + charcount + "\n");
        fw.write("Number of lines: " + totalLines + "\n");
        fw.write("Number of Words: " + totalWords + "\n");
        fw.close();

        System.out.println("Results written to " + resultFileName + " successfully.");
    }
}