package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.deposita(200);
	
	// a referencia da segunda conta é a mesma que a da primeira conta, não é uma cópia
	//referencia para o mesmo objeto
		Conta segundaConta = primeiraConta;
		segundaConta.deposita(50);
				
		System.out.println("A primeira conta tem R$"+primeiraConta.getSaldo());
		System.out.println("A segunda conta tem R$"+segundaConta.getSaldo());
				
		System.out.println(primeiraConta); //@4aa298b7
		System.out.println(segundaConta); //@4aa298b7
		
	//provando que são a mesma conta
		if (primeiraConta == segundaConta) {
			System.out.println("Estas contas tem a mesma referência, portanto são a mesma");
		}
		
	// para criar uma conta diferente, ela deve ser criada com o new
	}
}
