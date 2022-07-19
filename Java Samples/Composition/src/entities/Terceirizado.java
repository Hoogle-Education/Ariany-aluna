package entities;

import java.math.BigDecimal;
import java.util.Date;

public class Terceirizado extends Funcionario {
  
  private Date expireDate;

  public Terceirizado() {
    super();
  }

  public Terceirizado(String name, int age, BigDecimal salary, Adress adress, Date expireDate) {
    super(name, age, salary, adress);
    this.expireDate = expireDate;
  }

  public Date getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(Date expireDate) {
    this.expireDate = expireDate;
  }

  

}
