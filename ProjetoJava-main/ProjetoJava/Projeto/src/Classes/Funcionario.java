package Classes;

import java.util.ArrayList;

public class Funcionario extends Pessoa implements IPessoa{
    private String numeroident;
    private String setor;
    private double salario;


    public Funcionario(){}
    private static ArrayList<Funcionario> listFuncionario = new ArrayList<>();
    public void adicionar(Funcionario f){
        listFuncionario.add(f);
    }
    public void remover(String f){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getNumeroident().equals(f)){
                listFuncionario.remove(funcionario);

            }
        }
    }
    public Funcionario(String nome, int idade, String numeroident, String setor, double salario) {
        super(nome, idade);
        if(idade<18||idade>70){
            throw new IdadeFuncionarioException();
        } else this.idade = idade;
        if(numeroident.isEmpty()){
            throw new ValorNuloException();
        } else this.numeroident = numeroident;
        if(setor.isEmpty()){
            throw new ValorNuloException();
        } else this.setor = setor;
        if(salario<0){
            throw new ValorNegativoException();
        } else this.salario = salario;
    }

    public String getNumeroident() {
        return numeroident;
    }

    public void setNumeroident(String numeroident) {
        this.numeroident = numeroident;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void Exibir() {
        System.out.println("Nome: " + nome +
                "Idade: " +idade+
                "Numero Identidade: " +numeroident+
                "Setor: " +setor+
                "Salário: " +salario
                );

    }
}
