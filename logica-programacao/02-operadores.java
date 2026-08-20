// Exemplo de: operadores aritmeticos, relacionais e logicos (ver 02-operadores.md)
class Operadores {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtracao: " + (a - b));
        System.out.println("Multiplicacao: " + (a * b));

        // Divisao entre dois int trunca o resultado (nao arredonda)
        System.out.println("Divisao inteira: " + (a / b));       // 3
        System.out.println("Divisao decimal: " + ((double) a / b)); // 3.5
        System.out.println("Resto: " + (a % b));

        // Nao existe operador de potencia em Java, usa-se Math.pow
        double potencia = Math.pow(2, 3);
        System.out.println("2 elevado a 3: " + potencia);

        // Relacionais
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logicos: && (e), || (ou), ! (nao)
        boolean maiorDeIdade = true;
        boolean temDocumento = false;
        System.out.println("Pode entrar: " + (maiorDeIdade && temDocumento));
        System.out.println("Pode entrar (com um dos dois): " + (maiorDeIdade || temDocumento));
        System.out.println("Nao tem documento: " + (!temDocumento));

        // Incremento/decremento (nao existe em Python)
        int contador = 5;
        contador++;
        System.out.println("Contador incrementado: " + contador);

        // Comparando texto: NUNCA usar == , sempre usar .equals()
        String x = "abc";
        String y = "abc";
        System.out.println("x == y (nao confiavel): " + (x == y));
        System.out.println("x.equals(y) (forma correta): " + x.equals(y));
    }
}
