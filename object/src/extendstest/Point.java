package extendstest;

public class Point {
    int x, y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + ", " + y + ")";
    }

}
