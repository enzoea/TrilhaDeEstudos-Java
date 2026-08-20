# 2. Operadores

## Aritméticos

| Operação | Python | Java |
|---|---|---|
| Soma | `+` | `+` |
| Subtração | `-` | `-` |
| Multiplicação | `*` | `*` |
| Divisão (decimal) | `/` | `/` |
| Divisão inteira | `//` | `/` (quando os dois operandos são `int`) |
| Resto da divisão | `%` | `%` |
| Potência | `**` | não existe operador — usa `Math.pow(base, expoente)` |

### A pegadinha da divisão

Em Python, `7 / 2` já dá `3.5` (decimal). Em Java, `7 / 2` dá `3` — porque os dois são `int`, e divisão entre inteiros trunca o resultado. Para obter `3.5`, pelo menos um dos dois precisa ser `double`:

```java
int a = 7;
int b = 2;
System.out.println(a / b);         // 3
System.out.println((double) a / b); // 3.5
```

O `(double)` na frente de `a` é um **cast** — converte o valor para outro tipo na hora do cálculo.

### Potência

```python
resultado = 2 ** 3  # 8
```

```java
double resultado = Math.pow(2, 3); // 8.0
```

## Relacionais (comparação)

| Operação | Python | Java |
|---|---|---|
| Igual | `==` | `==` |
| Diferente | `!=` | `!=` |
| Maior / menor | `>` `<` | `>` `<` |
| Maior/menor ou igual | `>=` `<=` | `>=` `<=` |

Iguais nos dois — **exceto para comparar texto**, que veremos como pegadinha abaixo.

## Lógicos

| Operação | Python | Java |
|---|---|---|
| E | `and` | `&&` |
| Ou | `or` | `\|\|` |
| Não | `not` | `!` |

```python
if idade >= 18 and tem_documento:
    print("Pode entrar")
```

```java
if (idade >= 18 && temDocumento) {
    System.out.println("Pode entrar");
}
```

## Atribuição composta

Idênticos nas duas linguagens:

| Python | Java |
|---|---|
| `x += 1` | `x += 1;` |
| `x -= 1` | `x -= 1;` |
| `x *= 2` | `x *= 2;` |

Java também tem os operadores de incremento `++` e decremento `--`, que Python não tem:

```java
int x = 5;
x++; // x agora é 6
x--; // x agora é 5 de novo
```

## Pegadinha: comparando texto

Em Python, `"abc" == "abc"` funciona normalmente. Em Java, comparar `String` com `==` compara se são o **mesmo objeto na memória**, não se o conteúdo é igual — e pode dar resultado errado. Para comparar o conteúdo de duas strings, use `.equals()`:

```java
String a = "abc";
String b = "abc";
System.out.println(a.equals(b)); // true — forma correta
```

Isso é importante para quando chegarmos em condicionais com texto.

## Exercícios

1. Calcule a área de um retângulo (`base * altura`) usando `double`.
2. Dado um número inteiro, calcule o resto da divisão por 2 e diga se ele é par ou ímpar (guarde o resultado numa variável `boolean`, ainda sem usar `if`).
3. Traduza para Java: `media = (nota1 + nota2 + nota3) / 3`, garantindo que o resultado seja decimal mesmo se as notas forem inteiras.
