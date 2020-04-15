
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 14;
		
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >=2;
		
		if (idade>=18 || acompanhado) {
			System.out.println("Seja bem vindo!");
		} else {
			System.out.println("Você não pode entrar");
		}
	}
}
