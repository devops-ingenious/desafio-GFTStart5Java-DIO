public class Main {

    public static void main(String[] args) {

        Cliente titularConta = new Cliente();
        titularConta.setNome("Maria Cecília");

        Conta cc = new ContaCorrente(titularConta);
        cc.depositar(500);
        cc.creditoPessoal(500);
        cc.sacar(100);
        cc.sacar(200);
        cc.sacar(300);

        Conta cp = new ContaPoupanca(titularConta);
        cc.transferir(350, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
