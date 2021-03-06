package br.ufg.inf.ex5a11;

public abstract class Funcionario {

    protected String nome;
    protected String codigoFuncional;
    protected double rendaBasica;
    protected double rendaTotal;
    protected Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.rendaBasica = 1000;
        this.comissao = comissao;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigoFuncional() {
        return this.codigoFuncional;
    }

    public double getRendaBasica() {
        return this.rendaBasica;
    }

    public double getRendaTotal() {
        return this.rendaTotal;
    }

    public void setRendaTotal() {
        this.rendaTotal = this.rendaBasica;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n Comissão: " + this.comissao.adicionalSalario + "\n Salário total: " + this.rendaTotal;
    }
}
