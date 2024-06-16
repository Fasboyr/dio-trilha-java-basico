package dio.challenge.gof.singleton;

import dio.challenge.gof.subsistema1.Conexao;

public class GerenciadorConexaoBancoDeDados {
    private static GerenciadorConexaoBancoDeDados instancia;
    private Conexao conexao;

    private GerenciadorConexaoBancoDeDados() {
        conexao = new Conexao();
        conexao.conectar();
    }

    public static synchronized GerenciadorConexaoBancoDeDados getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorConexaoBancoDeDados();
        }
        return instancia;
    }

    public Conexao getConexao() {
        return conexao;
    }
}

