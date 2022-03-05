package poo.excecoes;

import java.io.FileReader;

public class Arquivo {
    static char[] leArquivo(String titulo) {
        char[] conteudo = new char[1024];

        try {
            FileReader fr = new FileReader(titulo);

            if(titulo.endsWith(".c"))   // Quando o arquivo é do tipo 'c', uma exceção própria é lançada.
                throw new ExcecaoEspecifica();

            fr.read(conteudo);
            fr.close();
        }

        catch (Exception e) {
            System.out.println("Ops! Algo deu errado. Erro: "+e);
        }

        return conteudo;
    }

    public static void main(String[] args) {
        try {
            System.out.println(leArquivo(args[0]));
        }
        
        catch(Exception e) {
            System.out.println("Ops! Algo deu MUITO errado. Erro: "+e);
        }
    }
}
