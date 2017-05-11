package br.ufg.inf.ex5a11;

public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {

    protected String universidade;

    public FuncionarioEnsinoSuperior(String nome, String codigoFuncional, String escola, String universidade) {
        super(nome, codigoFuncional, escola);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return this.universidade;
    }

    public void setRendaTotal() {
        super.setRendaTotal();
        this.rendaTotal = this.rendaTotal * 2;
    }
}
