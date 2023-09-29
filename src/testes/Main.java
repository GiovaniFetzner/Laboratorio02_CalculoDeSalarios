package testes;

import classes.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        FuncionarioComissionadoBaseSalario ComissionadoBaseSalario = new
                FuncionarioComissionadoBaseSalario("João","123456789",20.00,10000.00,"Comissionado com Base Salario");


        FuncionarioComissionado Comissionado = new FuncionarioComissionado("Jorge",
                "12345654321",50.00,5000.00,"Comissionado");

        FuncionarioHorista Horista = new FuncionarioHorista("Irineu", "0987654321", 20.00, 45,"Horista");


        FuncionarioAssalariado Assalariado = new FuncionarioAssalariado("Batista", "6789054321",
                500.00, "Assalariado.4");


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
                    System.out.println("\nSelecione o método de vísualização");
                    System.out.println("1. Funcionario Assalario\n2. Funcionario Horista\n3. Funcionario Comissionado" +
                            "\n4. Funcionario Comissionado Base Salario\n5. Todos os Funcionarios");
                    int fun = ler.nextInt();

                    if (fun == 1){
                        MostraFuncionarioAS(folha);
                    }
                    else if (fun == 2) {
                        MostraFuncionarioHs(folha);
                    }
                    else if(fun==3){
                        MostraFuncionarioCm(folha);
                    }
                    else if (fun == 4){
                        MostraFuncionarioCBS(folha);
                    }
                    else if (fun==5){
                        MostraFuncionario(folha);
                    }
                    else {
                        System.out.println("Nenhuma escolha valida.");
                }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\nTotal de rendimento na folha: R$" + cr.getRendimentoTotal()+"\n");
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

    private static void MostraFuncionarioCm (Funcionario[]fun){
        for (int i = 0;i<fun.length;i++){
            Funcionario f = fun[i];
            if (f != null && f.getTipo().equals("Comissionado")) {
                    mostra(f);
                }

        }
    }

    private static void MostraFuncionarioAS (Funcionario[]fun){
        for (int i = 0;i<fun.length;i++){
            Funcionario f = fun[i];
            if (f != null && f.getTipo().equals("Assalariado")) {
                mostra(f);
            }

        }
    }

    private static void MostraFuncionarioHs (Funcionario[]fun){
        for (int i = 0;i<fun.length;i++){
            Funcionario f = fun[i];
            if (f != null && f.getTipo().equals("Horista")) {
                mostra(f);
            }

        }
    }

    private static void MostraFuncionarioCBS (Funcionario[]fun){
        for (int i = 0;i<fun.length;i++){
            Funcionario f = fun[i];
            if (f != null && f.getTipo().equals("Comissionado com Base Salario")) {
                mostra(f);
            }

        }
    }

    private static void mostra(Funcionario f){
        System.out.println("\nNome do Funcionario: " + f.getNome());
        System.out.println("CPF do Funcionario: " + f.getCPF());
        System.out.println("Seu rendimento: R$" + f.getRendimentos());
        System.out.println("Tipo de Funcionario: " + f.getTipo());
    }
}