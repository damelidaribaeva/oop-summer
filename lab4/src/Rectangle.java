import java.util.Objects;

public class Rectangle extends MyShape {
    private int xTopLeftCoordinate;
    private int yTopLeftCoordinate;
    private int xBottomRightCoordinate;
    private int yBottomRightCoordinate;

    Rectangle() {
        this.xTopLeftCoordinate = 0;
        this.yTopLeftCoordinate = 0;
        this.xBottomRightCoordinate = 1;
        this.yBottomRightCoordinate = -1;
    }

    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public Rectangle(String color, boolean filled, int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate) {
        super(color, filled);
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }

    public double getArea() {
        double width = getWidth();
        double height = getLength();
        return width * height;
    }

    public double getCircumference() {
        double width = getWidth();
        double height = getLength();
        return 2 * (width + height);
    }

    public double getLength() {
        return Math.abs(xBottomRightCoordinate - xTopLeftCoordinate);
    }

    public double getWidth() {
        return Math.abs(yBottomRightCoordinate - yTopLeftCoordinate);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "xTopLeftCoordinate=" + xTopLeftCoordinate +
                ", yTopLeftCoordinate=" + yTopLeftCoordinate +
                ", xBottomRightCoordinate=" + xBottomRightCoordinate +
                ", yBottomRightCoordinate=" + yBottomRightCoordinate +
                "} which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return xTopLeftCoordinate == rectangle.xTopLeftCoordinate &&
                yTopLeftCoordinate == rectangle.yTopLeftCoordinate &&
                xBottomRightCoordinate == rectangle.xBottomRightCoordinate &&
                yBottomRightCoordinate == rectangle.yBottomRightCoordinate &&
                super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), xTopLeftCoordinate, yTopLeftCoordinate, xBottomRightCoordinate, yBottomRightCoordinate);
    }
}