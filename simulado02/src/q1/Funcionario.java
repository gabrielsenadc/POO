package q1;

public class Funcionario {
    private double salario;
    private String nome;
    private Setor setor = null;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        if(setor != this.setor){
            setor.addFuncionario(this);
            this.setor = setor;
        }
    }

    public double getSalario() {
        return salario;
    }

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }


}