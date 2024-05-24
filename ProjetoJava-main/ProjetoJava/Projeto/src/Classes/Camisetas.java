package Classes;

public class Camisetas extends Produtos implements IProduto{
    private String tamanho;
    private String tecido;
    private String estilo;

    public Camisetas(int codigo, String descricao, double preco, String tamanho, String tecido, String estilo) {
        super(codigo, descricao, preco);
        if(tamanho.isEmpty()){
            throw new ValorNuloException();
        } else this.tamanho = tamanho;
        if(tecido.isEmpty()){
            throw new ValorNuloException();
        }else this.tecido = tecido;
        if(estilo.isEmpty()){
            throw new ValorNuloException();
        }else this.estilo = estilo;
    }

    @Override
    public void Exibir() {
        System.out.println("Codigo: " +codigo+
                "\nDescrição: " +descricao+
                "\nPreço: " +preco+
                "\nTamanho: " +tamanho+
                "\nTecido: " +tecido+
                "\nEstilo: "+estilo);
    }
}
