# Princípios

## Principio da saída

1. `System.out.println()`
1. `System.out.printf()`

exemplo printf:

```java
double var = 3.14159265

System.out.printf("o valor de var é %f.2", var)
```

## Estruturas condicionais

### Estrura `if`

```java
if( /*condição*/ ){
  // código se for verdadeira.
}
```

### Estrutura `else`

A sobra do `if`

```java
if( /*condição*/ ){
  // código se for verdadeira.
} else {
  // código se for falso
}
```


### Estrutura `else if`

```java
if( /*condição*/ ){
  // código se for verdadeira.
} else if ( /*outra condição*/ ){
  // código se a segunda condição for verdadeira
} else {
  // código se for falso
}
```

exemplo:
```java
  if( nota >= 7.0 ){
    sysout("approved");
  } else if( nota >= 4.0 ){ 
    sysout("will have to make another test");
  } else {
    sysout("reproved")
  }
```

### Otimização de escrita

Se há **apenas um comando**, podemos omitir as chaves em estruras mais simples.

```java
  if( nota >= 7.0 ) 
    System.out.println("approved");
  else if( nota >= 4.0 ) 
    System.out.println("will have to make another test");
  else 
    System.out.println("reproved");
```

## Operadores lógicos

|Operador|Exemplo| Descricação |
|:--:| :--: | :--: |
|++| `a++;`| Soma um na variável |
| -- | `a--;`| Diminui um da variável |
| += | `a += x;`| `a = a + x` |
| /= | `a /= x;`| `a = a / x` |
| += | `a %= x;`| `a = a % x` |
|%| `a%b`| Retorna o resto de a divido por b |
|!=| `a!=b`| a diferente de b, retorna `true` ou `false` |


## Estruturas de repetição - `while`

Executa um bloco enquanto algo for verdade. É um `if` prolongado e pede necessariamente uma atualização.

sintaxe:
```java
while ( /*condição*/ ){
  // código enquanto for verdade
  // atualização
}
```

exemplo:
```java
int estoque = 10;
while ( estoque >= 0 ){
  System.out.println("Estou vendendo...");
  estoque--;
}
```

## Esturura de repetição - `for`

```java
for(/*inicialização*/ ; /*condição*/ ; /*update*/ ){
  // código enquanto for verdade
}
```

```java
for(int i=0; i<=10 ; i++){
  System.out.println(i);
}
```

## Esturutra `do-while`

```java
do {
  // primeiro faz
}while ( /*condição*/ );
// depois verifica se ainda é verdade
```

## Keyword `break`

Interrompe o loop no ponto em que é lida.

```java
int x = 0;
while (true){
  if( x == 10 ) break;
  x++;
}
```

## Keyword `continue`

Pula o resto da iteração de um laço do loop.

Fazendo um programa que pula a impressão de número pares:
```java
int x = 0;

while(x < 20){
  if(x%2 == 0) continue;
  System.out.println(x);
}
```

int[] array = new int[100];
array[0] = elemento1