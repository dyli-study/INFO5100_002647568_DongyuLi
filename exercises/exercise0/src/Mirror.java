public class Mirror {
    int id;
    String material;
    String usage;
    String color;
    int height;
    int width;
    int depth;
    boolean transparent;

    public Mirror (int id) {
        this.id = id;
        System.out.println("Mirror instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void reflect() {
        System.out.println("Beautiful!!");
    }
}
