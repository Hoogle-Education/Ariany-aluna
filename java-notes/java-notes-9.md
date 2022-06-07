# Interface `Comparator` e `Comparable`

Interfaces serão modos de obrigarmos uma determinada classe a ter um recurso escrito em seus métodos.

Nestes casos, o recurso a ser trabalhado será a capacidade de compararmos uma ordem para dois objetos quaisquer.

**Exemplo:** 
> Quais são as regras para uma pessoa ser ordenada antes de outra? 
 
> Seria pela ordem alfabética? 

> Seria pela idade? 

> Seria um critério misto?

# Aplicando a `Comparator<T>`

```java
public class Pessoa implements Comparator<Pessoa> {

  private String name;
  private int age;
  private String cpf;

  // constructor

  // getters and setters

  @Override
  public int compareTo(Pessoa other){
    // if(this.age > other.getAge()) return 1;
    // else if(this.age < other.getAge()) return -1;
    // else return this.name.compareTo(other.getName());

    return Integer.compare(this.age, other.getAge());
  }

}
```

```java
a.compareTo(b);

Collections.sort(list);
```