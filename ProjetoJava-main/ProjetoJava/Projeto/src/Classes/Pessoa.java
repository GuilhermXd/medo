package Classes;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        if(nome.isEmpty()){
            throw new ValorNuloException();
        } else this.nome = nome;
        if(idade <0){
            throw new ValorNegativoException();
        }else this.idade = idade;
    }
    public Pessoa(){}
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
