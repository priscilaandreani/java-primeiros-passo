
public class GetterSetter {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(3248);
		System.out.println("O novo número da sua conta é: " + conta.getNumero());
	
	
	Cliente paulo = new Cliente();
	paulo.setNome("Paulo Alcantara");
	conta.setTitular(paulo);
	
	System.out.println("O titular da conta é: "+conta.getTitular().getNome());
	
	conta.getTitular().setProfissao("programdor");
	
	}
}
