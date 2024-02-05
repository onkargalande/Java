import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingWithExceptionHandling {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void readFile(String fileName) throws IOException {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
