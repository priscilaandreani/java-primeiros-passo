

public class Conta {
	//atributos do objeto conta
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
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
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
