import model.Funcionario;
import model.Gerente;

public class Main {
    public static void main(String[] args) {
        Funcionario tiago = new Funcionario();
        tiago.setNome("Tiago Barbosa");
        tiago.setCpf("2233445566-99");
        tiago.setSalario(7000);

        System.out.println(tiago.getNome());
        System.out.println(tiago.getBonificacao());

        Gerente gerente1 = new Gerente();
        gerente1.setNome("Peter");
        gerente1.setSalario(5000);
        System.out.println(gerente1.getNome());
        System.out.println("Salário: " + gerente1.getSalario());
        System.out.println("Bonificação: " + gerente1.getBonificacao());
    }
}
