# Listas (`ArrayList`)

## Wrapper classes

Tipos que deram origem aos tipos primitivos que usamos.

```java
int var = Integer.parseInt("123");
double var2 = Double.parseDoble("12.3");
```

## Classe `Number`

Classe pai de todos os tipos numéricos.

## Class `Object`

Classe pai de todas as outras classes.

## Voltando para `List`

Toda lista recebe um modelo completo como modelo de elemento.

```java
  List<Integer> list = new ArrayList<>();
```

## Usando a `ArrayList`

```java
List<Integer> sequencia = new ArrayList<>();
sequencia.add(2);
```

## Principais métodos

1. `add(element)`
2. `add(element , index)`
3. `remove(element)`
4. `remove(index)`
5. `toArray(list)` - estático

```java
Integer[] vetor = List.toArray(lista);
```

# `Date` and `SimpleDateFormat`

Serve para guardarmos e manipularmos datas com mais facilidade.

```java
  import java.util.Date;
```

## Criando um objeto do tipo `Date`

```java
  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
  String entrada = "17/02/2001";

  Date myDate = formatter.parse(entrada); // ParseExeption

  System.out.println( formatter.format(myDate) );

```

## `format` and `parse`

`format` serve para trocar um tipo `Date` em uma string na qual escolhemos o modelo que ela sairá.

`parse` serve para trocar um tipo `String` em um objeto `Date` seguindo o nosso padrão de regras.

## Pattern

`dd/MM/yy` : dia/mês/ano com 2 digitos

`MM/dd/yyyy` : mês/dia/ano com 4 digitos

`HH:mm` : hora:minuto

`HH:mm:ss` : hora:minuto:segundo

