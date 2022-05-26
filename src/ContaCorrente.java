import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.print("                         Extrato Conta Corrente    ");
        System.out.println(data + " - " + hora);
        System.out.println("------------------------------------------------------------------------");
        super.imprimirInfosComuns();
        System.out.println("------------------------------------------------------------------------");
        System.out.println(String.format("Depósito (05/05): %.2f", this.valorDeposito));
        System.out.println(String.format("Contratação de Crédito Pessoal: %.2f", this.creditoPessoal));
        System.out.println(String.format("Transferência p/ Conta Poupança: %.2f", this.valorTransferencia));

        for (int i = 0; i < saques.size(); i++) {
            System.out.println(String.format("Saque Cartão Débito " + "(" + (i + 1) + ")" + ": %.2f", this.saques.get(i)));
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }
}
