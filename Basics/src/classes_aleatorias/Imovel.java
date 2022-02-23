package classes_aleatorias;

public class Imovel {
    // Retorna a área de um cômodo quadrado:
    static void areaComodoQuadrado(double lado) {
        System.out.println("A área da casa quadrada de lado "+lado+" é "+Math.pow(lado, 2)+" unidades de área.");
    }

    // Retorna a área de uma piscina redonda:
    static double areaPiscina(double raio) {
        return Math.pow(raio, 2)*Math.PI;
    }

    public static void main(String[] args) {
        areaComodoQuadrado(3);
    }
}

