# 4. Estruturas Condicionais

## Em Python

```python
idade = 20

if idade < 12:
    print("Crianca")
elif idade < 18:
    print("Adolescente")
else:
    print("Adulto")
```

## Em Java

```java
int idade = 20;

if (idade < 12) {
    System.out.println("Crianca");
} else if (idade < 18) {
    System.out.println("Adolescente");
} else {
    System.out.println("Adulto");
}
```

## Tabela comparativa

| Conceito | Python | Java |
|---|---|---|
| Se | `if condicao:` | `if (condicao) {` |
| Senão se | `elif condicao:` | `else if (condicao) {` |
| Senão | `else:` | `else {` |
| Delimitação do bloco | indentação (espaços) | chaves `{ }` |
| Condição entre parênteses | opcional | **obrigatório** |

## Diferenças importantes

- **Parênteses na condição são obrigatórios:** `if (idade < 18)`, nunca `if idade < 18`.
- **Chaves em vez de indentação:** o bloco do `if` começa em `{` e termina em `}`. A indentação em Java é só para *legibilidade humana* — o compilador ignora espaços. Isso significa que um erro de indentação não quebra o código em Java (diferente de Python), mas também que esquecer uma chave gera um erro de compilação confuso. Sempre indente do mesmo jeito para não se perder.
- **`elif` vira duas palavras:** `else if`, sempre separado por espaço.
- Para uma única linha dentro do `if`, as chaves são opcionais — mas **recomendamos sempre usá-las** enquanto estão aprendendo, para evitar bugs:
  ```java
  if (idade >= 18) System.out.println("Maior de idade"); // funciona, mas evite
  ```

## Operador ternário (curinga para if/else simples)

Python:
```python
status = "Aprovado" if nota >= 6 else "Reprovado"
```

Java:
```java
String status = (nota >= 6) ? "Aprovado" : "Reprovado";
```

A estrutura é `condicao ? valorSeVerdadeiro : valorSeFalso`.

## Comparando texto dentro de condicionais

Lembrando da pegadinha do arquivo anterior — dentro de um `if`, comparar `String` sempre com `.equals()`, nunca com `==`:

```java
String resposta = scanner.nextLine();

if (resposta.equals("sim")) {
    System.out.println("Confirmado!");
}
```

## Exercícios

1. Peça um número e diga se ele é positivo, negativo ou zero.
2. Peça três números e imprima o maior deles.
3. Peça uma nota (0 a 10) e imprima o conceito: `>= 9` "A", `>= 7` "B", `>= 5` "C", abaixo disso "D".
4. Reescreva o exercício 3 usando o operador ternário para pelo menos uma das comparações.
