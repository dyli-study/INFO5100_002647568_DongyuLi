public class Chair {
    int id;
    String material;
    String color;
    String brand;
    int height;
    int width;
    int depth;
    boolean transparent;

    public Chair (int id) {
        this.id = id;
        System.out.println("Chair instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void sit() {
        System.out.println("Stable.");
    }
}
