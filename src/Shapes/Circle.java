package Shapes;

public class Circle extends Shape {
  // Variables
  protected double radius;

  // Constructor (overloaded)
  public Circle() {
    filled = false;
    color = "blue";
    radius = 1;
  }
  public Circle(double r) {
    filled = false;
    color = "blue";
    radius = r;
  }
  public Circle(double r, String c, boolean f) {
    filled = f;
    color = c;
    radius = r;
  }

  // Methods
  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double r) {
    this.radius = r;
  }
  @Override
  public double getArea() {
    return Math.PI*radius*radius;
  }
  @Override
  public double getPerimeter() {
    return 2*Math.PI*radius;
  }
  @Override
  public String toString() {
    return "Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter() + ", Color: " + this.color + ", Filled" + this.filled;
  }
}
