package Shapes;

public class Square extends Rectangle {
  // Constructors (overloaded)
  public Square() {
    width = 0;
    length = 0;
    color = "None";
    filled = false;
  }

  public Square(double side) {
    width = side;
    length = side;
    color = "None";
    filled = false;
  }

  public Square(double side, String c, boolean f) {
    width = side;
    length = side;
    color = c;
    filled = f;
  }

  // Methods
  public double getSide() {
    return this.width;
  }

  public void setSide (double side) {
    this.width = side;
    this.length = side;
  }

  @Override
  public void setWidth(double side) {
    this.width = side;
  }
  @Override
  public void setLength(double side) {
    this.length = side;
  }
}
