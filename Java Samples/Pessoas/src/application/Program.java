package application;

import entities.Person;

public class Program {
  public static void main(String[] args) {
    
    Person jhon = new Person("Jhon Wick", 15);
    
    jhon.setPhone("370170130");

    System.out.println(jhon);

  }

}
