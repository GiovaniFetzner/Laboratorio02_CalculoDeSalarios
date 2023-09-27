package classes;

public class FuncionarioHorista extends Funcionario{
    private double salarioPorHora;

    private int horasTrabalhadasNaSemana;

    public FuncionarioHorista(String nome, String CPF, double salario, int horasTrabalhadas, String tipo) {
        setNome(nome);
        setCPF(CPF);
        setTipo(tipo);
        this.salarioPorHora = salario;
        this.horasTrabalhadasNaSemana = horasTrabalhadas;
    }

    @Override
    public double getRendimentos() {
        if(horasTrabalhadasNaSemana <40){
            return salarioPorHora * horasTrabalhadasNaSemana;
        } else{
         return (40*salarioPorHora)+((horasTrabalhadasNaSemana -40)*1.5) ;
        }
    }

    public int getHorasTrabalhadasNaSemana() {
        return horasTrabalhadasNaSemana;
    }

    public void setHorasTrabalhadasNaSemana(int horasTrabalhadasNaSemana) {
        this.horasTrabalhadasNaSemana = horasTrabalhadasNaSemana;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

}
