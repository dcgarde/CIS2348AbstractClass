package absclass;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4,3);
        Circle circle = new Circle(3);
        Square square = new Square(5);

        rectangle.area();
        circle.area();
        square.area();
    }

}
