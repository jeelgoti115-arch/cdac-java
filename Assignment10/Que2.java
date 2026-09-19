import java.io.*;

public class Que2 {
	public static void main(String[] args) {
		String inputfile = "Que2.java";
		String outputfile = "Que2Result.txt";

		try(
			BufferedReader reader = new BufferedReader(new FileReader(inputfile));
			PrintWriter writer = new PrintWriter(new FileWriter(outputfile));
		) {
			String Line;
			int Linenumber = 1;

			while((Line = reader.readLine()) != null){
				writer.print(Linenumber + " : "+Line+"\n");
				Linenumber++;
			}

			System.out.println("File Written with line numbers in file : "+outputfile);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        } finally {
			System.out.println("Operation Completed");
		}
	}
}
