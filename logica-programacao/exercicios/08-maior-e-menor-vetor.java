import java.util.Scanner;

class MaiorEMenorVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("Maior: " + maior + " - Menor: " + menor);

        scanner.close();
    }
}
