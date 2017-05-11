package br.ufg.inf.ex5a11;

public class Empresa {

    protected Funcionario[] funcionarios = new Funcionario[10];

    public double getTotalSalarios() {
        double total = 0;

        for (Funcionario funcionario : this.funcionarios) {
            total += funcionario.getRendaTotal();
        }

        return total;
    }

    public double getTotalSalariosEnsinoBasico() {
        double total = 0;

        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario instanceof FuncionarioEnsinoBasico) {
                total += funcionario.getRendaTotal();
            }
        }

        return total;
    }

    public double getTotalSalariosEnsinoMedio() {
        double total = 0;

        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario instanceof FuncionarioEnsinoMedio) {
                total += funcionario.getRendaTotal();
            }
        }

        return total;
    }

    public double getTotalSalariosEnsinoSuperior() {
        double total = 0;

        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario instanceof FuncionarioEnsinoSuperior) {
                total += funcionario.getRendaTotal();
            }
        }

        return total;
    }
}
