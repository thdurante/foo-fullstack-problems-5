package br.ufg.inf.ex5a11;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escola, Comissao comissao) {
        super(nome, codigoFuncional, escola, comissao);
        this.escola = escola;
    }

    public void setRendaTotal() {
        super.setRendaTotal();
        this.rendaTotal = (this.rendaTotal * 1.5) + this.comissao.adicionalSalario;
    }
}
