package dio.challenge.gof;

import dio.challenge.gof.facade.HomeTheater;
import dio.challenge.gof.singleton.GerenciadorConexaoBancoDeDados;
import dio.challenge.gof.strategy.CarrinhoCompras;
import dio.challenge.gof.strategy.PagamentoCartaoCredito;
import dio.challenge.gof.strategy.PagamentoPayPal;
import dio.challenge.gof.strategy.PagamentoPix;
import dio.challenge.gof.subsistema1.Conexao;
import subsistema2.DVDPlayer;
import subsistema2.Luzes;
import subsistema2.Projetor;

public class Teste {
    public static void main(String[] args) {

        //Teste do Padrão Singleton
        GerenciadorConexaoBancoDeDados gerenciador = GerenciadorConexaoBancoDeDados.getInstancia();
        
        Conexao conexao = gerenciador.getConexao();
        System.out.println("Status da conexão: " + conexao.taConectado());

        GerenciadorConexaoBancoDeDados outroGerenciador = GerenciadorConexaoBancoDeDados.getInstancia();
        Conexao outraConexao = outroGerenciador.getConexao();

        System.out.println("É a mesma instancia? " + (gerenciador == outroGerenciador));
        System.out.println("É a mesma conexão? " + (conexao == outraConexao));

        conexao.desconectar();
        System.out.println("Status da conexão: " + conexao.taConectado());



        //Teste do Padrão Strategy
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.setMetodoPagamento(new PagamentoCartaoCredito());
        carrinho.checkout(100.0);

        carrinho.setMetodoPagamento(new PagamentoPayPal());
        carrinho.checkout(200.0);

        carrinho.setMetodoPagamento(new PagamentoPix());
        carrinho.checkout(50);


        //Teste do Padrão Facade
        DVDPlayer dvd = new DVDPlayer();
        Projetor projetor = new Projetor();
        Luzes luzes = new Luzes();

        HomeTheater homeTheater = new HomeTheater(dvd, projetor, luzes);
        homeTheater.assistirFilme();
    }
}
    
