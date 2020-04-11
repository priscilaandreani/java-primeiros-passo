package bytebank;

public class Conta {
	//atributos do objeto conta
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
}
