package exemplo_contas;

public class conta_exemplo {
	public static void main(String args[]) {
		
		conta conta = new conta();
		conta.cliente = "Daniel";
		conta.saldo = 4000.00;
		
		conta.exibeSaldo();
	}
}
