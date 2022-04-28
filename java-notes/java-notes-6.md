# Keywords in java

## keyword `static`

cria objetos ou métodos que funcionam de maneira **única** e por isso não dependem de uma inicialização de objeto.

```java
  System.out.println(Math.pow(2,3));  // 2^3
```

`pow` é estática, isto é, independe de termos um objeto do tipo `Math` inicializado para chamá-la.

## Jeito rudimentar

🧩 `Circle.java`
```java
public class Circle {

  public const double PI = 3.14159265;
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public area(){
    return PI*radius*radius;
  }

}
```

🚩 **Problema:** Está sendo criado `PI` para cada circunferencia do problema.

## Melhorando

🧩 `Circle.java`
```java
public class Circle {

  public static final double PI = 3.14159265;
  private double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  public area(){
    return PI*radius*radius;
  }

  public static calculateArea(double radius){
    return PI*radius*radius;
  }

}
```

novas abordagens possíveis:
```java
Circle c1 = new Circle(2);
c1.area();
```

```java
Circle.calculateArea(2);
```

## Keyword `final`

Voltaremos melhor na palavra`final` em herança, mas basicamente, ela indica que aquele é o estado final de uma variável/método.

Inclusive, para as futuras classes filhas.