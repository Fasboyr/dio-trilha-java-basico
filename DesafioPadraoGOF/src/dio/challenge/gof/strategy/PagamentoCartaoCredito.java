package dio.challenge.gof.strategy;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public void pagamento(double quantidade) { 
        System.out.println("Pagou R$ " + quantidade + " usando cartão de crédito.");
    }
    
}
