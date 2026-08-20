// Exemplo de: variaveis e tipos de dados (ver 01-variaveis-e-tipos.md)
class VariaveisTipos {
    public static void main(String[] args) {
        String nome = "Ana";
        int idade = 25;
        double altura = 1.70;
        boolean estaMatriculada = true;
        char inicial = 'A';

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Matriculada: " + estaMatriculada);
        System.out.println("Inicial: " + inicial);

        // final = constante, o valor nao pode ser alterado depois de definido
        final double PI = 3.14159;
        System.out.println("PI: " + PI);

        // Descomente a linha abaixo para ver o erro de compilacao:
        // PI = 3.14;
    }
}
