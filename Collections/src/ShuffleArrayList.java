import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Card1");
        cards.add("Card2");
        cards.add("Card3");

        // Shuffling the ArrayList
        Collections.shuffle(cards);

        System.out.println("Shuffled cards: " + cards);
    }
}
