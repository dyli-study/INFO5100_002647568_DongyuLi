public class Bowl {

        int id;
        String material;
        String usage;
        String color;
        int height;
        int width;
        int depth;
        boolean transparent;

        public Bowl (int id) {
            this.id = id;
            System.out.println("Bowl instance created with ID: " + this.id);
        }

        public void crush() {
            System.out.println("Ouch!!");
        }

        public void heat() {
            System.out.println("Heating...");
        }

}
