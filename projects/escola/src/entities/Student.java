package entities;

import java.util.Scanner;

public class Student {

  private String name;
  private int age;
  private int classGrade;
  private String score;
  
  private PaymentContract contract;
  
  public Student() {
  }

  public Student(String name, int age, int classGrade, PaymentContract contract) {
    this.name = name;
    this.age = age;
    this.classGrade = classGrade;
    this.contract = contract;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getClassGrade() {
    return classGrade;
  }

  public void setClassGrade(int classGrade) {
    this.classGrade = classGrade;
  }

  public String getScore() {
    return score;
  }

  public PaymentContract getContract() {
    return contract;
  }

  public String isApproved(){

    if( !hasScore() ) makeExam();
    
    switch (score) {
      case "A":
      case "B":
      case "C":
        return name + " has been Approved :)";
      default:
        return name + " has been Repproved :(";
    }
  }

  public boolean hasScore(){
    if(score == null) return false;
    else return true;
  }

  public void makeBirthday(){
    age++;
  }

  private void makeExam(){
    // peço para colocar a nota da prova
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("This Student (" + name + ") has no score! Please fill the fields below:");
    System.out.print("Insert your score: ");
    // configuro o score para esta nota
    makeExam( keyboard.nextLine() );

    // e posso continuar, pois agora tenho nota no exame!
    keyboard.close();
  }

  public void makeExam(String score){
    
    switch (score) {
      case "A":
      case "B":
      case "C":
      case "D":
      case "E":
      case "F":
        this.score = score;
        System.out.println("Your score has been added!");
        break;
      default:
        System.out.println("Insert a valid score!");
        makeExam();
        break;
    }
    
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", classGrade=" + classGrade + ", contract=" + contract + ", name=" + name
        + ", score=" + score + "]";
  }


  
}
