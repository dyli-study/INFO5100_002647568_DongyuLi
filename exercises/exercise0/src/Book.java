public class Book {
    int id;
    String title;
    String author;
    String isbn;
    int height;
    int width;
    int depth;
    boolean hardcover;

    public Book (int id) {
        this.id = id;
        System.out.println("Book instance created with ID: " + this.id);
    }

    public void open() {

    }

    public void read() {
        System.out.println("Nice book.");
    }
}
