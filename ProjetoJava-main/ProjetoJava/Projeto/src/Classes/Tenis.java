package Classes;

public class Tenis extends Produtos implements IProduto{
    private int numeracao;
    private String marca;

    public Tenis(int codigo, String descricao, double preco, int numeracao,String marca) {
        super(codigo, descricao, preco);
        if(numeracao<35||numeracao>47){
            throw new NumeracaoInvalidaException();
        } else this.numeracao = numeracao;
        if(marca.isEmpty()){
            throw new ValorNuloException();
        }else this.marca = marca;
    }

    @Override
    public void Exibir() {
        System.out.println("Codigo:" + codigo+
                "\nDescrição: " +descricao+
                "\nPreço: " +preco+
                "\nNumeração:" +numeracao+
                "\nMarca" +marca
                );
    }
}
