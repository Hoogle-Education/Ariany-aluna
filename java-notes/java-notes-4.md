# Construtores

Construtores garantem/obrigam que os objetos tenham alguns valores configurados por origem. Tornando mais segura uma possível consulta.

```java
class MyClass {

  public MyClass (){

  }

}
```

## Construtor personalizado

classe pessoa:
```java

class Pessoa {

  String name;
  int age;
  String phone;

  public Pessoa(String name, String age){
    this.name = name;
    this.age = age;
  }
}
```

## Keyword `this`

Faz uma referência ao objeto que será instanciado, modificado, acessado, ou usado para chamar um método de sua classe.

```java
  this.value = value;
```

## Overload - *sobrecarga*

classe pessoa:
```java

class Pessoa {

  String name;
  int age;
  String phone;

  public Pessoa(){
  }

  public Pessoa(String name, int age){
    this.name = name;
    this.age = age;
  }

  public Pessoa(String name, int age, String phone){
    this.name = name;
    this.age = age;
    this.phone = phone;
  }

}
```

