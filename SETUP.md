# Setup do Ambiente Java

Guia para preparar sua máquina antes da aula. Siga os passos na ordem.

## 1. Instalar o JDK (Java Development Kit)

Vamos usar o **Java 17** (versão LTS - suporte de longo prazo).

1. Acesse [adoptium.net](https://adoptium.net/)
2. Baixe o **Eclipse Temurin JDK 17** para o seu sistema operacional (Windows/Mac/Linux)
3. Execute o instalador com as opções padrão
   - No Windows, marque a opção **"Set JAVA_HOME variable"** durante a instalação, se disponível

### Verificar se instalou corretamente

Abra um terminal (cmd, PowerShell ou terminal do Mac/Linux) e rode:

```
java -version
javac -version
```

Ambos devem responder com a versão 17.x. Se aparecer "comando não encontrado", reinicie o terminal (ou o computador) e tente de novo — se ainda não funcionar, o PATH não foi configurado pelo instalador e precisa ser adicionado manualmente.

## 2. Instalar o VS Code

1. Baixe em [code.visualstudio.com](https://code.visualstudio.com/)
2. Instale com as opções padrão

## 3. Instalar a extensão de Java no VS Code

1. Abra o VS Code
2. Vá na aba de Extensões (ícone de blocos na barra lateral, ou `Ctrl+Shift+X`)
3. Procure por **"Extension Pack for Java"** (autor: Microsoft)
4. Clique em **Instalar**

Essa extensão já traz tudo que precisamos: syntax highlighting, autocomplete, debugger e suporte a testes.

## 4. Testar com um "Hello World"

1. Crie uma pasta para os exercícios da aula (ex.: `aula-java`)
2. Abra essa pasta no VS Code
3. Crie um arquivo `Main.java` com o conteúdo:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Ola, mundo!");
    }
}
```

4. Clique em **Run** (aparece acima do método `main`, ou use `Ctrl+F5`)
5. Deve aparecer `Ola, mundo!` no terminal integrado

Se isso funcionou, está tudo pronto para a aula.

## Problemas comuns

| Problema | Solução |
|---|---|
| `java`/`javac` não reconhecido no terminal | Reinstalar marcando a opção de configurar PATH/JAVA_HOME, ou adicionar manualmente a pasta `bin` do JDK ao PATH |
| Extensão Java não reconhece o projeto | Certifique-se de ter aberto a **pasta** no VS Code (File > Open Folder), não só o arquivo |
| Erro "class Main is public, should be declared in a file named Main.java" | O nome do arquivo `.java` precisa ser exatamente igual ao nome da classe pública dentro dele |
| Múltiplas versões de Java instaladas e comando errado é usado | Rodar `java -version` para conferir qual está ativa; se necessário, desinstalar versões antigas ou ajustar o PATH para priorizar o Java 17 |
