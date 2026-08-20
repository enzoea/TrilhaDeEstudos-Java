import java.util.Scanner;
import java.util.Locale;

class CalculadoraFuncoes {

    static double somar(double a, double b) {
        return a + b;
    }

    static double subtrair(double a, double b) {
        return a - b;
    }

    static double multiplicar(double a, double b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // le "3.3" com ponto; sem isso, o Scanner usaria o locale pt-BR e exigiria virgula ("3,3")

        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();

        System.out.println("Escolha a operacao: 1-soma 2-subtracao 3-multiplicacao 4-divisao");
        int opcao = scanner.nextInt();

        double resultado;
        if (opcao == 1) {
            resultado = somar(a, b);
        } else if (opcao == 2) {
            resultado = subtrair(a, b);
        } else if (opcao == 3) {
            resultado = multiplicar(a, b);
        } else {
            resultado = dividir(a, b);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
