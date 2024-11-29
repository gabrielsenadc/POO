public class Jogo extends Produto {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public Jogo(String nome, float preco, int idade) {
        super(nome, preco);
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Jogo " + this.getNome() + ", para maiores de " + this.idade + " anos, " + this.getPreco() + "$";
    }
    

}
