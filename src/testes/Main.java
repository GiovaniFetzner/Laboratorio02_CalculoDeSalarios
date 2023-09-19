package testes;

import classes.FuncionarioAssalariado;
import classes.FuncionarioComissionado;
import classes.FuncionarioComissionadoBaseSalario;
import classes.FuncionarioHorista;

public class Main {
    public static void main(String[] args) {

        FuncionarioComissionadoBaseSalario funcionarioComissionadoBaseSalarioComissionadoBaseSalario = new
                FuncionarioComissionadoBaseSalario("João","123456789",20.00,10000.00);

        System.out.println("Rendimentos do funcionario comissionado e com salário: " +
                funcionarioComissionadoBaseSalarioComissionadoBaseSalario.getRendimentos());

        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Jorge",
                "12345654321",50.00,5000.00);

        System.out.println("Rendimentos do funcionario comissionado e sem salário: " +
                funcionarioComissionado.getRendimentos());

        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Irineu", "0987654321", 20.00, 45);

        System.out.println("Rendimentos do funcionario horista: " + funcionarioHorista.getRendimentos());

        FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("Batista", "6789054321",
                500.00);

        System.out.println("Rendimentos do funcionario assalariado: " + funcionarioAssalariado.getRendimentos());


    }
}