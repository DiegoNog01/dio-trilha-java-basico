import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.next();

        System.out.println("Digite a agencia:");
        agencia = scanner.next();

        System.out.println("Digite o numero da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo do cliente:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
        
        
    }
}
