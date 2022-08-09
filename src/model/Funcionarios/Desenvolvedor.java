package model.Funcionarios;

import model.Base.Funcionario;

public class Desenvolvedor extends Funcionario {

    @Override
    public double getBonificacao() {
        return super.getBonificacao() + (super.getSalario() * 0.3);
    }
}
