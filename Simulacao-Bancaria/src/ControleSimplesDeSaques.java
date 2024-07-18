import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        for (int i = 1; ; i++) {
            System.out.println("Informe o valor do saque " + i + ":");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; 
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; 
            } else {
                limiteRestante -= valorSaque;
                System.out.println("Saque de " + valorSaque + " realizado com sucesso. Limite restante: " + limiteRestante);
            }
        }

        scanner.close();
    }
}