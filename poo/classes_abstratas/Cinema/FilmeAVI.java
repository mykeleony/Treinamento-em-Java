package poo.classes_abstratas.Cinema;

public class FilmeAVI extends Filme {
    @Override   // "Avisa" o compilador que o método abaixo sobrescreve um método de uma classe abstrata.
    void play() {
        System.out.println("Esse método roda um filme AVI utilizando o método abstrato 'play' da superclasse 'Filme'.");
    }

    @Override
    void close() {
        System.out.println("Esse método encerra um filme AVI utilizando o método abstrato 'close' da superclasse 'Filme'.");
    }
}
