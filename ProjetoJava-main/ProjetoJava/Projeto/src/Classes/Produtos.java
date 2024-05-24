package Classes;

public class Produtos implements IProduto {
    protected int codigo;
    protected String descricao;
    protected  double preco;

    public Produtos(int codigo, String descricao, double preco) {
        if(codigo<0){
            throw new ValorNegativoException();
        } else this.codigo = codigo;
        if(descricao.isEmpty()){
            throw new ValorNuloException();
        } else this.descricao = descricao;
        if(preco<0){
            throw new ValorNegativoException();
        }else this.preco = preco;
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
    public void Exibir(){
        System.out.println("Nome" +codigo
                );
    }
}
