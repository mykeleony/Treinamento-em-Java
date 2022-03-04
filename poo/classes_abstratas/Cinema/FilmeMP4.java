package poo.classes_abstratas.Cinema;

public class FilmeMP4 extends Filme {
    @Override   // "Avisa" o compilador que o método abaixo sobrescreve um método de uma classe abstrata.
    void play() {
        System.out.println("Esse método roda um filme MP4 utilizando o método abstrato 'play' da superclasse 'Filme'.");
    }

    @Override
    void close() {
        System.out.println("Esse método encerra um filme MP4 utilizando o método abstrato 'close' da superclasse 'Filme'.");
    }
}
