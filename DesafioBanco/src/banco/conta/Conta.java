package banco.conta;

import banco.registro.Cliente;

public abstract class Conta implements OperacoesBancaria {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;


    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;



    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }


    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }


    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }


    @Override
    public void transferir(double valor, Conta destino) {
       this.sacar(valor);
       destino.depositar(valor);
    }

    protected void imprmirDados(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()) );
        System.out.println(String.format("Agencia: %d", agencia) );
        System.out.println(String.format("Numero: %d", numero) );
        System.out.println(String.format("Saldo: %.2f", saldo) );
    }

   

}
