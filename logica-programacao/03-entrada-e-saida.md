# 3. Entrada e Saída de Dados

## Saída (imprimir na tela)

```python
print("Ola, mundo!")
print("Idade:", idade)
```

```java
System.out.println("Ola, mundo!");
System.out.println("Idade: " + idade);
```

- `System.out.println` sempre pula linha no final. Existe também `System.out.print` (sem o `ln`), que não pula linha — equivalente a `print(..., end="")` em Python.
- Para juntar texto com variáveis, Java usa `+` (concatenação), não vírgula:
  ```java
  System.out.println("Nome: " + nome + ", idade: " + idade);
  ```

## Entrada (ler dados do usuário)

Em Python, `input()` já resolve tudo:

```python
nome = input("Digite seu nome: ")
idade = int(input("Digite sua idade: "))
```

Em Java, usamos a classe `Scanner`. É mais verboso porque **cada tipo de dado tem seu próprio método de leitura**:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos.");

        scanner.close();
    }
}
```

## Tabela comparativa

| O que ler | Python | Java |
|---|---|---|
| Texto | `input()` | `scanner.nextLine()` |
| Número inteiro | `int(input())` | `scanner.nextInt()` |
| Número decimal | `float(input())` | `scanner.nextDouble()` |

## Pegadinha: misturar `nextInt()` com `nextLine()`

Esse é o erro mais comum com `Scanner`. `nextInt()` lê só o número e **deixa a quebra de linha no "buffer"**. Se depois você chamar `nextLine()`, ele lê essa quebra de linha vazia em vez de esperar o usuário digitar.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Idade: ");
int idade = scanner.nextInt();

System.out.print("Nome: ");
String nome = scanner.nextLine(); // PROBLEMA: pula, não espera digitar nada
```

**Solução:** depois de um `nextInt()` ou `nextDouble()`, adicione um `scanner.nextLine()` extra para "limpar" essa quebra de linha antes do próximo `nextLine()`:

```java
int idade = scanner.nextInt();
scanner.nextLine(); // consome a quebra de linha pendente

String nome = scanner.nextLine(); // agora funciona
```

## Pegadinha: `nextDouble()` e o separador decimal do Brasil

Em computadores configurados em português do Brasil, o Java assume por padrão que o separador decimal é **vírgula**, não ponto — porque segue o idioma/região configurado no sistema operacional. Isso significa que `scanner.nextDouble()` pode dar erro (`InputMismatchException`) se o usuário digitar `8.5`, esperando que `8,5` funcione em vez disso.

```java
Scanner scanner = new Scanner(System.in);
double nota = scanner.nextDouble(); // usuario digita "8.5" -> erro em maquina configurada em pt-BR
```

**Solução:** forçar o `Scanner` a sempre interpretar ponto como separador decimal, logo depois de criá-lo:

```java
import java.util.Scanner;
import java.util.Locale;

Scanner scanner = new Scanner(System.in);
scanner.useLocale(Locale.US); // agora "8.5" funciona, independente da configuracao da maquina
```

Vale a pena colocar essa linha logo após criar o `Scanner` em todo programa que for ler `double`.

## Checklist para usar Scanner

1. `import java.util.Scanner;` no topo do arquivo
2. Criar uma vez: `Scanner scanner = new Scanner(System.in);`
3. Se for ler `double`, chamar `scanner.useLocale(Locale.US);` logo em seguida
4. Usar o método certo para o tipo que está lendo
5. Cuidado ao misturar `nextInt()`/`nextDouble()` com `nextLine()`

## Exercícios

1. Peça o nome e a idade do usuário e imprima uma frase juntando os dois.
2. Peça dois números decimais e imprima a soma, a diferença e o produto entre eles.
3. Peça o nome completo (com espaço, ex: "Ana Silva") e depois a idade — nessa ordem — sem cair na pegadinha do `nextLine()`/`nextInt()`.
