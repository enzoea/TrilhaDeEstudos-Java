# 1. Variáveis e Tipos de Dados

## Em Python

```python
nome = "Ana"
idade = 25
altura = 1.70
esta_matriculado = True
```

Não é preciso declarar o tipo — o Python descobre sozinho, e a mesma variável pode até trocar de tipo depois.

## Em Java

```java
String nome = "Ana";
int idade = 25;
double altura = 1.70;
boolean estaMatriculado = true;
```

Em Java, **todo tipo é declarado explicitamente** e não muda depois. Uma vez que `idade` é `int`, ela sempre será `int`.

## Tabela comparativa

| Conceito | Python | Java |
|---|---|---|
| Texto | `str` | `String` |
| Número inteiro | `int` | `int`, `long` |
| Número decimal | `float` | `double`, `float` |
| Verdadeiro/falso | `bool` | `boolean` |
| Declaração | `x = 10` | `int x = 10;` |
| Fim de linha | quebra de linha | `;` (ponto e vírgula obrigatório) |
| Convenção de nomes | `snake_case` | `camelCase` |

## Diferenças importantes

- **Ponto e vírgula:** toda instrução em Java termina com `;`. Esquecer é o erro mais comum no início.
- **Tipo obrigatório:** `int idade = 25;` — não existe `idade = 25` sozinho como em Python.
- **`camelCase` em vez de `snake_case`:** `estaMatriculado` em vez de `esta_matriculado`. Não é obrigatório pelo compilador, mas é a convenção que todo código Java segue.
- **Constantes:** em Python usamos convenção (`PI = 3.14`, tudo maiúsculo, mas ainda mutável). Em Java existe a palavra-chave `final`, que impede a alteração:
  ```java
  final double PI = 3.14159;
  ```

## Tipos numéricos: Java tem mais opções

Python tem só `int` e `float`. Java separa por tamanho:

| Tipo Java | Guarda | Exemplo |
|---|---|---|
| `int` | número inteiro (padrão) | `int idade = 25;` |
| `long` | inteiro bem grande | `long populacao = 8000000000L;` |
| `double` | decimal (padrão) | `double preco = 19.99;` |
| `float` | decimal menos preciso | `float nota = 8.5f;` |
| `char` | um único caractere | `char inicial = 'A';` |

Para o nosso curso, na prática vamos usar principalmente `int`, `double`, `String` e `boolean` — os outros existem, mas não são o foco agora.

## Exercícios

1. Declare variáveis para armazenar seu nome, idade e altura, e imprima os três valores.
2. Declare uma constante `final` chamada `LIMITE_IDADE` com valor `18`. Tente alterar o valor dela depois — o que acontece?
3. Traduza este trecho de Python para Java:
   ```python
   produto = "Caderno"
   preco = 12.5
   quantidade = 3
   em_estoque = True
   ```
