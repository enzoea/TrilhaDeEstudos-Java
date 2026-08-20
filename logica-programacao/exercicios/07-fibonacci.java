import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos? ");
        int n = scanner.nextInt();

        int anterior = 0;
        int atual = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(anterior);
            if (i < n - 1) {
                System.out.print(", ");
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println();

        scanner.close();
    }
}
