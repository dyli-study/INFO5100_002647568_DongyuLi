public class Bottle {
    int id;
    String material;
    String usage;
    String color;
    int height;
    int width;
    int depth;
    boolean transparent;

    public Bottle(int id) {
        this.id = id;
        System.out.println("Bottle instance created with ID: " + this.id);
    }

    public void crush() {
        System.out.println("Ouch!!");
    }

    public void heat() {
        System.out.println("Heating...");
    }

    public class PlasticBottle {
        int id;
        String material;
        String usage;
        String color;
        int height;
        int width;
        int depth;
        boolean transparent;

        public PlasticBottle(int id) {
            this.id = id;
            System.out.println("Bottle instance created with ID: " + this.id);
        }

        public void crush() {
            System.out.println("Ouch!!");
        }

        public void heat() {
            System.out.println("Heating...");
        }
    }

    public class SteelBottle {
        int id;
        String material;
        String usage;
        String color;
        int height;
        int width;
        int depth;
        boolean transparent;

        public SteelBottle(int id) {
            this.id = id;
            System.out.println("Bottle instance created with ID: " + this.id);
        }

        public void crush() {
            System.out.println("Ouch!!");
        }

        public void heat() {
            System.out.println("Heating...");
        }
    }
}