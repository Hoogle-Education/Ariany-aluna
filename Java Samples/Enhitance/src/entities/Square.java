package entities;

import entities.enums.Color;

public class Square extends Rectangle {

  public Square(double thick, Color color, double size) {
    super(thick, color, size, size);
  }

  public Square(double size) {
    super(size, size);
  }

  public Square() {
  }

  @Override
  public double area() {
    return super.area();
  }

}
