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

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setVendasBrutas(double vendasBrutas) {
        this.vendasBrutas = vendasBrutas;
    }

    @Override
    public double getRendimentos() {
        return 0;
    }
}
