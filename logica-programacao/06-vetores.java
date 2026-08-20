// Exemplo de: vetores/arrays (ver 06-vetores.md)
class Vetores {
    public static void main(String[] args) {
        // Criando com valores ja definidos
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Tamanho: " + numeros.length); // sem parenteses, e atributo

        // Criando vazio, com tamanho fixo, para preencher depois
        int[] idades = new int[3];
        idades[0] = 18;
        idades[1] = 25;
        idades[2] = 30;

        // Percorrendo com indice (util quando se precisa da posicao)
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + ": " + numeros[i]);
        }

        // Percorrendo com for-each (quando so importa o valor)
        int soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        System.out.println("Soma de todos: " + soma);

        // Alterando um valor existente
        numeros[0] = 99;
        System.out.println("Apos alterar indice 0: " + numeros[0]);
    }
}
