package entities;

import entities.enums.Color;

public class Circle extends Shape {
  
  public static final double PI = 3.14159265;
  public double radius;

  public Circle(double thick, Color color, double radius) {
    super(thick, color);
    this.radius = radius;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public Circle() {
  }

  public double area(){
    return radius*radius*PI;
  }

  @Override
  public String toString() {
    return super.toString() + " + Circle [radius=" + radius + "]";
  }

}
