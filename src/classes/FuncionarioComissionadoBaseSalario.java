package classes;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado{

    private double salario;

    public FuncionarioComissionadoBaseSalario(String nome, String CPF, double taxaComissao, double vendasBrutas) {
        super(nome, CPF, taxaComissao, vendasBrutas);
    }

    @Override
    public double getRendimentos() {
        return super.getRendimentos();
    }
}
