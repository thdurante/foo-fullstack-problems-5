package br.ufg.inf.ex5a11;


public class Testa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        for (int i = 0; i < 7; i++) {
            FuncionarioEnsinoBasico basico = new FuncionarioEnsinoBasico("Basico" + i, i + "", "Escola" + i, new ComissaoVendedor());
            basico.setRendaTotal();
            empresa.funcionarios[i] = basico;
        }

        for (int i = 7; i < 9; i++) {
            FuncionarioEnsinoMedio medio = new FuncionarioEnsinoMedio("Medio" + i, i + "", "Escola" + i, new ComissaoSupervisor());
            medio.setRendaTotal();
            empresa.funcionarios[i] = medio;
        }

        for (int i = 9; i < 10; i++) {
            FuncionarioEnsinoSuperior superior = new FuncionarioEnsinoSuperior("Superior", "1", "A", "B", new ComissaoGerente());
            superior.setRendaTotal();
            empresa.funcionarios[i] = superior;
        }

        System.out.println("Total de custos: " + empresa.getTotalSalarios());
        System.out.println("Total dos salários de nível básico: " + empresa.getTotalSalariosEnsinoBasico());
        System.out.println("Total dos salários de nível médio: " + empresa.getTotalSalariosEnsinoMedio());
        System.out.println("Total dos salários de nível superior: " + empresa.getTotalSalariosEnsinoSuperior());

        for (Funcionario funcionario : empresa.funcionarios) {
            System.out.println(funcionario);
        }
    }
}
