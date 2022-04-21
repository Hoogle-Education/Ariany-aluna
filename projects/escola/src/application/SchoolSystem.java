package application;

import java.util.Scanner;

import entities.PaymentContract;
import entities.Student;

public class SchoolSystem {

  public static void menu(){
    System.out.print( "1 - Show the capacity of school \n"
                      + "2 - Show the students of school \n"
                      + "3 - Add new school student \n"
                      + "4 - Remove a student by name \n"
                      + "0 - exit \n"
                      + "Insert an option: ");
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Student[] group =  new Student[1000];
    int numberOfStudents = 0;
    //PaymentContract firstContract = new PaymentContract("creditcard", 2, 20.0);
    //group[0] = new Student("Jairo", 30, 9, firstContract);
    
    int option;

    do {
      
      menu();
      option = scanner.nextInt();

      separator();

      if(option == 1){
        System.out.println("Number of students in school: " 
                            + numberOfStudents );
        System.out.println("Actual capacity of school: "  
                            + (1000-numberOfStudents) );
      } else if(option == 2){

        if(numberOfStudents == 0) System.out.println("There are no students in school");

        for(int i=0; i<numberOfStudents; i++){
          System.out.println(" -- STUDENT #" + i + " --");
          System.out.println(group[i]);
        }
      } else {
        System.out.println("Insert a valid menu option!");
      }

      separator();

    } while( option != 0 );

    System.out.println();

  }

  private static void separator() {
    System.out.println("-----------------------------------");
  }
}
