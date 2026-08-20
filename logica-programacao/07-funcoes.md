# 7. Funções (Métodos)

Em Java, uma função escrita dentro de uma classe costuma ser chamada de **método** — é o mesmo conceito de função de Python, só muda o nome porque em Java tudo vive dentro de uma classe.

## Em Python

```python
def somar(a, b):
    return a + b

def saudacao(nome):
    print("Ola, " + nome)

resultado = somar(3, 4)
saudacao("Ana")
```

## Em Java

```java
public class Main {

    static int somar(int a, int b) {
        return a + b;
    }

    static void saudacao(String nome) {
        System.out.println("Ola, " + nome);
    }

    public static void main(String[] args) {
        int resultado = somar(3, 4);
        saudacao("Ana");
    }
}
```

## Anatomia de um método Java

```java
static int somar(int a, int b) {
//^      ^tipo   ^nome  ^parametros (com tipo cada um)
//static: pertence a classe, nao a um objeto (mais sobre isso depois)
```

1. **Tipo de retorno** (`int`, `String`, `void`...) — vem *antes* do nome, diferente de Python que não declara.
2. **`void`** quando a função não retorna nada (equivalente a uma função Python sem `return`, ou com `return` sozinho).
3. **Cada parâmetro precisa do seu tipo declarado**: `(int a, int b)`, nunca só `(a, b)`.
4. **`static`**: por enquanto, todo método vai levar essa palavra na frente. Ela existe porque, em Java, tudo faz parte de uma classe — `static` diz que o método pertence à classe `Main` diretamente, sem precisar criar um objeto para chamá-lo. Isso é assunto de orientação a objetos, que vem depois; por ora, tratem como parte da "fórmula" do método.

## Tabela comparativa

| Conceito | Python | Java |
|---|---|---|
| Declarar função | `def somar(a, b):` | `static int somar(int a, int b) {` |
| Retornar valor | `return a + b` | `return a + b;` |
| Função sem retorno | `def saudacao(nome):` (sem `return`) | `static void saudacao(String nome) {` |
| Tipo do retorno | não declarado | declarado antes do nome (`int`, `void`, `String`...) |
| Tipo dos parâmetros | não declarado | declarado em cada parâmetro |
| Chamar a função | `somar(3, 4)` | `somar(3, 4)` |

## `void` vs retornar algo

Se a função só imprime ou executa uma ação, sem devolver um valor para usar depois, o tipo de retorno é `void`:

```java
static void imprimirTabuada(int numero) {
    for (int i = 1; i <= 10; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
```

Se ela devolve um valor para ser usado (guardado em variável, comparado, etc.), o tipo de retorno é o tipo desse valor:

```java
static boolean ehPar(int numero) {
    return numero % 2 == 0;
}
```

## Sobrecarga de métodos (algo que Python não tem)

Em Java é possível ter dois métodos com o **mesmo nome**, desde que os parâmetros sejam diferentes:

```java
static int somar(int a, int b) {
    return a + b;
}

static double somar(double a, double b) {
    return a + b;
}
```

Java escolhe automaticamente qual usar de acordo com os tipos passados na chamada. Em Python isso não existe — a segunda definição de uma função com o mesmo nome simplesmente substitui a primeira.

## Exercícios

1. Crie um método `ehPrimo(int numero)` que retorna `boolean` dizendo se o número é primo.
2. Crie um método `void imprimirTabuada(int numero)` e chame ele para 3 números diferentes.
3. Crie um método `double media(int[] numeros)` que recebe um array e retorna a média dos valores.
4. Crie dois métodos `maior` sobrecarregados: um que recebe dois `int` e outro que recebe dois `double`, cada um retornando o maior valor.
