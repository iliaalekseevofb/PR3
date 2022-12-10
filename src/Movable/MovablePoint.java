package Movable;

public class MovablePoint implements Movable {
  // Variables
  protected int x;
  protected int y;
  protected int xSpeed;
  protected int ySpeed;

  // Constructor
  public MovablePoint(int newX, int newY, int newXSpeed, int newYSpeed) {
    x = newX;
    y = newY;
    xSpeed = newXSpeed;
    ySpeed = newYSpeed;
  }

  // Methods
  @Override
  public String toString() {
    return "x: " + this.x + ", y: " + this.y + ", xSpeed: " + this.xSpeed + ", ySpeed: " + this.ySpeed;
  }

  @Override
  public void moveUp() {
    this.y += 1;
  }

  @Override
  public void moveDown() {
    this.y -= 1;
  }

  @Override
  public void moveLeft() {
    this.x -= 1;
  }

  @Override
  public void moveRight() {
    this.x += 1;
  }
}
