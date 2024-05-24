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
                        tec2.nextLine();
                        try {
                            Funcionario f = new Funcionario();
                            Funcionario f1 = new Funcionario(nome, idade, identidade, setor, salario);
                            f.adicionar(f1);
                            System.out.println("Funcionário cadastrado com Sucesso!");
                        }
                        catch (IdadeFuncionarioException | ValorNuloException | ValorNegativoException e)
                        {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("-------------------------------------------------------------------------------------------");
                        break;
                    case 2:
                        System.out.println("Ação: Remover funcionário");

                        System.out.println("Forneça a identidade do funcionário a ser removido!");
                        String ident = tec2.nextLine();
                        Funcionario f = new Funcionario();
                        f.remover(ident);
                        break;
                    case 3:
                        System.out.println("Ação: Exibir funcionários");
                        Funcionario f1 = new Funcionario();
                        f1.exibir();

                        break;
                    case 4:
                        System.out.println("Ação: Buscar Funcionários");
                        System.out.println("Digite o nome do funcionário para a ser exibido");
                        String nomes = tec2.nextLine();
                        Funcionario f2 = new Funcionario();
                        f2.BuscaFuncionario(nomes);

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
        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);

        boolean voltar = false;

        while (!voltar) {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("===== MENU CLIENTE =====");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Remover Cliente");
            System.out.println("3. Exibir Cliente");
            System.out.println("4. Buscar Cliente");
            System.out.println("5. Relatório de Clientes");
            System.out.println("6. Voltar ao menu principal");


            System.out.print("Escolha uma opção: ");
            int opcao = tec.nextInt();
            System.out.println("-------------------------------------------------------------------------------------------");
            switch (opcao) {
                case 1:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Ação: Cadastrar funcionário");

                    System.out.println("Digite o nome do Cliente a ser cadastrado:");
                    String nome = tec2.nextLine();


                    System.out.println("Digite a idade do Cliente a ser cadastrado");
                    int idade = tec2.nextInt();
                    tec2.nextLine();

                    System.out.println("Digite o numero de cpf:");
                    String cpf = tec2.nextLine();
                    tec2.nextLine();
                    System.out.println("Digite o código de identificação do Cliente");
                    double codigo = tec2.nextDouble();
                    tec2.nextLine();



                    System.out.println("Digite o telefone do Cliente");
                    String telefone = tec2.nextLine();
                    try {
                        Cliente c = new Cliente();
                        Cliente c1 = new Cliente(nome, idade, cpf, codigo, telefone);
                        c1.adicionar(c1);
                        System.out.println("Cliente cadastrado com Sucesso!");
                    }
                    catch (IdadeClienteInvalida | ValorNuloException | ValorNegativoException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Ação: Remover Cliente");

                    System.out.println("Forneça o nome do Cliente a ser removido!");
                    String nomes = tec2.nextLine();
                    Cliente c = new Cliente();
                    c.remover(nomes);
                    break;
                case 3:
                    System.out.println("Ação: Exibir funcionários");
                    Cliente c1 = new Cliente();
                    c1.exibir();

                    break;
                case 4:
                    System.out.println("Ação: Buscar Funcionários");
                    System.out.println("Digite o nome do Cliente para a ser exibido");
                    String nomes2 = tec2.nextLine();
                    Cliente c2 = new Cliente();
                    c2.BuscaCliente(nomes2);
                    break;

                case 5:

                    System.out.println("Cliente mais Velho: "+Cliente.idadevelho());
                    System.out.println("O Cliente mais Novo: "+Cliente.idademaisnovo());
                    System.out.println("A média de idade dos Clientes: "+Cliente.idademedia());
                    System.out.println("Quantidade de clientes com idade Superior a 60anos: "+Cliente.maioresde60());
                    System.out.println("Quantidade de clientes com idade inferior a 18anos: "+Cliente.menoresde18());
                    break;
                case 6:
                    voltar= true;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        System.out.println("Voltando ao menu principal...");
    }
    private static void menuProduto() {
        Scanner tec = new Scanner(System.in);
        Scanner tec2 = new Scanner(System.in);
        Scanner tec3 = new Scanner(System.in);
        boolean voltar = false;

        while (!voltar) {
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("===== MENU PRODUTOS =====");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Exibir Produto");
            System.out.println("4. Buscar Produto");
            System.out.println("5. Relatório de Produtos");
            System.out.println("6. Voltar ao menu principal");


            System.out.print("Escolha uma opção: ");
            int opcao = tec.nextInt();
            System.out.println("-------------------------------------------------------------------------------------------");
            switch (opcao) {
                case 1:
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.println("Ação: Cadastrar Produto");

                    System.out.println("Digite o codigo do produto a ser cadastrado:");
                    int codigo = tec2.nextInt();
                    tec2.nextLine();


                    System.out.println("Digite a descrição do Produto a ser cadastrado");
                    String desc = tec2.nextLine();

                    System.out.println("Digite o preço:");
                    double preco = tec2.nextDouble();
                    tec2.nextLine();

                    System.out.println("Digite o tecido do Produto");
                    String tecido = tec2.nextLine();

                    System.out.println("Digite a marca do Produto");
                    String marca = tec2.nextLine();
                    tec2.nextLine();

                    try {
                        Produtos p = new Produtos();
                        Produtos p1 = new Produtos(codigo, desc, preco, tecido, marca);
                        p1.adicionar(p1);
                        System.out.println("Produto cadastrado com Sucesso!");
                    }
                    catch ( ValorNuloException | ValorNegativoException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("-------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Ação: Remover Produto");

                    System.out.println("Forneça o codigo do Produto a ser removido!");
                    int codigo2 = tec2.nextInt();
                    Produtos p = new Produtos();
                    p.remover(codigo2);
                    break;
                case 3:
                    System.out.println("Ação: Exibir Produto");
                    Produtos p1 = new Produtos();
                    p1.exibir();

                    break;
                case 4:
                    System.out.println("Ação: Buscar Produtos");
                    System.out.println("Como você deseja procurar pelo produto?");
                    System.out.println("1. Codigo");
                    System.out.println("2. Descrição");
                    System.out.println("3. Preço");
                    System.out.println("Digite: ");
                    int option = tec3.nextInt();
                    Produtos p2 = new Produtos();
                    switch (option){
                        case 1:
                            System.out.println("Digite o código do produto a ser fornecido: ");
                            int cod = tec2.nextInt();
                            tec2.nextLine();
                            p2.BuscaProdutoscod(cod);
                            break;
                        case 2:
                            System.out.println("Digite a descrição do produto a ser fornecido: ");
                            tec2.nextLine();
                            String desc1 = tec.nextLine();
                            p2.BuscaProdutosdesc(desc1);
                            break;
                        case 3:
                            System.out.println("Digite o preço do produto a ser fornecido");
                            double precoxe = tec2.nextDouble();
                            p2.BuscaProdutospreco(precoxe);
                            break;
                    }

                    System.out.println("Busca realizada!");
                    break;

                case 5:
                    Produtos p3 = new Produtos();
                    System.out.println("Produto mais caro do sistema: "+p3.produtoMaisCaro());
                    System.out.println("O produto mais barato: "+p3.produtoMaisBarato());
                    System.out.println("A média dos produtos do sistema: "+p3.mediaDePreco());
                    System.out.println("Quantidade de produtos acima da média: "+p3.quantidadeAcimaDaMedia());
                    break;
                case 6:
                    voltar= true;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        System.out.println("Voltando ao menu principal...");
    }
    }
/*ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produtos: listprodutos){
            if(produtos.getPreco()== preco){
                result.add(produtos);
            }
        }
        if(result.isEmpty()){
            System.out.println("Não existem Produtos com esse preço");
        }else{
            for(Produtos produtos : result){
                produtos.Exibir();
            }
        }*/