package Movable;

public class MovableRectangle implements Movable{
  // Variables
  private MovablePoint topLeft;
  private MovablePoint bottomRight;

  // Constructor
  public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
    topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
  }

  // Methods
  @Override
  public String toString() {
    return "topLeft: " + this.topLeft.x + ", " + this.topLeft.y + "; bottomRight: " + this.bottomRight.x + ", " +
            this.bottomRight.y + "; xSpeed: " + this.topLeft.xSpeed + "; ySpeed: " + this.topLeft.ySpeed;
  }

  @Override
  public void moveUp() {
    this.topLeft.y += 1;
    this.bottomRight.y += 1;
  }

  @Override
  public void moveDown() {
    this.topLeft.y -= 1;
    this.bottomRight.y -= 1;
  }

  @Override
  public void moveLeft() {
    this.topLeft.x -= 1;
    this.bottomRight.x -= 1;
  }

  @Override
  public void moveRight() {
    this.topLeft.x += 1;
    this.bottomRight.x += 1;
  }

  public boolean checkSpeed() {
    return this.topLeft.xSpeed == this.bottomRight.xSpeed;
  }
}
