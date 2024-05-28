package banco.conta;

public interface OperacoesBancaria {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor,Conta destino);

    void imprimirExtrato();
}
