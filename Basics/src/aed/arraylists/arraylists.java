package aed.arraylists;

import java.util.ArrayList;
import java.util.List;

public class arraylists {
    public static void main(String[] args){
        List amigos = new ArrayList();

        for(int i=0; i<10; i++)
            amigos.add(i);         

        int tamanhoArrayList = amigos.size();

        System.out.println("Tamanho do ArrayList "+amigos+": "+tamanhoArrayList);

        amigos.clear();

        System.out.println("Novo ArrayList: "+amigos);

        amigos.add("Reinaldo");
        amigos.add("Ellen");
        amigos.add("Julia");
        amigos.add("Felipe");

        Object chata = amigos.get(2);

        System.out.println("ArrayList de amigos com os chatos: "+amigos);

        amigos.remove(3);       // Excluindo do ArrayList pelo índice.
        amigos.remove(chata);   // Excluindo pelo objeto.

        System.out.println("ArrayList de amigos sem os chatos: "+amigos);
    }
}
