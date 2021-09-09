package ru.stqa.pft.sandbox;

public class HomeWork1 {

  public static void main(String[] args) {
    String text = "Расстояние между 2 точками с координатами ";
    Point A = new Point(6, 2);
    Point B = new Point(-1, 3);
    System.out.println( text+ "( " + A.x + "," + A.y + " ) и ( " + B.x + "," + B.y + " ) = " + A.distance(A,B));
  }


}
