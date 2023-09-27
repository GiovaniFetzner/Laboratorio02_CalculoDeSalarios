package classes;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal = 700.00;

    public FuncionarioAssalariado(String nome, String CPF, double salarioSemanal) {
        setNome(nome);
        setCPF(CPF);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double getRendimentos() {
        return salarioSemanal*4;
    }
}
