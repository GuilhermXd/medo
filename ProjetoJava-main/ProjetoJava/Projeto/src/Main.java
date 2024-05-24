import Classes.*;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner tec1 = new Scanner(System.in);
        boolean sair = false;
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("                                        WORDCAP");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------------------------");

        while (!sair){
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Funcionário");
            System.out.println("2. Cliente");
            System.out.println("3. Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int option;
            option = tec1.nextInt();


            switch (option){
                case 1:
                    menuFuncionario();
                break;

                case 2:
                    menuCliente();
                break;

                case 3:
                    menuProduto();
                break;

                case 4:
                    sair = true;
                break;

                default:
                    System.out.println("Opção Inválida!");
                break;

            }
            System.out.println("Saindo do programa...");
        }
    }

    private static void menuFuncionario() {
        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);

        boolean voltar = false;

            while (!voltar) {
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("===== MENU FUNCIONÁRIO =====");
                System.out.println("1. Cadastrar funcionário");
                System.out.println("2. Remover funcionário");
                System.out.println("3. Exibir funcionários");
                System.out.println("4. Buscar Funcionários");
                System.out.println("5. Voltar ao menu principal");


                System.out.print("Escolha uma opção: ");
                int opcao = tec.nextInt();
                System.out.println("-------------------------------------------------------------------------------------------");
                switch (opcao) {
                    case 1:
                        System.out.println("-------------------------------------------------------------------------------------------");
                        System.out.println("Ação: Cadastrar funcionário");

                        System.out.println("Digite o nome do Funcionário a ser cadastrado:");
                        String nome = tec2.nextLine();

                        System.out.println("Digite a idade do Funcionário a ser cadastrado");
                        int idade = tec2.nextInt();

                        tec2.nextLine();

                        System.out.println("Digite o numero de identidade:");
                        String identidade = tec2.nextLine();

                        System.out.println("Digite o setor onde o Funcionário atua");
                        String setor = tec2.nextLine();

                        System.out.println("Digite o salário do funcionário");
                        double salario = tec2.nextDouble();

                        try {
                            Funcionario f1 = new Funcionario(nome, idade, identidade, setor, salario);
                            f1.adicionar(f1);
                        }
                        catch (IdadeFuncionarioException e)
                        {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("-------------------------------------------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("Ação: Remover funcionário");

                        tec2.nextLine();
                        System.out.println("Forneça a identidade do funcionário a ser removido!");
                        String ident = tec2.nextLine();
                        Funcionario f = new Funcionario();
                        f.remover(ident);
                        break;
                    case 3:
                        System.out.println("Ação: Exibir funcionários");
                        break;
                    case 4:
                        System.out.println("Ação: Buscar Funcionários");
                    case 5:
                        voltar= true;
                        break;

                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
        }
        System.out.println("Voltando ao menu principal...");}

    private static void menuCliente() {
    }
    private static void menuProduto() {
    }
}