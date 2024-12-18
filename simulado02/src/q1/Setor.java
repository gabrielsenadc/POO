package q1;

import java.util.*;

public class Setor extends UnidadeOrganizacional {
    private List<Funcionario> funcionarios = new LinkedList<Funcionario>();

    public Setor(String nome) {
        super(nome);
    }

    public List<Funcionario> getFuncionarios(){
        return new LinkedList<Funcionario>(funcionarios);
    }

    public void addFuncionario(Funcionario f){
        if(!funcionarios.contains(f)){
            if(f.getSetor() != null) f.getSetor().removeFuncionario(f);
            funcionarios.add(f);
            f.setSetor(this);
        }
    }

    public double getSomaSalario(){
        double soma = 0;

        for(Funcionario f : funcionarios){
            soma += f.getSalario();
        }

        return soma;
    }

    public void removeFuncionario(Funcionario f){
        funcionarios.remove(f);
    }
}