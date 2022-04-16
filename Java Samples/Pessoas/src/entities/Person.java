package entities;

public class Person {
  
  // atributes
  private String name;
  private int age;
  private String phone;
  
  // Constructors
  public Person(String name, int age, String phone) {
    this.name = name;
    this.age = age;
    this.phone = phone;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // getters and setters
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
     if( phone.length() < 10 && phone.length() >= 0){
       this.phone = phone;
     }
  }

  // methods
  public void birthday(){
    age++;
  }

  @Override
  public String toString() {
    return "Person [age=" + age + ", name=" + name + ", phone=" + phone + "]";
  }

  

}
