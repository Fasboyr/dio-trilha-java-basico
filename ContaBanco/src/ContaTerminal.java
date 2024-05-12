import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ContaTerminal conta = new ContaTerminal(); 

        System.out.println("--Por favor, insira abaixo os dados requisitados--");

        System.out.println("Número da Agência:");
        conta.numero = scanner.nextInt();

        System.out.println("Nome da Agência:");
        conta.agencia = scanner.next();

        System.out.println("Seu nome:");
        conta.nomeCliente = scanner.next();

        System.out.println("Saldo:");
        conta.saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo de R$ %.2f já está disponível para saque.\n", conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);

    
    }
}
