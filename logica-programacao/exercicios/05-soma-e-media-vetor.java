import java.util.Scanner;

class SomaEMediaVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        double media = (double) soma / numeros.length;

        System.out.println("Soma: " + soma + " - Media: " + media);

        scanner.close();
    }
}
