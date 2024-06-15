public class Circle extends MyShape {
  int xCoordinate;
  int yCoordinate;
  int radius;

  public Circle(
          int xCoordinate,
          int yCoordinate,
          int radius
  ) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.radius = radius;
  }
  public Circle(){
    this.xCoordinate = 0;
    this.yCoordinate = 0;
    this.radius = 1;
  }
  public Circle(
          int xCoordinate,
          int yCoordinate,
          int radius,
          String color,
          boolean filled
  ) {
    this.xCoordinate = xCoordinate;
    this.yCoordinate = yCoordinate;
    this.radius = radius;
    this.color = color;
    this.filled = filled;
  }
  public int getXCoordinate() {
    return xCoordinate;
  }

  public int getYCoordinate() {
    return yCoordinate;
  }

  public int getRadius() {
    return radius;
  }
  public void setXCoordinate(int xCoordinate) {
    this.xCoordinate = xCoordinate;
  }

  public void setYCoordinate(int yCoordinate) {
    this.yCoordinate = yCoordinate;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }
  @Override
  public String toString() {
    return "Circle {" +
            "XCoordinate = " + xCoordinate +
            ", YCoordinate = " + yCoordinate +
            ", Radius = " + radius +
            "} which is subclass of " + super.toString();
  }
  @Override
  public boolean equals(Object obj) {
    if(this == obj){
      return true;
    }
    if(obj == null || this.getClass() != obj.getClass()){
      return false;
    }
    Circle other = (Circle) obj;
    return (this.xCoordinate == other.xCoordinate) &&
            (this.yCoordinate == other.yCoordinate) &&
            (this.radius == other.radius);
  }
  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + this.xCoordinate;
    result = 31 * result + this.yCoordinate;
    result = 31 * result + this.radius;
    return result;
  }

  Double getArea(){
    return Math.PI * Math.pow(this.radius, 2);
  }
  Double getCircumference(){
    return 2 * Math.PI * this.radius;
  }

  Double getDistanceTo(Circle anotherCircle){
    return Math.sqrt(Math.pow((this.xCoordinate - anotherCircle.xCoordinate), 2) +
            Math.pow((this.yCoordinate - anotherCircle.yCoordinate), 2));
  }
}






