package entities;

public class PaymentContract {
 //  atributes

  private String type;
  private int times;
  private double price;

  //constructors 

  public PaymentContract(String type, int times, double price) {
    this.type = type;
    this.times = times;
    this.price = price;
  }

  public PaymentContract(String type, double price) {
    this.type = type;
    this.price = price;
    times = 1;
  }

  // getters/setters

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getTimes() {
    return times;
  }

  public double getPrice() {
    return price;
  }

  //methods

  public double calculateFees(){
    
    if(times==1) return 0.0;
    else if (times<= 5) return price*0.05; 
    else return price * ((double)times/100.0);
    
  }

  public double calculateFees(int times){
    
    if(times==1) return 0.0;
    else if (times<= 5) return price*0.05; 
    else return price * ((double)times/100.0);
    
  }

  @Override
  public String toString() {
    return "PaymentContract [price=" + price + ", times=" + times + ", type=" + type + "]";
  }


  
}
