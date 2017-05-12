package br.ufg.inf.ex5a11;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {

    protected String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escola, String universidade, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return this.universidade;
    }

    public void setRendaTotal() {
        super.setRendaTotal();
        this.rendaTotal = (this.rendaTotal * 2) + this.comissao.adicionalSalario;
    }
}
