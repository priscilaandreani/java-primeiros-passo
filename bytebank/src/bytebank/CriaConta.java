package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.deposita(200);
		System.out.println("A primeira conta tem R$"+primeiraConta.getSaldo());	
	
		Conta segundaConta = new Conta();
		segundaConta.deposita(300);
		System.out.println("A segunda conta tem R$"+segundaConta.getSaldo());
		
		// referencia das contas 
		System.out.println(primeiraConta); //bytebank.Conta@4aa298b7
		System.out.println(segundaConta); //bytebank.Conta@7d4991ad
		
	}
}
