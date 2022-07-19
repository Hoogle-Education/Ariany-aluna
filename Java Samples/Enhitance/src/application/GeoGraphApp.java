package application;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Square;
import entities.enums.Color;

public class GeoGraphApp {
  
  public static void main(String[] args) {
    
    Circle c1 = new Circle(0.8, Color.PURPLE, 4.5);
    
    Shape s1 = new Circle(1.2, Color.GREEN, 4.3);
    Shape s2 = new Rectangle(1.5, Color.BLUE, 3.0, 2.0);

    System.out.println( (Shape)c1 );
    System.out.println( s1 );
    System.out.println( s2 );

    System.out.println("------------------------");
    
    Shape[] array = new Shape[2];
    array[0] = s1;
    array[1] = s2;

    for(Shape shape : array){
      System.out.println(shape);
    }
    
    System.out.println("------------------------");

    Shape s3 = new Square(1.2, Color.RED, 3.0);

    List <Integer> list = List.of(1, 2, 3);
    
    list.forEach(System.out::println);

    System.out.println( ((Square)s3).area() );
  }

}
