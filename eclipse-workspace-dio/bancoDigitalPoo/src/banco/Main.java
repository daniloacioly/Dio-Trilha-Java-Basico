package banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", "111.222.333-00");
        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        cc.depositar(1000);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
