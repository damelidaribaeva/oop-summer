import java.util.Objects;

public class Square extends Rectangle{
    public Square() {
        super();
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(xTopLeftCoordinate,
                yTopLeftCoordinate,
                xTopLeftCoordinate - sideLength,
                yTopLeftCoordinate - sideLength);
    }

    public Square(String color, boolean filled, int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength) {
        super(color, filled, xTopLeftCoordinate, yTopLeftCoordinate,
                xTopLeftCoordinate - sideLength,
                yTopLeftCoordinate - sideLength);
    }

    @Override
    public String toString() {
        return  "A square with side = " + getLength() + ", which is subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Square square = (Square) obj;
        return getLength() == square.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLength());
    }
}
