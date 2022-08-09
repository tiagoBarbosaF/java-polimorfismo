import model.Cliente;
import model.Contas.ContaCorrente;
import model.Contas.ContaPoupanca;

public class TestContas {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(111, 2222, new Cliente("Tiago", "1111111", "programador"));
        ContaPoupanca contaPoupanca = new ContaPoupanca(333, 5555, new Cliente("Tiago", "1111111", "programador"));

        contaCorrente.deposita(1000);
        contaPoupanca.deposita(100);

        contaCorrente.transfere(250, contaPoupanca);

        System.out.println("conta corrente: " + contaCorrente.getSaldo());
        System.out.println("conta poupança: " + contaPoupanca.getSaldo());
    }
}
