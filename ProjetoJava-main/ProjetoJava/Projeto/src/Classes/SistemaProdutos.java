package Classes;

import java.util.ArrayList;

public class SistemaProdutos {
    protected static ArrayList<Produtos> produtos = new ArrayList<>();

    public SistemaProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public Produtos produtoMaisCaro() {
        if (produtos.isEmpty()) {
            return null;
        } else {

            Produtos maisCaro = produtos.get(0);
            for (Produtos produto : produtos) {
                if (produto.getPreco() > maisCaro.getPreco()) {
                    maisCaro = produto;
                }
            }
            return maisCaro;
        }
    }

    public Produtos produtoMaisBarato() {
        if (produtos.isEmpty()) return null;

        Produtos maisBarato = produtos.get(0);
        for (Produtos produto : produtos) {
            if (produto.getPreco() < maisBarato.getPreco()) {
                maisBarato = produto;
            }
        }
        return maisBarato;
    }
    public double mediaDePreco() {
        if (produtos.isEmpty()) return 0;

        double soma = 0;
        for (Produtos produto : produtos) {
            soma += produto.getPreco();
        }
        return soma / produtos.size();
    }

    public int quantidadeAcimaDaMedia() {
        double media = mediaDePreco();
        int quantidade = 0;
        for (Produtos produto : produtos) {
            if (produto.getPreco() > media) {
                quantidade++;
            }
        }
        return quantidade;
    }

}
