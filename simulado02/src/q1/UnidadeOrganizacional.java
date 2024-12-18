package q1;

import java.util.List;

public abstract class UnidadeOrganizacional {
    private String nome;

    public String getNome() {
        return nome;
    }

    public UnidadeOrganizacional(String nome) {
        this.nome = nome;
    }

    public double getSalarioMedio(){
        if(this.getFuncionarios().size() == 0) return 0.0;
        return this.getSomaSalario() / this.getFuncionarios().size();
    }

    public abstract List<Funcionario> getFuncionarios();
    public abstract double getSomaSalario();
}