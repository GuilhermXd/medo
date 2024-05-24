package Classes;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IPessoa {
    private String cpf;
    private double codigoidentifica;
    private String telefone;

    private static ArrayList<Cliente> listCliente = new ArrayList<>();

    @Override
    public void Exibir() {
        System.out.println("Nome: " + nome+
                "\nIdade: " + idade+
                "\nCpf: " + cpf+
                "\nCódigo: " + codigoidentifica+
                "\nNão sei oq colocar: " + telefone);
    }

    public void adicionar(Cliente c){
        listCliente.add(c);
    }
    public void remover(Cliente c){
        listCliente.remove(c);
    }

    public static String idadevelho(){
        Cliente idademaisvelho = null;
        int i = 0;

        for(Cliente c: listCliente){
            if(c.getIdade()>i){
                i = c.getIdade();
                idademaisvelho = c;
            }
        }
        return idademaisvelho.getNome();

    }
    public static int maioresde60(){
        int i = 0;
        for(Cliente c: listCliente){
            if(c.getIdade()>60)
                i++;
        }
        return i;
    }
    public static double idademedia(){
        int i = 0;
        for(Cliente c: listCliente)
            i += c.getIdade();

        return (double) i/listCliente.size();
    }
    public static int menoresde18(){
        int i = 0;
        for(Cliente c: listCliente){
            if(c.getIdade()<18)
                i++;
        }
        return i;
    }
    public static String idademaisnovo(){
        Cliente idademaisvelho = null;
        int i = 100;

        for(Cliente c: listCliente){
            if(c.getIdade()<i){
                i = c.getIdade();
                idademaisvelho = c;
            }
        }
        return idademaisvelho.getNome();

    }
    public Cliente(String nome, int idade, String cpf, double codigoidentifica, String telefone) {
        super(nome, idade);
        if(cpf.isEmpty()){
            throw new ValorNuloException();
        }else this.cpf = cpf;

        if(codigoidentifica < 0){
            throw new ValorNegativoException();
        } else this.codigoidentifica = codigoidentifica;

        if(telefone.isEmpty()){
            throw new ValorNuloException();
        } else this.telefone = telefone;




   }
}
