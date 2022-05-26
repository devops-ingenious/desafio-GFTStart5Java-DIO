public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.depositar(500);
        cc.creditoPessoal(500);
        cc.sacar(100);
        cc.sacar(200);
        cc.sacar(300);

        Conta cp = new ContaPoupanca();
        cc.transferir(350, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
