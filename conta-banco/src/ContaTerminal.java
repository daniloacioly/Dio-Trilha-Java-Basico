import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}