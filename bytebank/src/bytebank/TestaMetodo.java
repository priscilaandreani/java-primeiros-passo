package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		// Váriavel classe 
		Conta contaTemporaria = new Conta();
		contaTemporaria.saldo = 200;
		contaTemporaria.deposita(100);
		
		boolean conseguiuSacar = contaTemporaria.saca(20);
		System.out.println(contaTemporaria.saldo);
		System.out.println("A operação foi realizada: "+ conseguiuSacar);
		
		Conta contaRica = new Conta();
		contaRica.saldo = 2000;
		
		boolean transferencia = contaRica.transfere(2200, contaTemporaria);
		System.out.println(contaRica.saldo);
		System.out.println(contaTemporaria.saldo);
		
		if(transferencia) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Não foi possível realizar a trasnferência. Saldo insuficiente.");
		}
	}
}
