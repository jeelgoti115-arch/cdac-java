import java.io.*;
public class Que5 {
	public static void main(String[] args) {
        int shift = 3;
        try {
            BufferedReader br = new BufferedReader(
                new FileReader("java.txt")
            );
            BufferedWriter enc = new BufferedWriter(
                new FileWriter("enc_message.txt")
            );
            String line;
            while ((line = br.readLine()) != null) {
                String encrypted = "";

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char) ((ch - 'A' + shift) % 26 + 'A');
                    }
                    else if (ch >= 'a' && ch <= 'z') {
                        ch = (char) ((ch - 'a' + shift) % 26 + 'a');
                    }
                    encrypted = encrypted + ch;
                }
                enc.write(encrypted);
                enc.newLine();
            }
            br.close();
            enc.close();
            System.out.println("Message encrypted successfully.");
            BufferedReader encRead = new BufferedReader(
                new FileReader("enc_message.txt")
            );
            BufferedWriter dec = new BufferedWriter(
                new FileWriter("dec_message.txt")
            );
            while ((line = encRead.readLine()) != null) {
                String decrypted = "";
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch >= 'A' && ch <= 'Z') {
                        ch = (char) ((ch - 'A' - shift + 26) % 26 + 'A');
                    }
                    else if (ch >= 'a' && ch <= 'z') {
                        ch = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                    }
                    decrypted = decrypted + ch;
                }
                dec.write(decrypted);
                dec.newLine();
            }
            encRead.close();
            dec.close();
            System.out.println("Message decrypted successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}