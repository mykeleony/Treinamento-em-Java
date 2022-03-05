package poo.excecoes;

import java.io.FileReader;
import java.io.IOException;

public class ArquivoAlternativo {
    static char[] leArquivo(String titulo) throws IOException {   // Tratamento "externo" de exceções.
        char[] conteudo = new char[1024];

        FileReader fr = new FileReader(titulo);

        fr.read(conteudo);
        fr.close();

        return conteudo;
    }
}
