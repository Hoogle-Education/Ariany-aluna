package entities;

public class Account {
  
  // tax for investments
  private static double tax = 1.14;

  // atributes
  private String manager;
  private double balance;

  //constructors
  public Account(String manager){
    balance = 0;
    this.manager = manager;
  }

  public Account(String manager, double balance) {
    this.manager = manager;
    this.balance = balance;
  }

  // getters and setters
  public static double getTax() {
    return tax;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  //methods
  public void deposit(double amount){
    balance += amount;
    System.out.println("---");
    System.out.println(manager + " is depositing " + amount + " || new Balance = " + balance);
    System.out.println("---");
  }

  public void withdraw(double amount){
    System.out.println("---");
    if(amount <= balance) {
      balance -= amount;
      System.out.println(manager + " withdraw " + amount + " || new Balance = " + balance);
    }else {
      System.out.println("not enought funds");
    }
    System.out.println("---");
  }

  public double investments(){



    return 0;
  }

  //to String
  @Override // sobrescrever o código padrão da Object
  public String toString() {
    return "Account \nmanager = " 
            + manager 
            + "\nbalance=" 
            + balance 
            + "\n----";
  }

}
