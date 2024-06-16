package dio.challenge.gof.strategy;

public class PagamentoPix implements MetodoPagamento {

    @Override
    public void pagamento(double quantidade) { 
        System.out.println("Pagou R$ " + quantidade + " usando Pix.");
    }
    
}
