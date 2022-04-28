# Getters and Setters

Serve para controlarmos a maneira que os atributos de alguma classe serão utilizados.

Pensando na classe Pessoa:

🚩 **Problema:** Posso mudar os atributos da forma que quiser, inclusive a idade. E isto não faz sentido.

⚠️ **Primeira parte da solução:** Tiro o acesso a esses dados, trocando:

```java
  public int age;
```

```java
  private int age;
```

❌ **Problema:** Agora eu não posso consultar o valor destas variáveis, pois elas são privadas apenas para a classe.

✅ **Solução final:** Recuro o controle a estes dados atrravés de métodos, e quando eu não quiser que um deles esteja disponível basta não colocar / apagar o método.

```java

public int getAge(){
  return age;
}

public void setAge(int age){
  this.age = age;
}

```

## Controlando o acesso

Como no caso acima não queremos que a modificação da idade seja permitida, iremos desabilitar(*apagar*) o método `setAge()`:

```java

public int getAge(){
  return age;
}

/*deleted*/

```