import java.util.Scanner;
import java.util.Locale;

class MediaESituacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // le "8.5" com ponto; sem isso, o Scanner usaria o locale pt-BR e exigiria virgula ("8,5")

        System.out.print("Digite 3 notas separadas por espaco: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String situacao;
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperacao";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Media: " + media + " - Situacao: " + situacao);

        scanner.close();
    }
}
