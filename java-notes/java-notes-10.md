# Herança

``` 
- objeto
- atributo
- método
```

- objeto **`tem/não tem`** atributo
- objeto **`faz/não faz`** método
- objeto **`é/não é`** um outro objeto

## 1. Classes base

Classe para enumerar as cores:

```java
public enum Color {
  PURPLE, BLUE,
  RED, GREEN, PINK;
}
```

`Shape.java`
```java
public class Shape {

  private double thick;
  private Color color;

  public Shape(){ }

  public Shape(double thick, Color color){
    this.thick = thick;
    this.color = color;
  }

}
```

----

## 🔑 Keyword `extends`

A palavra `extends` indica que vamos continuar uma classe, herdando todos os seus atributos e métodos.

---

## 2. Extendendo a classe `Shape`

`Circle.java`
```java
public class Circle extends Shape {

  private double radius;

  public Circle(){ }

  public Circle(double radius, double thick, Color color){
    super(thick, color);
    this.radius = radius;
  }

}
```

## 🔑 Keyword `protected`

Trata como `public` no pacote e como `private` fora do pacote.

📦 `entities` > 🧩`MyClass.java`
```java
public class MyClass {
  protected String name = "default name";
}
```

📦 `entities` > 🧩`MyClass.java`
```java
public class MySubClass extends MyClass {
  name = "other name";
}
```

## 🔑 Keyword `Override`

Usamos `@Override` para sobreescrever um método que veio de uma classe mãe.

método `toString()` vindo da classe `Object`: 
```java
@Override
public String toString(){
  return "text";
}
```

### Aplicando em heranças

📦 `entities` > 🧩`MyClass.java`
```java
public class MyClass {
  public String sendMessage(){
    return "Hello i'm message";
  }
}
```

📦 `entities` > 🧩`MyClass.java`
```java
public class MySubClass extends MyClass{

  @Override  
  public String sendMessage(){
    return "Hello i'm another code of message";
  }
}
```
