# Trilha de Estudos - Java

Repositório de estudos para quem está aprendendo Java vindo de Python. Contém material teórico, exemplos prontos para rodar e exercícios práticos.

## Pré-requisitos

Antes de começar, siga o guia [SETUP.md](SETUP.md) para instalar:

- **JDK 17** (Java Development Kit)
- **VS Code** com a extensão **Extension Pack for Java**

Depois de instalar, confirme que deu certo rodando no terminal:

```
java -version
javac -version
```

## Estrutura do projeto

```
├── SETUP.md                     -> Guia de instalação do ambiente
├── src/
│   └── Main.java                -> Exemplo "Hello World" inicial
└── logica-programacao/
    ├── README.md                 -> Índice e explicação do módulo
    ├── 01-variaveis-e-tipos.md   -> Teoria (Python x Java) + exercícios
    ├── 01-variaveis-e-tipos.java -> Exemplo pronto para rodar
    ├── ...                        (mesmo padrão até o tópico 07)
    └── exercicios/
        ├── exercicios.md          -> Enunciado dos 10 exercícios práticos
        └── 01-par-ou-impar.java   -> Resolução de cada exercício
```

- **`logica-programacao/`**: siga os arquivos na ordem numerada (01 a 07). Cada tópico tem um `.md` (explicação, comparando com Python) e um `.java` (exemplo demonstrativo).
- **`logica-programacao/exercicios/`**: 10 exercícios para praticar o que foi visto. Tente resolver sozinho antes de olhar a resolução no `.java`.

## Como rodar os códigos Java

Todo arquivo `.java` deste repositório tem sua própria classe e método `main`, ou seja, pode ser executado sozinho.

### Opção 1: Pelo VS Code (mais fácil)

1. Abra a pasta do projeto no VS Code (**File > Open Folder**)
2. Abra o arquivo `.java` que deseja rodar
3. Clique em **Run** (aparece acima da linha `public static void main`) ou use `Ctrl+F5`
4. O resultado aparece no terminal integrado, na aba **Debug Console** ou **Terminal**

### Opção 2: Pelo terminal

1. Abra um terminal na pasta onde está o arquivo `.java`
2. Compile o arquivo:

```
javac NomeDoArquivo.java
```

3. Execute usando o **nome da classe** (não o nome do arquivo):

```
java NomeDaClasse
```

**Exemplo** (rodando o exemplo do tópico 1):

```
cd logica-programacao
javac 01-variaveis-e-tipos.java
java VariaveisTipos
```

> O nome depois de `java` é sempre o nome da `public class` dentro do arquivo, não o nome do arquivo em si.

### Rodando o Hello World inicial

```
cd src
javac Main.java
java Main
```

Saída esperada: `Ola, mundo!`

## Por onde começar

1. Rode o `Main.java` em [src/](src/Main.java) para confirmar que o ambiente está funcionando.
2. Siga o índice em [logica-programacao/README.md](logica-programacao/README.md), lendo cada `.md` e rodando o `.java` correspondente, na ordem.
3. Ao final, pratique com os [exercícios](logica-programacao/exercicios/exercicios.md).

## Problemas comuns

Se o comando `java`/`javac` não for reconhecido, ou a extensão do VS Code não identificar o projeto, veja a tabela de solução de problemas no final do [SETUP.md](SETUP.md).
