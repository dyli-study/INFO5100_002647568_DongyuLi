public class Mouse {
    int id;
    int price;
    String color;
    String brand;
    int height;
    int width;
    int depth;
    boolean forGame;

    public Mouse (int id) {
        this.id = id;
        System.out.println("Mouse instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void click() {
        System.out.println("Loading...");
    }
}
