import java.io.*;
class Square extends Shape implements Serializable {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return 4 * side;
    }
}
