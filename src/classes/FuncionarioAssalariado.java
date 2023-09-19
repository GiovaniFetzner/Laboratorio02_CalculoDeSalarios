package classes;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal = 700.00;

    public FuncionarioAssalariado(String nome, String CPF, double salario) {
        this.salarioSemanal = salario;
        this.nome = nome;
        this.CPF = CPF;
    }

    public double getSalarioSemanal() {
        return salarioSemanal *4;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double getRendimentos() {
        return salarioSemanal;
    }
}
