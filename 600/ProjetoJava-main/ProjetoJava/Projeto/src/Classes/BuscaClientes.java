package Classes;

import java.util.ArrayList;

public class BuscaClientes {
    ArrayList<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> BuscaCliente(String nome){
        ArrayList<Cliente> result = new ArrayList<>();
        for(Cliente cliente: clientes){
            if(cliente.getNome().startsWith(nome)){
                result.add(cliente);
            }
        }
        return result;
    }
}
