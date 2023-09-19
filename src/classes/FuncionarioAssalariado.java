package classes;

public class FuncionarioAssalariado extends Funcionario{
    private double salario = 700.00;

    public FuncionarioAssalariado(String nome, String CPF, double salario) {
        this.salario = salario;
        this.nome = nome;
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimentos() {
        return salario;
    }
}
