import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");

        String searchWord = "Python";
        boolean found = words.contains(searchWord);

        System.out.println("Is '" + searchWord + "' found? " + found);
    }
}
