package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente dora = new Cliente ();
		dora.nome = "Dora Silva";
		dora.cpf = "122.222.222.44";
		dora.profissao = "Alfaiate";
		
		Conta contaDora = new Conta();
		contaDora.deposita(5000);
		
		// associa a cliente Dora a contaDora
		contaDora.titular = dora;
		System.out.println(contaDora.titular.nome);
		
		//mesma referencia para os objetos contaDora e Dora
		System.out.println(contaDora.titular);
		System.out.println(dora);
		
	}
}
