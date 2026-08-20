// Exemplo de: estruturas condicionais (ver 04-condicionais.md)
class Condicionais {
    public static void main(String[] args) {
        int idade = 20;

        if (idade < 12) {
            System.out.println("Crianca");
        } else if (idade < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }

        // Operador ternario: forma curta de um if/else que so define um valor
        int nota = 8;
        String situacao = (nota >= 6) ? "Aprovado" : "Reprovado";
        System.out.println("Situacao: " + situacao);

        // Comparando texto dentro de um if: sempre com .equals()
        String resposta = "sim";
        if (resposta.equals("sim")) {
            System.out.println("Confirmado!");
        } else {
            System.out.println("Nao confirmado.");
        }
    }
}
