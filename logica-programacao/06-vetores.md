# 6. Vetores (Arrays)

## Em Python

```python
numeros = [10, 20, 30, 40, 50]
print(numeros[0])      # 10
print(len(numeros))    # 5
numeros.append(60)      # listas em Python crescem dinamicamente
```

## Em Java

```java
int[] numeros = {10, 20, 30, 40, 50};
System.out.println(numeros[0]);   // 10
System.out.println(numeros.length); // 5 (sem parenteses! é atributo, não metodo)
```

A diferença mais importante: **arrays em Java têm tamanho fixo**. Uma vez criado com tamanho 5, não é possível adicionar um 6º elemento — seria preciso criar um array novo. (Existe uma estrutura equivalente à `list` do Python, chamada `ArrayList`, mas fica para mais adiante no curso — por enquanto, o foco é o array de tamanho fixo, que é a base.)

## Declarando um array

Duas formas comuns:

```java
// Já sabendo os valores:
int[] numeros = {10, 20, 30, 40, 50};

// Sabendo só o tamanho, para preencher depois:
int[] idades = new int[5]; // cria um array de 5 posicoes, todas com valor 0
idades[0] = 18;
idades[1] = 25;
```

## Tabela comparativa

| Conceito | Python | Java |
|---|---|---|
| Criar com valores | `numeros = [10, 20, 30]` | `int[] numeros = {10, 20, 30};` |
| Criar vazio/tamanho fixo | `numeros = [0] * 5` | `int[] numeros = new int[5];` |
| Acessar elemento | `numeros[0]` | `numeros[0]` |
| Tamanho | `len(numeros)` | `numeros.length` (sem parênteses) |
| Percorrer com índice | `for i in range(len(numeros)):` | `for (int i = 0; i < numeros.length; i++)` |
| Percorrer os valores direto | `for n in numeros:` | `for (int n : numeros)` |
| Tamanho pode crescer? | sim | não (array é fixo) |

## O "for-each" do Java

Quando você só precisa dos valores (sem o índice), existe uma forma mais simples, parecida com o `for` do Python:

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int n : numeros) {
    System.out.println(n);
}
```

Lê-se: "para cada `n` dentro de `numeros`". Use essa forma quando não precisar saber a posição; use o `for` com índice (`for (int i = 0; ...)`) quando precisar, por exemplo, comparar posições ou alterar valores.

## Pegadinha: acessar um índice que não existe

Em Python, `numeros[10]` numa lista de 5 elementos dá `IndexError`. Em Java, o erro equivalente é `ArrayIndexOutOfBoundsException` — mesmo conceito, nome diferente. Sempre confira se o índice está entre `0` e `length - 1`.

## Exercícios

1. Crie um array com 5 números e imprima a soma de todos os elementos.
2. Crie um array com 5 números e encontre o maior valor.
3. Peça 5 números ao usuário, guarde em um array e depois imprima-os na ordem inversa.
4. Crie um array de notas e calcule a média, usando o `for-each`.
