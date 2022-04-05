# Introdução a OOP

É um paradigma da programação, que nos permite moldar problemas e situações através da relação classe-objeto.

## Pilares importantes

1. Flexibilidade
2. Reuso
2,5. *E se esse código fosse muito grande?*

## O que é uma classe?

Classe é um molde abstrato sobre algo. Toda classe é composta por coisas que são propriedades daquele tipo e coisas que esse tipo pode fazer.

```
Classe
  > atributos
  > métodos
```

## O que é um objeto?

Um objeto é uma instância de uma determinada classe, por exemplo:
Classe:
```
Pessoa{
  > Nome
  > Idade
}
```
Objeto:
```
Pessoa joao;
```

## Agora no `java`:

```java

// meu molde de alunos
class Aluno {

  // atributos
  String nome;
  int idade;
  String turma;

}

public class App {

  public static void main(String[] agrs){

    // instancia de alguns objetos
    // frutos do molde
    Aluno joao = new Aluno();
    Aluno maria = new Aluno();

    joao.nome = "Joao da Silva";
    joao.idade = 14;
    joao.turma = "9º ano";

    maria.nome = "Maria da costa";
    maria.idade = 20;

    System.out.println(joao.idade);

  }

}
```