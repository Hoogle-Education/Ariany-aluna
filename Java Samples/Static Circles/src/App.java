import java.util.Scanner;

import entities.Circle;

public class App {
    public static void main(String[] args) throws Exception {
        
        Circle c1 = new Circle(2);

        System.out.println(c1.area());
        System.out.println(Circle.calculateArea(2));

        System.out.println(Circle.PI);



    }
}
