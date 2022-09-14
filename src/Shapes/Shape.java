package Shapes;

public abstract class Shape {
  // Variables
  protected String color;
  protected boolean filled;

  // Constructor (overloaded)
  public Shape() {}
  public Shape(String c, boolean f) {
    color = c;
    filled = f;
  }

  // Methods
  public String getColor() {
    return this.color;
  }
  public boolean isFilled() {
    return this.filled;
  }
  public void setColor(String c) {
    this.color = c;
  }
  public void setFilled(boolean f) {
    this.filled = f;
  }

  public abstract double getArea();
  public abstract double getPerimeter();
  public abstract String toString();
}
