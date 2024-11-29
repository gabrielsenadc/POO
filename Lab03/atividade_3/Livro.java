public class Livro extends Produto {
    private String autor;

    public String getAutor() {
        return autor;
    }

    public Livro(String nome, float preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro " + this.getNome() + ", autor: " + this.autor + ", " + this.getPreco() + "$";
    }

}
