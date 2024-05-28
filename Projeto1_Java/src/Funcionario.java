class Funcionario extends Pessoa implements IPessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cpf, String endereco, String telefone, String cargo, double salario) {
        super(nome, idade, cpf, endereco, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
}
