# Algoritmos de ordenação

## 1. Bubble Sort

A ideia aqui é que depois de várias trocas sucessivas (e exaustivas) teremos colocado **com certeza** todos os elementos em suas devidas posições testando um mesmo critério de ordenação.

```
 Para i [0...n-1] :
  Para j [0...n-2] :
    Se (vetor[j] maior que vetor[j+1]):
      troca(vetor[j], vetor[j+1])
```

```java
 public static void bubbleSort(int[] vetor) {

   int size = vetor.length;

    for(int i = 0 ; i < size ; i++) {
      for (int j = 0; j < (size - 1); j++) {
        if (vetor[j] > vetor[j + 1]) {
          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }

      printVetor(vetor);
    }

    System.out.println("------------------------");
    printVetor(vetor);

  }

  private static void printVetor(int[] vetor) {
    for (int x : vetor) {
      System.out.print(x + " ");
    }
    System.out.println();
  }
```

## 2. Bubble sort (melhorada)

Podemos ter um melhor caso para a bubble.

```java
//  1 2 5 9 4
//  1 2 4 5 9

for(int i=0; i<(n-1);  ){
  if(vetor[i] > vetor[i+1]){
    int temp = vetor[i];
    vetor[i] = vetor[i+1];
    vetor[i+1] = temp;
    (i-1 >=0) ? i-- : ;
  } else {
    i++;
  }

}
```

## 3. Selection sort

A `selection` baseia-se em encontrar o menor elemento local da sub-lista e colocá-lo como primeiro. Depois repetir a `selection` para a sublista, exceto o primeiro elemento.

```java

int n = vetor.length;

for(int i=0; i<n; i++){
  int pos_menor = i;

  for(int j = i+1; j < n; j++){
    if(vetor[j] < vetor[pos_menor]) pos_menor = j;
  }

  int temp = vetor[i];
  vetor[i] = vetor[pos_menor];
  vetor[pos_menor] = temp;
}
```

## Insertion Sort

Na insertion sort, comparamos um elemento **enquanto** ele for menor que o anteior a ele. Desta forma, ele é quem deveria ser o anterior.
