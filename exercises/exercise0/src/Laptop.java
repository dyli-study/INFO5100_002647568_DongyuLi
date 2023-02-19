public class Laptop {
    int id;
    String usage;
    String color;
    String brand;
    int height;
    int width;
    int depth;
    boolean forGame;

    public Laptop (int id) {
        this.id = id;
        System.out.println("Laptop instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void play() {
        System.out.println("Loading...");
    }

}
