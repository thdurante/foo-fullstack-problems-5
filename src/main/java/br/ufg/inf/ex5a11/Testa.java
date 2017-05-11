package br.ufg.inf.ex5a11;


public class Testa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        for (int i = 0; i < 4; i++) {
            FuncionarioEnsinoBasico basico = new FuncionarioEnsinoBasico("Basico" + i, i + "", "Escola" + i);
            basico.setRendaTotal();
            empresa.funcionarios[i] = basico;
        }

        for (int i = 4; i < 8; i++) {
            FuncionarioEnsinoMedio medio = new FuncionarioEnsinoMedio("Medio" + i, i + "", "Escola" + i);
            medio.setRendaTotal();
            empresa.funcionarios[i] = medio;
        }

        for (int i = 8; i < 10; i++) {
            FuncionarioEnsinoSuperior superior = new FuncionarioEnsinoSuperior("Superior", "1", "A", "B");
            superior.setRendaTotal();
            empresa.funcionarios[i] = superior;
        }

        System.out.println("Total de custos: " + empresa.getTotalSalarios());
        System.out.println("Total dos salários de nível básico: " + empresa.getTotalSalariosEnsinoBasico());
        System.out.println("Total dos salários de nível médio: " + empresa.getTotalSalariosEnsinoMedio());
        System.out.println("Total dos salários de nível superior: " + empresa.getTotalSalariosEnsinoSuperior());
    }
}
