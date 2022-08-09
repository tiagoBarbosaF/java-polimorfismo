package model.Contas;

import model.Base.Conta;
import model.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public boolean saca(double valor) {
         return super.saca(valor + 0.2);
    }
}
