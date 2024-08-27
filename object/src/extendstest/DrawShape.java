package extendstest;

public class DrawShape {
    public static void main(String[] args) {

        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };

        Triangle triangle = new Triangle(p);

        // Point p1 = new Point(150, 150);
        Circle circle = new Circle(new Point(150, 150), 50);

        triangle.draw();
        circle.draw();

    }

}
