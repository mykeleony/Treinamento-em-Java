package aed;    // Prática em estruturas de dados.

// Classe que engloba funcionalidades e características de vetores em Java:
public class arrays {
    static double[] precos = {100, 200, 300, 400, 100};
    double[] precos_alternativo = new double[3]; // Quando se sabe a quantidade de elementos do array de antemão.

    public static double calculaMedia(double[] precos) {
        double soma = 0;
        int tam_vetor = precos.length;

        if(tam_vetor <= 0)
            return 0;

        for(double valor: precos)
            soma += valor;
        
        return soma/tam_vetor;
    }

    public static void imprimeVetor(double[] vetor) {
        int tam_vetor = vetor.length;

        for(int i=0; i<tam_vetor; i++)
            System.out.println(vetor[i]);
    }

    public static void copiaVetor(double[] v1, double[] v2) {
        for(int i=0; i<v1.length; i++)
            v2[i] = v1[i];
    }

    public static void main(String[] args) {  
        for(int i=0; i<precos.length; i++)
            System.out.println("Elemento "+(i+1)+": "+precos[i]);
        
        System.out.println("Preço médio dos materiais: "+calculaMedia(precos));
        System.out.println("-------------------------------------------------");
        
        double[] exemplo = {4.5, 5.6, 7.8};

        imprimeVetor(exemplo);
    }
}