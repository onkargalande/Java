public class Book {
    String title;
    String author;

    // Parameterized constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        book1.displayInfo();
    }
}
