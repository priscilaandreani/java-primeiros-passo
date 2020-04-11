package bytebank;

public class Conta {
	//atributos do objeto conta
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	//métodos (o que eu posso fazer com a conta)
	public void deposita(double valor) /* void não tem resposta */ {
		//this especifica o atributo do método que está sendo invocado
		this.saldo = saldo + valor;
	}
}
