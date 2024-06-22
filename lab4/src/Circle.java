import java.util.Objects;

public class Circle extends MyShape {
    private int xCoordinate;
    private int yCoordinate;
    private int radius;

    Circle() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.radius = 1;
    }

    public Circle(int x, int y, int radius) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.radius = radius;
    }

    public Circle(String color, boolean filled, int x, int y, int radius) {
        super(color, filled);
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +
                "} which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return xCoordinate == circle.xCoordinate &&
                yCoordinate == circle.yCoordinate &&
                radius == circle.radius &&
                super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), xCoordinate, yCoordinate, radius);
    }
}
