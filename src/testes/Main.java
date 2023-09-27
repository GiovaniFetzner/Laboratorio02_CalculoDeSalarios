package testes;

import classes.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        FuncionarioComissionadoBaseSalario ComissionadoBaseSalario = new
                FuncionarioComissionadoBaseSalario("João","123456789",20.00,10000.00);


        FuncionarioComissionado Comissionado = new FuncionarioComissionado("Jorge",
                "12345654321",50.00,5000.00);

        FuncionarioHorista Horista = new FuncionarioHorista("Irineu", "0987654321", 20.00, 45);


        FuncionarioAssalariado Assalariado = new FuncionarioAssalariado("Batista", "6789054321",
                500.00);


        ContaRendimento cr = new ContaRendimento();
        cr.registrarFuncionario(Assalariado);
        cr.registrarFuncionario(Horista);
        cr.registrarFuncionario(Comissionado);
        cr.registrarFuncionario(ComissionadoBaseSalario);

        Funcionario[] folha = cr.getFolha();
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Lista de Funcionarios\nEscolha sua Operação:");
            System.out.println("1. Lista de Funcionarios\n2. Rendimento Total\n3. Finalizar Operação");
            int numb = ler.nextInt();

            switch (numb){
                case 1:
                    MostraFuncionario(folha);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nTotal de rendimento na folha: " + cr.getRendimentoTotal()+"\n");
                    break;
                case 3:
                    System.out.println("Obrigado pela Consulta\n\nAté a proxima :)");
                    return;
                default:
                    System.out.println("Escolha invalida\nTente novamente.");
                    break;
            }
        }

    }

    private static void MostraFuncionario (Funcionario[]fun){
        for (int i = 0;i<fun.length;i++){
            Funcionario f = fun[i];
            if(f != null){
                mostra(f);
            }
        }
    }

    private static void mostra(Funcionario f){
        System.out.println("\nNome do Funcionario: " + f.getNome());
        System.out.println("CPF do Funcionario: " + f.getCPF());
        System.out.println("Seu rendimento: " + f.getRendimentos());
        System.out.println("Sua Classe: " + f.getClass());
    }
}