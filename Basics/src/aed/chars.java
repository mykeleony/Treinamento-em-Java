package aed;

public class chars {
    static char[] caracteres = {'a', 'A', '0', 'f'};

    // Imprime um vetor na tela:
    public static void imprimeVetor(char[] vetor) {
        int tam_vetor = vetor.length;

        if (tam_vetor == 0) {
            System.out.println("{}");
            return;
        }
        
        System.out.print("{");

        for(int i=0; i<=tam_vetor-2; i++)
            System.out.print(vetor[i]+", ");
        
        System.out.println(vetor[tam_vetor-1]+"}");
    }

    // Retorna o número de digitos em uma linha:
    public static int contaDigitos(char[] linha) {
        int n = 0;

        for(char caractere: linha)
            if(Character.isDigit(caractere))
                n++;
        
        return n;
    }

    public static void main(String[] args) {
        System.out.println("O caractere '"+caracteres[1]+"' é maiúsculo? "+Character.isLowerCase(caracteres[1]));
        System.out.println("E o caractere '"+caracteres[0]+"'? "+Character.isLowerCase(caracteres[0]));

        imprimeVetor(caracteres);

        for(int i=0; i<caracteres.length; i++)
            System.out.print(Character.toUpperCase(caracteres[i])+" ");
    
        System.out.print("\n");

        System.out.println("O caractere '"+caracteres[2]+"' é um número? "+Character.isDigit(caracteres[2]));

        char[] teste = new char[10];

        for(int i=0; i<10; i++)
            teste[i] = (char) (i+47);

        imprimeVetor(teste);

        System.out.println("Quantidade de dígitos do vetor acima: "+contaDigitos(teste));
    }
}
