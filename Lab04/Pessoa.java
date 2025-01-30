
public class Pessoa {
    private String cpf;
    private String nome;
    private double nota;

    public String getCpf() {
        return cpf;
    }

    public double getNota() {
        return nota;
    }

    public Pessoa(String cpf, String nome, double nota) {
        this.cpf = cpf;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nome + ": " + nota;
    }

    
}
