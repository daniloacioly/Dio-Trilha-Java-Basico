import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o saldo inicial da conta
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextDouble

        // Solicita e lê a quantidade total de transações
        int quantidadeTransacoes = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicita e lê o tipo de transação (D para depósito ou S para saque)
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Solicita e lê o valor da transação
            double valorTransacao = scanner.nextDouble();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextDouble

            // Atualiza o saldo da conta e adiciona a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(i + ". Deposito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(i + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final
        System.out.println("Saldo: " + saldo);

        // Exibe a lista de transações
        System.out.println("Transacoes:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
