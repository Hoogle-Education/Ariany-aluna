class Aluno {
  private String name;
  private int age;
  private String group;

  public Aluno(){
  }

  public Aluno(String name, int age){
    this.name = name;
    this.age = age;
  }

  public Aluno(String name, int age, String group){
    this.name = name;
    this.age = age;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public void birthday(){
    System.out.println(this.name + " birthday!!!");
    age++;
  }

  public String enterGroup(String group, int age){
    if(this.age >= age){
      this.group = group;
      return "Você entrou no grupo!";
    }else{
      return "You cannot enter the group";
    }
  }

}

public class Program {  
  public static void main(String[] args) {

    Aluno jhon = new Aluno("Jhon", 16);
    Aluno copy = jhon;
    Aluno aluno = new Aluno();

    jhon.age = 200;

    jhon.group = "Music club";
    
    jhon.birthday();

    System.out.println(copy.name);
    System.out.println(jhon.age);
    System.out.println( jhon.enterGroup("Fight club", 18) );
    System.out.println( jhon.enterGroup("Dance clubd", 12) );

    if(jhon.group != null){
      System.out.println(jhon.name + " enter in " + jhon.group);
    }

  }

}
