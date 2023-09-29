package classes;

public class FuncionarioComissionado extends Funcionario{

    private double taxaComissao, vendasBrutas;

    public FuncionarioComissionado(String nome, String CPF,
                                   double taxaComissao, double vendasBrutas, String tipo) {
        setNome(nome);
        setCPF(CPF);
        setTipo(tipo);
        this.taxaComissao = (1+(taxaComissao/100));
        this.vendasBrutas = vendasBrutas;
        setTipoClasse(TipodeFuncionario.COMISSIONADO);
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
        return (getTaxaComissao()*vendasBrutas);
    }
}
