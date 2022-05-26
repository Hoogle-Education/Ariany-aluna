package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PaymentContract;
import entities.Student;

public class SchoolSystem {

  public static void menu(){
    System.out.print( "1 - Add new school student \n"
                      + "2 - Remove a student by name \n"
                      + "0 - exit \n"
                      + "Insert an option: ");
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List <Student> students = new ArrayList<>();

    //PaymentContract firstContract = new PaymentContract("creditcard", 2, 20.0);
    //group[0] = new Student("Jairo", 30, 9, firstContract);
    
    int option;

    PaymentContract model1 = new PaymentContract("One year contract", 12, 3000);
    PaymentContract model2 = new PaymentContract("One time contract", 1, 3000);

    do {
      
      menu();
      option = scanner.nextInt();
      scanner.nextLine();

      separator();

      if(option == 1) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("ClassGrade: ");
        int classGrade = scanner.nextInt();

        System.out.print("Model Contract (1/2): ");
        int model = scanner.nextInt();

        students.add(new Student(name, age, classGrade, model1));
      } else {
        System.out.println("Insert a valid menu option!");
      }

      separator();

    } while( option != 0 );
    
    for(Student s : students) System.out.println(s);
  }

  private static void separator() {
    System.out.println("-----------------------------------");
  }

}
