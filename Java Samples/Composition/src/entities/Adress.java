package entities;

public class Adress {

  private String street;
  private String state;
  private String country;
  private int number;

  public Adress() {
  }

  public Adress(String street, String state, String country, int number) {
    this.street = street;
    this.state = state;
    this.country = country;
    this.number = number;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

}
