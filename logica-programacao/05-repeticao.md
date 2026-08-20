# 5. Estruturas de Repetição

## `while`

Python:
```python
contador = 0
while contador < 5:
    print(contador)
    contador += 1
```

Java:
```java
int contador = 0;
while (contador < 5) {
    System.out.println(contador);
    contador++;
}
```

Praticamente idêntico — parênteses na condição e chaves no lugar da indentação, como no `if`.

## `for`

Aqui é onde Python e Java se afastam mais.

Python percorre uma sequência (`range`, lista, etc.):
```python
for i in range(5):
    print(i)
```

Java, no `for` clássico, declara três partes separadas por `;`: **início, condição de parada, e o que muda a cada volta**:
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

### Lendo o `for` do Java

```java
for (int i = 0; i < 5; i++) {
//   ^inicio  ^condicao ^incremento
```

1. `int i = 0` — roda **uma vez**, no começo
2. `i < 5` — testado **antes de cada volta**; se for falso, o laço para
3. `i++` — roda **depois de cada volta**

### Equivalente ao `range` com passo

Python:
```python
for i in range(0, 10, 2):  # 0, 2, 4, 6, 8
    print(i)
```

Java:
```java
for (int i = 0; i < 10; i += 2) {
    System.out.println(i);
}
```

Python:
```python
for i in range(10, 0, -1):  # contagem regressiva
    print(i)
```

Java:
```java
for (int i = 10; i > 0; i--) {
    System.out.println(i);
}
```

## Tabela comparativa

| Conceito | Python | Java |
|---|---|---|
| Laço condicional | `while condicao:` | `while (condicao) {` |
| Laço contado | `for i in range(n):` | `for (int i = 0; i < n; i++) {` |
| Interromper o laço | `break` | `break;` |
| Pular para a próxima volta | `continue` | `continue;` |

`break` e `continue` funcionam exatamente igual nas duas linguagens.

## Laços aninhados (um dentro do outro)

Igual em conceito, só muda a sintaxe. Exemplo clássico — tabuada de 1 a 5:

```java
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
    }
}
```

## Exercícios

1. Imprima os números de 1 a 20 usando `for`.
2. Imprima só os números pares de 1 a 20, usando o incremento do `for` (sem usar `if`).
3. Peça um número `n` e imprima a tabuada dele (de 1 a 10) usando `for`.
4. Peça números ao usuário repetidamente com `while`, somando todos, até que ele digite `0` (esse valor não entra na soma).
5. Imprima um triângulo de asteriscos com `n` linhas usando `for` aninhado:
   ```
   *
   **
   ***
   ```
