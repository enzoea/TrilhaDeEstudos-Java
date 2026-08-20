// Exemplo de: estruturas de repeticao (ver 05-repeticao.md)
class Repeticao {
    public static void main(String[] args) {
        // while: repete enquanto a condicao for verdadeira
        int contador = 0;
        while (contador < 5) {
            System.out.println("while: " + contador);
            contador++;
        }

        // for classico: inicio ; condicao ; incremento
        for (int i = 0; i < 5; i++) {
            System.out.println("for: " + i);
        }

        // for com passo (equivalente a range(0, 10, 2) do Python)
        for (int i = 0; i < 10; i += 2) {
            System.out.println("par: " + i);
        }

        // contagem regressiva
        for (int i = 5; i > 0; i--) {
            System.out.println("regressiva: " + i);
        }

        // break e continue funcionam igual ao Python
        for (int i = 0; i < 10; i++) {
            if (i == 3) continue; // pula o 3
            if (i == 6) break;    // para no 6
            System.out.println("break/continue: " + i);
        }

        // for aninhado (um dentro do outro): retangulo de asteriscos
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
