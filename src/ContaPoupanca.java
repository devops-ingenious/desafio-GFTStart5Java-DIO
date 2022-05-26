public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.print("                         Extrato Conta Poupança    ");
        System.out.println(data + " - " + hora);
        System.out.println("-------------------------------------------------------------------------");
        super.imprimirInfosComuns();
        System.out.println("------------------------------------------------------------------------");
        System.out.println(String.format("Transferência Creditada (05/05): %.2f", this.valorDeposito));
        System.out.println("------------------------------------------------------------------------");
    }
}
