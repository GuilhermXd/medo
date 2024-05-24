package Classes;

import java.util.ArrayList;

public class BuscaFuncionario {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> BuscaFuncionario(String nome){
        ArrayList<Funcionario> result = new ArrayList<>();
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getNome().startsWith(nome)){
                result.add(funcionario);
            }
        }
        return result;
    }
}
