package Classes;

import java.util.ArrayList;

public class BuscaProduto {
    ArrayList<Produtos> listaPd = new ArrayList<>();

    public void Adcod(Produtos produto){
        listaPd.add(produto);
    }
    public void Addesc(Produtos produto){
        listaPd.add(produto);
    }
    public void Adpreco(Produtos produto){
        listaPd.add(produto);
    }

    public ArrayList<Produtos> BuscaProdutospreco(double preco){
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produto: listaPd){
            if(produto.getPreco()==preco){
                result.add(produto);
            }
        }
        return result;
    }
    public ArrayList<Produtos> BuscaProdutosdesc(String descricao){
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produto: listaPd){
            if(produto.getDescricao().startsWith(descricao)){
                result.add(produto);
            }
        }
        return result;
    }
    public ArrayList<Produtos> BuscaProdutoscod(int codigo){
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produto: listaPd){
            if(produto.getCodigo()==codigo){
                result.add(produto);
            }
        }
        return result;
    }

}
