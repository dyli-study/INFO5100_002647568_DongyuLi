import java.io.*;
abstract class Shape implements Serializable {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

