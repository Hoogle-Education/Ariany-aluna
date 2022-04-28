package application;

import entities.Account;

public class BankSystem {
  public static void main(String[] args) {
    
    Account c1 = new Account("Jhon", 200.0);
    Account c2 = new Account("Maria", 400.0);

    System.out.println(c1);
    c1.deposit(200.0);
    System.out.println(c1);

    c1.withdraw(500.0);
    System.out.println(c1);

    c1.withdraw(300.0);
    System.out.println(c1);

  }

}
