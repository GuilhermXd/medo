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

    public void exibir(){
        for(Funcionario f: listFuncionario){
            f.Exibir();
        }
       /* boolean encontrado = false;
        for (Funcionario f : listFuncionario) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: " + f.getNome());
                System.out.println("Idade: " + f.getIdade());
                System.out.println("Identidade: " + f.getNumeroident());
                System.out.println("Setor: " + f.getSetor());
                System.out.println("Salário: " + f.getSalario());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }*/
    }

    public void BuscaFuncionario(String nome){
        ArrayList<Funcionario> result = new ArrayList<>();
        for(Funcionario funcionario: listFuncionario){
            if(funcionario.getNome().startsWith(nome)){
                result.add(funcionario);
            }
        }
        if(result.isEmpty()){
            System.out.println("Não existem Funcionários com este nome");
        }else{
            for(Funcionario funcionario : result){
                funcionario.Exibir();
            }}
    }
    /*public ArrayList<Funcionario> BuscaFuncionario(String nome){
        ArrayList<Funcionario> result = new ArrayList<>();
        for(Funcionario funcionario: listFuncionario){
            if(funcionario.getNome().startsWith(nome)){
                result.add(funcionario);
            }
        }
        return result;
    }*/
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
        System.out.println("------------------------------------------------------"+
                "\nNome: " + nome +
                "\nIdade: " +idade+
                "\nNumero Identidade: " +numeroident+
                "\nSetor: " +setor+
                "\nSalário: " +salario+
                "\n------------------------------------------------------"
                );

    }
}
