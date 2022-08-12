package model.Funcionarios;

import Interfaces.Autenticavel;
import model.Base.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getBonificacao() {
        return super.getSalario();
    }
}
