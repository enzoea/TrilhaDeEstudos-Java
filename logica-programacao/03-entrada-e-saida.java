// Exemplo de: entrada e saida de dados com Scanner (ver 03-entrada-e-saida.md)
import java.util.Scanner;

class EntradaSaida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha deixada pelo nextInt()

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine(); // funciona por causa do nextLine() extra acima

        System.out.println("Ola, " + nome + "! Voce tem " + idade + " anos e mora em " + cidade + ".");

        scanner.close();
    }
}
