package banco.servico;

import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;
import banco.registro.Cliente;



public class Caixa {
	
	public static void main(String[] args) {
	Cliente carlos = new Cliente();
	carlos.setNome("Carlos");
	
	Conta cc = new ContaCorrente(carlos);
	Conta poupanca = new ContaPoupanca(carlos);

	cc.depositar(100);
	cc.transferir(50, poupanca);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
}
}
