package utilidades;

public class Registro_Contas {

	public static void main(String[] args) {
		Correntista [] correntistas = new Correntista[2];
		
		correntistas[0] = new Correntista("501.437.978-83", "Myke Leony dos Santos Amorim");
		correntistas[1] = new Correntista("012.345.678-90", "Reinaldo Gostosa Junior");
		
		Conta minha = new Conta(8, 8000, correntistas);
		
		minha.imprimeDados();
		
		minha.fazSaque(1);
		
		minha.imprimeDados();
	}

}
