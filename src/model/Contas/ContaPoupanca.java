package model.Contas;

import model.Base.Conta;
import model.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }
}
