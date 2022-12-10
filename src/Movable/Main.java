package Movable;

public class Main {
  public static void main(String[] args) {
    // Movable circle
    MovableCircle mc1 = new MovableCircle(0, 0, 0, 0, 3);

    mc1.moveDown();
    mc1.moveLeft();

    System.out.println(mc1);

    mc1.moveUp();
    mc1.moveRight();

    System.out.println(mc1);

    // Movable rectangle
    MovableRectangle mr1 = new MovableRectangle(0, 5, 5, 0, 10, 2);

    System.out.println(mr1);

    for (int i = 0; i < 4; i++) {
      mr1.moveRight();
      mr1.moveUp();
    }

    System.out.println(mr1);

    mr1.moveLeft();
    mr1.moveDown();

    System.out.println(mr1);
    System.out.println("Скорость одинаковая: " + mr1.checkSpeed());
  }
}
