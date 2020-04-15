

public class Conta {
	//atributos do objeto conta
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static: atributo da classe 
	
	//construtor de Conta :: atributos necesários para a criação da Conta com o new;
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("Total de contas abertas "+ total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Agencia: "+agencia+", ContaCorrente: "+numero);
	}
	
	//métodos (o que eu posso fazer com a conta)
	public void deposita(double valor) /* void não tem resposta */ {
		//this especifica o atributo do método que está sendo invocado
		this.saldo = saldo + valor;
	}
	
	public boolean saca (double valor) {
		if (this.saldo >= valor ) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor; // ou destino.deposita(valor)
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		if (novoNumero <= 0 ) {
			System.out.println("Número inválido, tente novamente.");
		} 
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0 ) {
			System.out.println("Número inválido, tente novamente.");
		} 
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
}
