package exemplo_contas;

public class conta {
	String cliente;
	double saldo;
	
	void exibeSaldo() {
		System.out.println(cliente+", seu saldo atual é de R$"+saldo);
	}
	
	void deposito(double valor) {
		saldo+=valor;
	}
	
	void saque(double valor) {
		saldo-=valor;
	}
}
