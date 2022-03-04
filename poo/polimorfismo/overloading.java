package poo.polimorfismo;

// Implementa a sobrecarga de métodos (métodos com o mesmo nome e diferentes parâmetros):
public class overloading {
    static int multiplica(int a, int b) {
        return (int) a*b;
    }

    static float multiplica(float a, float b) {
        return (float) a*b;
    }

    static double multiplica(double a, double b) {
        return (double) a*b;
    }

    public static void main(String[] args) {
        System.out.println(multiplica(1, 3));
        System.out.println(multiplica(4.0, 5.0));
    }
}
