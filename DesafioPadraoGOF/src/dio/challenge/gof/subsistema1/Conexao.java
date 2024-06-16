package dio.challenge.gof.subsistema1;

public class Conexao {
    private boolean taConectado;

    public Conexao() {
        this.taConectado = false;
    }

    public void conectar() {
        if (!taConectado) {
            taConectado = true;
            System.out.println("Conexão com banco de dados estabelecida.");
        }
    }

    public void desconectar() {
        if (taConectado) {
            taConectado = false;
            System.out.println("Conexão com banco de dados finalizada.");
        }
    }

    public boolean taConectado() {
        return taConectado;
    }
}

