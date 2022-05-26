package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {

  private String title;
  private String author;
  private Date release;
  private double price;
  private String description;

  public Book(String title, String author, Date release, double price, String description) {
    this.title = title;
    this.author = author;
    this.release = release;
    this.price = price;
    this.description = description;
  }

  public Book(String title, String author, Date release, double price) {
    this.title = title;
    this.author = author;
    this.release = release;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Date getRelease() {
    return release;
  }

  public void setRelease(Date release) {
    this.release = release;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {

    String descriptionAux = (description == null) ? 
                            "\nThere is no information about this product" :
                            "\n------------------------------------\nDescription: " + description;
                      
    SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");

    return "Book : " + title + "|| Price = $" + price + "\n"
            + "Author: " + author + " ||  Release Date = " + sdf.format(release)
            + descriptionAux;
  }
  

}
