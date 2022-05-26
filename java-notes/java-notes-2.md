# Entrada de dados em java

Para ler dados no terminal em Java, precisamos importar e usar um objeto do tipo `Scanner`.

## Importando

```java
import java.util.Scanner;

public class MyClass{
  // ...
}
```

## Abrindo e encerrando um Scanner

```java
  Scanner in = new Scanner(System.in);
```

Crio um objeto chamado `in` do tipo `Scanner`, e faço ele receber um novo modelo de `Scanner` direcionado a entrada padrão do sistema `System.in`.

```java
  Scanner in = new Scanner(System.in);
  // usa o scanner
  in.close();
```

Fechar ele, evita erros de o `Scanner` não ter sido fechado.

## Méotodos de leitura do `Scanner`

### 1`.next()` 

Captura o próximo dado inserido no terminal, sempre em forma de `String`. `String` é usado para garantir a segurança do código.

```java
  String data = in.next();
```

### 2. `.nextInt()`

Captura o próximo dado no formato de número inteiro. Caso não seja inteiro, lança uma excessão no terminal e o código será interrompido.

```java
  int a = in.nextInt();
```

Analogamente: `.nextDouble()` , `.nextFloat()` , `.nextChar()`.

### 3. `.nextLine()`

Exatamente igual ao `.next()`, porém só termina a leitura depois de ler o `<enter>`.


⚠️ **Cuidado com o bug do nextLine**

📍 Objetivo: ler um inteiro e depois uma linha.

❌ Problema: O inteiro deixa um `<enter>`  a ser consumido no `buffer` e isso faz com que ele pense que a linha a ser lida é apenas um `<enter>` vazio.

🧩 Ajuste: Consumir este `<enter>` sem salvá-lo, para limpar meu buffer.

```java
int var = in.nextInt();
in.nextLine();
String line = in.nextLine();
```

input:
```
2[enter]
minha linha a ser salva
```

output:
```
var = 2
linha = minha linha a ser salva
```

# Arrays (Vetores unidimensionais)

Vetores nada mais são que um tipo primitivo adicional, que pode colecionar dados de um mesmo tipo. Isto é, se quisessemos salvar 40 inteiros, não convém listar todos eles, porém um vetor pode criar espaço e permitir consulta para os 40, em uma única linha.

## 1. Criando vetores

Caso mais raro: Vetor fixo no código
```java
  int[] array = {2, 3, 7, 8, 10, 1};
```

Caso mais comum: Reservando posições em um vetor a ser acessado.
```java
  int[] meuVetor = new int[10]
```

A linha acima, cria um vetor chamado `array` e aloca 10 posições dentro dele.

⚠️ **Cuidado!** Vetores estão sempre indexados em zero, isto é, suas posições vão de `0` até o seu `tamanho-1`

## 2. Acessando dados no vetor

Para acessar um dado no vetor, precisamos chamá-lo pelo seu nome, e depois indicar a posição desejada no vetor, sempre indexando em zero.

```java
  System.out.println(meuVetor[0]);
```
Esta chamada retorna o primeiro elemento do vetor, da mesma forma pode ser usada para modificar o valor contigo nela:

```java
  array[0] = 3;
```

## Extra: Fazendo um array adicionar variáveis novas independente do tamanho

```java
public void add(int element, int[] array){

  int size = aray.lenght;
  int[] copy = array;
  array = new int[size+1];

  for(int i=0; i<size-1; i++){
    array[i] = copy[i];
  }

  array[size-1] = element;

}
```