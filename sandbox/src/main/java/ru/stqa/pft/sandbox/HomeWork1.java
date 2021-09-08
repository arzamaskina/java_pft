package ru.stqa.pft.sandbox;

public class HomeWork1 {

  public static void main(String[] args) {
    String text = "Расстояние между 2 точками с координатами ";
    Point A = new Point(6, 2);
    Point B = new Point(-1, 3);
    System.out.println( text+ "( " + A.x + "," + A.y + " ) и ( " + B.x + "," + B.y + " ) = " + distance(A, B));
  }

  public static double distance(Point A, Point B) {
    return Math.sqrt( Math.pow((B.x-A.x),2) + Math.pow((B.y-A.y),2) );
  }
}
