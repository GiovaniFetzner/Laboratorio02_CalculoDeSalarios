package classes;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado{

    private double salario;

    public FuncionarioComissionadoBaseSalario(String nome, String CPF, double taxaComissao, double vendasBrutas, String tipo) {
        super(nome, CPF, taxaComissao, vendasBrutas, tipo);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimentos() {
        return salario+(super.getTaxaComissao()*super.getVendasBrutas());
    }
}
