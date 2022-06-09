package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
  
  private double height;
  private double size;

  public Rectangle(double thick, Color color, double height, double size) {
    super(thick, color);
    this.height = height;
    this.size = size;
  }

  public Rectangle(double height, double size) {
    this.height = height;
    this.size = size;
  }

  public Rectangle() { }
  
  public double getHeight() {
    return height;
  }

  public double getSize() {
    return size;
  }
  
  public double area(){
    return height*size;
  }

  @Override
  public String toString() {
    return super.toString() + " + Rectangle [height=" + height + ", size=" + size + "]";
  }

}
