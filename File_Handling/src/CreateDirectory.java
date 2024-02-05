import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File directory = new File("new_directory");

        if (directory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Failed to create the directory.");
        }
    }
}
