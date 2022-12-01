package Shapes;

public class Rectangle extends Shape {
  // Variables
  protected double width;
  protected double length;

  // Constructors (overloaded)
  public Rectangle() {
    width = 0;
    length = 0;
    color = "None";
    filled = false;
  }

  public Rectangle(double w, double l) {
    width = w;
    length = l;
    color = "None";
    filled = false;
  }

  public Rectangle(double w, double l, String c, boolean f) {
    width = w;
    length = l;
    color = c;
    filled = f;
  }

  // Methods
  public double getWidth() {
    return this.width;
  }
  public double getLength() {
    return this.length;
  }

  public void setWidth(double width) {
    this.width = width;
  }
  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double getArea() {
    return this.width * this.length;
  }
  @Override
  public double getPerimeter() {
    return (this.width + this.length) * 2;
  }

  @Override
  public String toString() {
    return "Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter() + ", Color: " + this.color + ", Filled" + this.filled;
  }
}
