package Classes;

import java.util.ArrayList;

public class Produtos implements IProduto {
    protected int codigo;
    protected String descricao;
    protected  double preco;

    protected String tecido;

    protected String marca;

    public Produtos(){}
    public Produtos(int codigo, String descricao, double preco, String tecido, String marca) {
        if(codigo<0){
            throw new ValorNegativoException();
        } else this.codigo = codigo;
        if(descricao.isEmpty()){
            throw new ValorNuloException();
        } else this.descricao = descricao;
        if(preco<0){
            throw new ValorNegativoException();
        }else this.preco = preco;
        if(tecido.isEmpty()){
            throw new ValorNuloException();
        } else this.tecido = tecido;
        if(marca.isEmpty()){
            throw new ValorNuloException();
        } else this.marca = marca;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void Exibir() {
        System.out.println("--------------------------------------------------------"+
                "\nCódigo: " + codigo+
                "\nDescrição: " + descricao+
                "\nPreço: " + preco+
                "\nTecido: " + tecido+
                "\nMarca: " + marca +
                "--------------------------------------------------------");
    }
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
    public void Adcod(Produtos produto){
        listprodutos.add(produto);
    }
    public void Addesc(Produtos produto){
        listprodutos.add(produto);
    }
    public void Adpreco(Produtos produto){
        listprodutos.add(produto);
    }

    public void BuscaProdutospreco(double preco){
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produtos: listprodutos){
            if(produtos.getPreco()== preco){
                result.add(produtos);
            }
        }
        if(result.isEmpty()){
            System.out.println("Não existem Produtos com esse preço");
        }else{
            for(Produtos produtos : result){
                produtos.Exibir();
            }
        }
    }
    public void BuscaProdutosdesc(String descricao){
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produtos: listprodutos){
            if(produtos.getDescricao().startsWith(descricao)){
                result.add(produtos);
            }
        }
        if(result.isEmpty()){
            System.out.println("Não existem produtos com essa descrição");
        }else{
            for(Produtos produtos : result){
                produtos.Exibir();
            }
        }

       /* ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produto: listprodutos){
            if(produto.getDescricao().startsWith(descricao)){
                result.add(produto);
            }
        }
        return result;*/
    }
    public void BuscaProdutoscod(int codigo){
        /*ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produto: listprodutos){
            if(produto.getCodigo()==codigo){
                result.add(produto);
            }
        }
        return result;*/
        ArrayList<Produtos> result = new ArrayList<>();
        for(Produtos produtos: listprodutos){
            if(produtos.getCodigo()== codigo){
                result.add(produtos);
            }
        }
        if(result.isEmpty()){
            System.out.println("Não existem Produtos com esse código");
        }else{
            for(Produtos produtos: result){
                produtos.Exibir();
            }
        }
    }

    public void remover(int p){
        ArrayList<Produtos> produtos = new ArrayList<>();
        for(Produtos prod: produtos){
            if(prod.getCodigo() == p){
                listprodutos.remove(produtos);

            }
        }}

    public void exibir(){
        for(Produtos p: listprodutos){
            p.Exibir();
        }}

}
