package dio.challenge.gof.strategy;

public class CarrinhoCompras {

    private MetodoPagamento pagamento;

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.pagamento = metodoPagamento;
    }

    public void checkout(double amount) {
        pagamento.pagamento(amount);
    
    }
}
