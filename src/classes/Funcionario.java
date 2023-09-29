package classes;

public abstract class Funcionario {
    public String nome, CPF;
    public double rendimentos;
    public String tipo;

    public TipodeFuncionario getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(TipodeFuncionario tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public TipodeFuncionario tipoClasse;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract double getRendimentos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setRendimentos(double rendimentos) {
        this.rendimentos = rendimentos;
    }

}