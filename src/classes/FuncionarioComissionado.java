package classes;

public class FuncionarioComissionado extends Funcionario{

    private double taxaComissao, vendasBrutas;

    public FuncionarioComissionado(String nome, String CPF,
                                   double taxaComissao, double vendasBrutas) {
        this.nome = nome;
        this.CPF = CPF;
        this.taxaComissao = taxaComissao;
        this.vendasBrutas = vendasBrutas;
    }

    @Override
    public double getRendimentos() {
        return 0;
    }
}
