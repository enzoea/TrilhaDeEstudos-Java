# Lógica de Programação: de Python para Java

Material de apoio para a transição de Python para Java. Os alunos já viram lógica de programação em Python — aqui, cada tópico mostra o que eles já conhecem e como o mesmo conceito se escreve em Java.

## Como usar

- Siga os arquivos na ordem numerada — cada um assume que o anterior já foi visto.
- Cada tópico tem dois arquivos: um `.md` com a explicação (recapitulação do conceito em Python, o equivalente em Java, tabela comparando a sintaxe e exercícios) e um `.java` com um exemplo pronto para rodar, ilustrando o que está no `.md`.
- Os `.java` são exemplos demonstrativos, não a resolução dos exercícios — a ideia é rodar, alterar valores e observar o que muda, antes de partir para os exercícios de cada arquivo.
- Os exercícios são de lógica pura (sem interface gráfica, sem bibliotecas externas) — o objetivo nessa fase é fixar a sintaxe e a forma de pensar em Java, não aprender orientação a objetos ainda.

## Como rodar os exemplos `.java`

Cada arquivo é independente (tem sua própria classe e método `main`). No VS Code, basta abrir o arquivo e clicar em **Run** (aparece acima do método `main`). Pelo terminal:

```
javac 01-variaveis-e-tipos.java
java VariaveisTipos
```

(o nome depois do `java` é o nome da classe dentro do arquivo, não o nome do arquivo).

## Ordem do conteúdo

| Explicação | Exemplo | Tópico |
|---|---|---|
| [01-variaveis-e-tipos.md](01-variaveis-e-tipos.md) | [01-variaveis-e-tipos.java](01-variaveis-e-tipos.java) | Variáveis e tipos de dados |
| [02-operadores.md](02-operadores.md) | [02-operadores.java](02-operadores.java) | Operadores aritméticos, relacionais e lógicos |
| [03-entrada-e-saida.md](03-entrada-e-saida.md) | [03-entrada-e-saida.java](03-entrada-e-saida.java) | Entrada e saída de dados (`input()` vs `Scanner`) |
| [04-condicionais.md](04-condicionais.md) | [04-condicionais.java](04-condicionais.java) | Estruturas condicionais (`if`/`elif`/`else`) |
| [05-repeticao.md](05-repeticao.md) | [05-repeticao.java](05-repeticao.java) | Estruturas de repetição (`for`, `while`) |
| [06-vetores.md](06-vetores.md) | [06-vetores.java](06-vetores.java) | Vetores/listas (`list` vs `array`) |
| [07-funcoes.md](07-funcoes.md) | [07-funcoes.java](07-funcoes.java) | Funções/métodos |

## A maior diferença de mentalidade: tipagem e compilação

Antes de entrar nos detalhes, dois pontos valem ser reforçados logo no início da aula, porque explicam *por que* a sintaxe do Java parece "mais burocrática":

1. **Python é dinamicamente tipado, Java é estaticamente tipado.** Em Python uma variável pode receber um `int` e depois um `str` sem problema. Em Java, o tipo é declarado uma vez e não muda — o compilador verifica isso antes mesmo do programa rodar.
2. **Python é interpretado, Java é compilado.** Em Python, `python arquivo.py` já executa. Em Java, existe uma etapa antes: `javac Arquivo.java` (compila para bytecode `.class`) e só depois `java Arquivo` (executa). O VS Code faz as duas etapas automaticamente ao clicar em "Run", mas é importante que os alunos saibam que ela existe.

Todo o resto (chaves em vez de indentação, ponto e vírgula, declaração de tipos) é consequência desses dois pontos.
