package classes;

public class ContaRendimento {

    private static final int NUMERO_FUNCIONARIOS = 50;
    private Funcionario [] folha;
    private int numeroElementos;

    public ContaRendimento(){
        folha = new Funcionario[NUMERO_FUNCIONARIOS];
        numeroElementos = 0;
    }
    public void registrarFuncionario(Funcionario funcionario){
            folha[numeroElementos++]=funcionario;
    }
    public Funcionario [] getFolha(){
            return folha;
    }
    public double getRendimentoTotal(){
        double total = 0.0;
        for (int index = 0; index < folha.length; index++){
            Funcionario f = folha[index];
            if(f != null){
                total += f.getRendimentos();
            }
        }
        return total;
    }

}
