package aed;

public class strings {
    
    // Inverte uma String:
    public static String inverteString(String original) {
        String resultado = "";
        
        for(int i=original.length()-1; i>=0; i--)
            resultado += original.charAt(i);
        
        return resultado;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Olá!");
        System.out.println(sb);

        sb.append(" Meu nome é Myke.");
        System.out.println(sb);

        int index = 3;

        System.out.println("O caractere número "+(index+1)+" do StringBuilder é "+sb.charAt(index));

        sb.delete(4, sb.length());
        System.out.println(sb);

        sb.deleteCharAt(3);
        System.out.println(sb);

        System.out.println(sb.reverse());

        sb.replace(0, sb.length(), "Oie");
        System.out.println(sb);

        sb.insert(3, " mundo!");
        System.out.println(sb);

        sb.insert(3, " textointruso");
        System.out.println(sb);

        System.out.println("O tamanho do StringBuilder é "+sb.length());
        sb.setLength(sb.length()+10);
        System.out.println("O tamanho do StringBuilder após a modificação é "+sb.length());

        String string_modificada = sb.toString();
        System.out.println("StringBuilder (mutável) "+string_modificada+" convertida para String (imutável).");

        String teste = "Teste";

        System.out.print("Testando a função de inversão manual de Strings na string \'"+teste+"\': ");
        System.out.print(inverteString(teste));
    }
}
