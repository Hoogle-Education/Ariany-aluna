package entities;

import java.util.Date;
import java.util.List;

public class User {

  private String username;
  private String password;
  private Date birthdate;
  private double balance;

  // one to many
  private List<Book> bookCollection;

  public User(String username, String password, Date birthdate, double balance) {
    this.username = username;
    this.password = password;
    this.birthdate = birthdate;
    this.balance = balance;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public double getBalance() {
    return balance;
  }

  public List<Book> getBookCollection() {
    return bookCollection;
  }


}
