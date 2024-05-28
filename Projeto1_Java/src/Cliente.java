import java.util.ArrayList;

class Cliente extends Pessoa implements IPessoa {
    private String email;

    public Cliente(String nome, int idade, String cpf, String endereco, String telefone, String email) {
        super(nome, idade, cpf, endereco, telefone);
        this.email = email;
    }

    @Override
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}
