package classes;

public class FuncionarioHorista extends Funcionario{
    private double salario;

    public FuncionarioHorista(String nome, String CPF, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public double getSalario(int horasTrabalhadas) {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimentos() {
        return 0;
    }
}
