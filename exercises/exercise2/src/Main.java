public class Main {
    public static void main(String[] args) {

        Shape Triangle = new Triangle("Purple",3,4,5,4,6);
        System.out.println("Color of the Triangle:" + Triangle.getColor());
        System.out.println("Area of the Triangle: " + Triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + Triangle.calculatePerimeter());

        Shape Rectangle = new Rectangle("Blue", 8, 6);
        System.out.println("Color of the Rectangle:" + Rectangle.getColor());
        System.out.println("Area of the Rectangle: " + Rectangle.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + Rectangle.calculatePerimeter());

        Shape Circle = new Circle("Pink", 15);
        System.out.println("Color of the Circle:" + Circle.getColor());
        System.out.println("Area of the Circle: " + Circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + Circle.calculatePerimeter());

        Shape Square = new Square("Red", 5);
        System.out.println("Color of the Square:" + Square.getColor());
        System.out.println("Area of the Square: " + Square.calculateArea());
        System.out.println("Perimeter of the Square: " + Square.calculatePerimeter());

    }
}