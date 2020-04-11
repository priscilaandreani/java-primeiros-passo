package bytebank;

public class TestaContaNull {
	public static void main(String[] args) {
		Conta contaPaula = new Conta();
		System.out.println(contaPaula.titular);
		
	contaPaula.titular = new Cliente();
	System.out.println(contaPaula.titular);
	
	contaPaula.titular.nome = "Paula Fernandes";
	System.out.println(contaPaula.titular.nome);
	}
}
