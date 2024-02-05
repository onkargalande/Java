import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteTextFile {
    public static void main(String[] args) {
        // Write to a file
        try (PrintWriter writer = new PrintWriter("output_text.txt")) {
            writer.println("Hello, this is a text file.");
            writer.println("Second line of text.");
            System.out.println("Data written to file successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println("-------------------------");

        // Read from a file
        try (Scanner scanner = new Scanner(new File("output_text.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
