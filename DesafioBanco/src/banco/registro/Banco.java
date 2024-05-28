package banco.registro;


import java.util.ArrayList;
import java.util.List;

import banco.conta.Conta;

public class Banco{

    private String nome;
    private List<Conta> contas;


    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void clientes(Banco banco){
        System.out.println(String.format("Banco: %s", banco.nome) );
        for(Conta conta : banco.getContas()){
            conta.imprimirExtrato();
        }
    }

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
