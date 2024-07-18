import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor do saque desejado:");
        double saque = scanner.nextDouble();
        
        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        } else {
  
            double deficit = saque - saldo;
  
            if (deficit <= limiteChequeEspecial) {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }
        scanner.close();
    }
}
