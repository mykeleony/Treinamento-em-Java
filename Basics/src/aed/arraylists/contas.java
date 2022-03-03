package aed.arraylists;

import java.util.ArrayList;
import java.util.List;

public class contas {
    // Programação genérica (Generics) com tipos parametrizáveis em ArrayLists:

    public static void main(String[] args) {
        List<ContaCorrente> contas = new ArrayList<>();     // Tamanho variável.

        contas.add(new ContaCorrente(1000));
        contas.add(new ContaCorrente(5000));

        System.out.println(contas);

        System.out.println("\nContas: ");

        for(ContaCorrente c: contas)
            System.out.println(c);
    }

}
