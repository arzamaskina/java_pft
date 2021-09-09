package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point (double x, double y) {
    this.x = x;
    this.y = y;
  }

  public static double distance(Point A, Point B) {
    return Math.sqrt( Math.pow((B.x-A.x),2) + Math.pow((B.y-A.y),2) );
  }

}
