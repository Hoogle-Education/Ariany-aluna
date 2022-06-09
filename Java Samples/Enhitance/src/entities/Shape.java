package entities;

import entities.enums.Color;

public class Shape {
  
  private double thick;
  private Color color;

  public Shape() {
  }

  public Shape(double thick, Color color) {
    this.thick = thick;
    this.color = color;
  }

  public double getThick() {
    return thick;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Shape [color=" + color + ", thick=" + thick + "]";
  }
  
}
