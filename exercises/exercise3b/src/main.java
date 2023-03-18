import java.io.*;
public class main {
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

        try {
            FileOutputStream fileOut = new FileOutputStream("shapes.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Circle);
            out.writeObject(Rectangle);
            out.writeObject(Square);
            out.writeObject(Triangle);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in shapes.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fileIn = new FileInputStream("shapes.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Shape deserializedCircle = (Shape) in.readObject();
            Shape deserializedRectangle = (Shape) in.readObject();
            Shape deserializedSquare = (Shape) in.readObject();
            Shape deserializedTriangle = (Shape) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized data from shapes.ser");
            System.out.printf("%s %s - Area: %.2f, Perimeter: %.2f%n",
                    deserializedCircle.getColor(), deserializedCircle.getClass().getSimpleName(),
                    deserializedCircle.calculateArea(), deserializedCircle.calculatePerimeter());

            System.out.printf("%s %s - Area: %.2f, Perimeter: %.2f%n",
                    deserializedRectangle.getColor(), deserializedRectangle.getClass().getSimpleName(),
                    deserializedRectangle.calculateArea(), deserializedRectangle.calculatePerimeter());

            System.out.printf("%s %s - Area: %.2f, Perimeter: %.2f%n",
                    deserializedSquare.getColor(), deserializedSquare.getClass().getSimpleName(),
                    deserializedSquare.calculateArea(), deserializedSquare.calculatePerimeter());

            System.out.printf("%s %s - Area: %.2f, Perimeter: %.2f%n",
                    deserializedTriangle.getColor(), deserializedTriangle.getClass().
                            getSimpleName(), deserializedTriangle.calculateArea(), deserializedTriangle.calculatePerimeter());

        }  catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Shape class not found!");
            c.printStackTrace();
        }
    }
    }
