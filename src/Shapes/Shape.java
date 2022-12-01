package Shapes;

public abstract class Shape {
  // Variables
  protected String color;
  protected boolean filled;

  // Constructors (overloaded)
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

  public void setColor(String color) {
    this.color = color;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public abstract double getArea();
  public abstract double getPerimeter();

  @Override
  public abstract String toString();
}
