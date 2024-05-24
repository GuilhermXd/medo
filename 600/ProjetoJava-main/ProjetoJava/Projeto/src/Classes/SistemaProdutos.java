package Classes;

import java.util.ArrayList;

public class SistemaProdutos {
    protected static ArrayList<Produtos> listprodutos = new ArrayList<>();

    //public SistemaProdutos() {
      //  listprodutos = new ArrayList<>();
    //}

    public void adicionar(Produtos produto) {
        listprodutos.add(produto);
    }

    public Produtos produtoMaisCaro() {
        if (listprodutos.isEmpty()) {
            return null;
        } else {

            Produtos maisCaro = listprodutos.get(0);
            for (Produtos produto : listprodutos) {
                if (produto.getPreco() > maisCaro.getPreco()) {
                    maisCaro = produto;
                }
            }
            return maisCaro;
        }
    }

    public Produtos produtoMaisBarato() {
        if (listprodutos.isEmpty()) return null;

        Produtos maisBarato = listprodutos.get(0);
        for (Produtos produto : listprodutos) {
            if (produto.getPreco() < maisBarato.getPreco()) {
                maisBarato = produto;
            }
        }
        return maisBarato;
    }
    public double mediaDePreco() {
        if (listprodutos.isEmpty()) return 0;

        double soma = 0;
        for (Produtos produto : listprodutos) {
            soma += produto.getPreco();
        }
        return soma / listprodutos.size();
    }

    public int quantidadeAcimaDaMedia() {
        double media = mediaDePreco();
        int quantidade = 0;
        for (Produtos produto : listprodutos) {
            if (produto.getPreco() > media) {
                quantidade++;
            }
        }
        return quantidade;
    }

}
