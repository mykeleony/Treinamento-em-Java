package poo.classes_abstratas.Cinema;

public abstract class Filme {
    int duracaoMinutos;

    abstract void play();   // Todas as subclasses da superclasse abstrata implementam o método "play" de formas diferentes.
    abstract void close();
}
