package entities;

public class Circle {
  
  public static final double PI = 3.14159265;
  private double radius;
  
  public Circle(){
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Double getRadius(String password) {
      return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double area()  {
    return PI*radius*radius;
  }

  public static double calculateArea(double radius){
    return PI*radius*radius;
  }

}
