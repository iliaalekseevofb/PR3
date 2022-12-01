package Shapes;

public class Circle extends Shape {
  // Variables
  protected double radius;

  // Constructors (overloaded)
  public Circle() {
    radius = 1;
    filled = false;
    color = "blue";
  }
  public Circle(double r) {
    radius = r;
    filled = false;
    color = "blue";
  }
  public Circle(double r, String c, boolean f) {
    radius = r;
    filled = f;
    color = c;
  }

  // Methods
  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
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
