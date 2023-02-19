public class Screen {
    int id;
    String material;
    String usage;
    String brand;
    int height;
    int width;
    int depth;
    boolean blueLightProof;

    public Screen (int id) {
        this.id = id;
        System.out.println("Screen instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void watch() {
        System.out.println("Light changing...");
    }
}
