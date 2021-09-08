package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

/*    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(5,3);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area()); */

    String text = "Расстояние между 2 точками с координатами ";
    Point A = new Point(6, 2);
    Point B = new Point(-1, 3);
    System.out.println( text+ "( " + A.x + "," + A.y + " ) и ( " + B.x + "," + B.y + " ) = " + distance(A, B));

  }

  public static double distance(Point A, Point B) {
    return Math.sqrt( Math.pow((B.x-A.x),2) + Math.pow((B.y-A.y),2) );

  }

}