package aed;

public class matriz_produtos {
    // Nomes dos produtos:
    static char[][] produtos = {{'A', 'l','v','e','n','a','r', 'i', 'a'}, {'V','i','n','i','l'}, {'F','i','b','r','a'}};
    // Alternativas à declaração da matriz produtos:
    static char[][] produtos_alt1 = new char[3][9];  // Define o tamanho máximo dos arrays de caracteres.
    static char[][] produtos_alt2 = new char[3][];
    static String[] produtos_alt3 = {"Alvenaria", "Vinil", "Fibra"};

    public static void main(String[] args) {
        System.out.println(produtos[0]);    // Primeira palavra.
        System.out.println(produtos[0][1]); // Segunda letra da primeira palavra.
        System.out.println(produtos.length);   // Quantidade de palavras na matriz.
        System.out.println(produtos[0].length);   // Quantidade de caracteres no primeiro elemento da matriz.

        System.out.println("Quantidades de caracteres de cada palavra na matriz produtos:");

        for(char[] produto: produtos)
            System.out.println(produto.length);
    }
}
