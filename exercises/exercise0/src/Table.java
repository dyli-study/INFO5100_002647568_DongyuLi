public class Table {
    int id;
    String material;
    String color;
    String brand;
    int height;
    int width;
    int depth;
    boolean smooth;

    public Table (int id) {
        this.id = id;
        System.out.println("Table instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void use() {
        System.out.println("Stable.");
    }
}
