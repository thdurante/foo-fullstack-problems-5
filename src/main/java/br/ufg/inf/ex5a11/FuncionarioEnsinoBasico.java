package br.ufg.inf.ex5a11;

public class FuncionarioEnsinoBasico extends Funcionario {

    protected String escola;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    public String getEscola() {
        return this.escola;
    }

    public void setRendaTotal() {
        super.setRendaTotal();
        this.rendaTotal = this.rendaTotal * 1.1;
    }
}
