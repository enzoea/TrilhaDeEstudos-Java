// Exemplo de: funcoes/metodos (ver 07-funcoes.md)
class Funcoes {

    // Metodo que retorna um valor: precisa declarar o tipo do retorno (int)
    static int somar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: mesmo nome "somar", parametros diferentes (double em vez de int)
    static double somar(double a, double b) {
        return a + b;
    }

    // Metodo que nao retorna nada: tipo de retorno "void"
    static void saudacao(String nome) {
        System.out.println("Ola, " + nome);
    }

    // Metodo que retorna um boolean
    static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        int resultadoInt = somar(3, 4);
        double resultadoDouble = somar(3.5, 1.2);

        System.out.println("Soma int: " + resultadoInt);
        System.out.println("Soma double: " + resultadoDouble);

        saudacao("Ana");

        System.out.println("8 e par? " + ehPar(8));
        System.out.println("7 e par? " + ehPar(7));
    }
}
