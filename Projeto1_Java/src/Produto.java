class Produto {
    private String descricao;
    private double preco;
    private String marca;
    private String tamanho;
    private int codigo;

    public Produto(String descricao, double preco, String marca, String tamanho, int codigo) {
        if (preco < 0) throw new IllegalArgumentException("O preço não pode ser negativo");
        this.descricao = descricao;
        this.preco = preco;
        this.marca = marca;
        this.tamanho = tamanho;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibir() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Código: " + codigo);
    }
}
