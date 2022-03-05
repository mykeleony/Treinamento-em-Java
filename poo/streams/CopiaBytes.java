package poo.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiaBytes {   // Lê um arquivo byte a byte e escreve em outro arquivo.
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("arquivodeentrada.txt");
            out = new FileOutputStream("arquivodesaida.txt");

            int c;

            while((c = in.read()) != -1)
                out.write(c);
        } finally {     // O bloco é executado com ou sem exceção.
            if(in != null)
                in.close();
            
            if(out != null)
                out.close();
        }
    }
}
