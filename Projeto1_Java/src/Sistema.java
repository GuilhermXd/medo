import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarCliente() {
        System.out.println("Adicionar Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        if (idade < 0) {
            System.out.println("Idade não pode ser negativa");
            return;
        }

        Cliente cliente = new Cliente(nome, idade, cpf, endereco, telefone, email);
        clientes.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void removerCliente() {
        System.out.print("Informe o CPF do cliente a ser removido: ");
        String cpf = scanner.nextLine();

        clientes.removeIf(cliente -> cliente.cpf.equals(cpf));
        System.out.println("Cliente removido com sucesso!");
    }

    public void buscarClientePorNome() {
        System.out.print("Informe o nome ou parte do nome do cliente: ");
        String nome = scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.nome.toLowerCase().contains(nome.toLowerCase())) {
                cliente.exibir();
            }
        }
    }

    public void adicionarFuncionario() {
        try {
            System.out.println("Adicionar Funcionário");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if (idade < 18) {
                throw new IllegalArgumentException("Funcionário deve ser maior de 18 anos.");
            }
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, cpf, endereco, telefone, cargo, salario);
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Por favor, forneça uma idade válida para o funcionário.");
        }
    }


    public void removerFuncionario() {
        System.out.print("Informe o CPF do funcionário a ser removido: ");
        String cpf = scanner.nextLine();

        funcionarios.removeIf(funcionario -> funcionario.cpf.equals(cpf));
        System.out.println("Funcionário removido com sucesso!");
    }

    public void buscarFuncionarioPorNome() {
        System.out.print("Informe o nome ou parte do nome do funcionário: ");
        String nome = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.toLowerCase().contains(nome.toLowerCase())) {
                funcionario.exibir();
            }
        }
    }

    public void adicionarProduto() {
        System.out.println("Adicionar Produto");
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Tamanho: ");
        String tamanho = scanner.nextLine();
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        if (preco < 0) {
            System.out.println("Preço não pode ser negativo");
            return;
        }

        Produto produto = new Produto(descricao, preco, marca, tamanho, codigo);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto() {
        System.out.print("Informe o código do produto a ser removido: ");
        int codigo = scanner.nextInt();
        scanner.nextLine();

        produtos.removeIf(produto -> produto.getCodigo() == codigo);
        System.out.println("Produto removido com sucesso!");
    }

    public void buscarProdutoPorDescricao() {
        System.out.print("Informe a descrição ou parte da descrição do produto: ");
        String descricao = scanner.nextLine();

        for (Produto produto : produtos) {
            if (produto.getDescricao().toLowerCase().contains(descricao.toLowerCase())) {
                produto.exibir();
            }
        }
    }

    public void buscarProdutoPorMarca() {
        System.out.print("Informe a marca ou parte da marca do produto: ");
        String marca = scanner.nextLine();

        for (Produto produto : produtos) {
            if (produto.getMarca().toLowerCase().contains(marca.toLowerCase())) {
                produto.exibir();
            }
        }
    }

    public void buscarProdutoPorPreco() {
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        for (Produto produto : produtos) {
            if (produto.getPreco() == preco) {
                produto.exibir();
            }
        }
    }

    public Funcionario getFuncionarioMaisVelho() {
        return funcionarios.stream().max((f1, f2) -> Integer.compare(f1.idade, f2.idade)).orElse(null);
    }

    public Funcionario getFuncionarioMaisJovem() {
        return funcionarios.stream().min((f1, f2) -> Integer.compare(f1.idade, f2.idade)).orElse(null);
    }


    public double getIdadeMediaFuncionarios() {
        return funcionarios.stream().mapToInt(funcionario -> funcionario.idade).average().orElse(0);
    }

    public Cliente getClienteMaisVelho() {
        return clientes.stream().max((c1, c2) -> Integer.compare(c1.idade, c2.idade)).orElse(null);
    }

    public Cliente getClienteMaisJovem() {
        return clientes.stream().min((c1, c2) -> Integer.compare(c1.idade, c2.idade)).orElse(null);
    }

    public long getQuantidadeClientesMaioresDe60() {
        return clientes.stream().filter(cliente -> cliente.idade > 60).count();
    }

    public long getQuantidadeClientesMenoresDe18() {
        return clientes.stream().filter(cliente -> cliente.idade < 18).count();
    }

    public double getIdadeMediaClientes() {
        return clientes.stream().mapToInt(cliente -> cliente.idade).average().orElse(0);
    }

    public Produto getProdutoMaisCaro() {
        return produtos.stream().max((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).orElse(null);
    }

    public Produto getProdutoMaisBarato() {
        return produtos.stream().min((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco())).orElse(null);
    }

    public double getMediaPrecoProdutos() {
        return produtos.stream().mapToDouble(Produto::getPreco).average().orElse(0);
    }

    public long getQuantidadeProdutosAcimaDaMedia() {
        double mediaPreco = getMediaPrecoProdutos();
        return produtos.stream().filter(produto -> produto.getPreco() > mediaPreco).count();
    }

    public void exibirMenu() {
        int opcao;

        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Funcionário");
            System.out.println("2. Cliente");
            System.out.println("3. Produto");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------------------------------------------");

            switch (opcao) {
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
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    public void menuFuncionario() {
        int opcao;

        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("===== MENU FUNCIONÁRIO =====");
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Buscar Funcionário por Nome");
            System.out.println("4. Relatórios de Funcionários");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------------------------------------------");

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    buscarFuncionarioPorNome();
                    break;
                case 4:
                    exibirRelatoriosFuncionarios();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public void menuCliente() {
        int opcao;

        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("===== MENU CLIENTE =====");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Remover Cliente");
            System.out.println("3. Buscar Cliente por Nome");
            System.out.println("4. Relatórios de Clientes");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------------------------------------------");

            switch (opcao) {
                case 1:
                    adicionarCliente();
                    break;
                case 2:
                    removerCliente();
                    break;
                case 3:
                    buscarClientePorNome();
                    break;
                case 4:
                    exibirRelatoriosClientes();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public void menuProduto() {
        int opcao;

        do {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("===== MENU PRODUTO =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Buscar Produto por Descrição");
            System.out.println("4. Buscar Produto por Marca");
            System.out.println("5. Buscar Produto por Preço");
            System.out.println("6. Relatórios de Produtos");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("---------------------------------------------------------------------");

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    buscarProdutoPorDescricao();
                    break;
                case 4:
                    buscarProdutoPorMarca();
                    break;
                case 5:
                    buscarProdutoPorPreco();
                    break;
                case 6:
                    exibirRelatoriosProdutos();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }


    public void exibirRelatoriosClientes() {
        System.out.println("Relatórios de Clientes:");
        System.out.println("Cliente mais velho:");
        Cliente maisVelho = getClienteMaisVelho();
        if (maisVelho != null) maisVelho.exibir();

        System.out.println("Cliente mais jovem:");
        Cliente maisJovem = getClienteMaisJovem();
        if (maisJovem != null) maisJovem.exibir();

        System.out.println("Quantidade de clientes maiores de 60 anos: " + getQuantidadeClientesMaioresDe60());
        System.out.println("Quantidade de clientes menores de 18 anos: " + getQuantidadeClientesMenoresDe18());
        System.out.println("Idade média dos clientes: " + getIdadeMediaClientes());
    }

    public void exibirRelatoriosFuncionarios() {
        System.out.println("Relatórios de Funcionários:");
        System.out.println("Número total de funcionários: " + funcionarios.size());
        System.out.println("Funcionário mais velho:");
        Funcionario maisVelho = getFuncionarioMaisVelho();
        if (maisVelho != null) maisVelho.exibir();

        System.out.println("Funcionário mais jovem:");
        Funcionario maisJovem = getFuncionarioMaisJovem();
        if (maisJovem != null) maisJovem.exibir();
        System.out.println("Idade média dos funcionários: " + getIdadeMediaFuncionarios());
    }


    public void exibirRelatoriosProdutos() {
        System.out.println("Relatórios de Produtos:");
        System.out.println("Produto mais caro:");
        Produto maisCaro = getProdutoMaisCaro();
        if (maisCaro != null) maisCaro.exibir();

        System.out.println("Produto mais barato:");
        Produto maisBarato = getProdutoMaisBarato();
        if (maisBarato != null) maisBarato.exibir();

        System.out.println("Média de preço dos produtos: " + getMediaPrecoProdutos());
        System.out.println("Quantidade de produtos com preço acima da média: " + getQuantidadeProdutosAcimaDaMedia());
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.exibirMenu();
    }
}
