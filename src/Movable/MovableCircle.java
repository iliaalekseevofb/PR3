package Movable;

public class MovableCircle implements Movable{
  // Variables
  private int radius;
  private MovablePoint center;

  // Constructor
  public MovableCircle(int newX, int newY, int newXSpeed, int newYSpeed, int newRadius) {
    radius = newRadius;
    center = new MovablePoint(newX, newY, newXSpeed, newYSpeed);
  }

  // Methods
  @Override
  public String toString() {
    return "x: " + this.center.x + ", y: " + this.center.y + ", xSpeed: " +
            this.center.xSpeed + ", ySpeed: " + this.center.ySpeed + ", radius: " + this.radius;
  }

  @Override
  public void moveUp() {
    this.center.y += 1;
  }

  @Override
  public void moveDown() {
    this.center.y -= 1;
  }

  @Override
  public void moveLeft() {
    this.center.x -= 1;
  }

  @Override
  public void moveRight() {
    this.center.x += 1;
  }
}
