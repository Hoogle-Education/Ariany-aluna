class Aluno {
  String name;
  int age;
  String group;

  public void birthday(){
    age++;
  }

}

public class Program {  
  public static void main(String[] args) {

    Aluno jhon = new Aluno();
    Aluno copy = new Aluno();

    jhon.name = "Jhon";
    jhon.age = 16;
    jhon.group = "Music club";

    copy = jhon;
    
    jhon.birthday();

    System.out.println(copy.name);
    System.out.println(jhon.age);

  }

}
