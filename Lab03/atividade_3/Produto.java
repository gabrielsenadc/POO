public class Produto {
    private String nome;
    private float preco;

    public String getNome() {
        return nome;
    }
    
    public float getPreco() {
        return preco;
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
}
