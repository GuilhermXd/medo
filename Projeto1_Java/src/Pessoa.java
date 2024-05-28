abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, int idade, String cpf, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract void exibir();
}
