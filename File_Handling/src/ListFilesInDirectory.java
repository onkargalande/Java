import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        File directory = new File("directory_path");

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
