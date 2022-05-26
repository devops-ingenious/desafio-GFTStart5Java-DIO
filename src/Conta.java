import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;

    protected double creditoPessoal;

    protected double valorDeposito;

//    protected double[] saques;
    protected List<Double> saques = new ArrayList<Double>();

    protected double valorTransferencia;
    protected double saldo;

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        saques.add(valor);
//        valorSaque = valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        valorDeposito = valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
//        this.sacar(valor);
        saldo -= valor;
        contaDestino.depositar(valor);
        valorTransferencia = valor;
    }

    @Override
    public void creditoPessoal(double valor) {
        creditoPessoal = valor;
        saldo += creditoPessoal;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getCreditoPessoal() {
        return creditoPessoal;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Agência: %s", this.agencia));
        System.out.println(String.format("Número da Conta: %d", this.numero));
        System.out.println(String.format("Saldo Disponível: %.2f", this.saldo));
    }
}
