package classes;

public class FuncionarioAssalariado extends Funcionario{
    private double salarioSemanal = 700.00;

    public FuncionarioAssalariado(String nome, String CPF, double salarioSemanal, String tipo) {
        setNome(nome);
        setCPF(CPF);
        setTipo(tipo);
        this.salarioSemanal = salarioSemanal;
        setTipoClasse(TipodeFuncionario.ASSALARIADO);
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
