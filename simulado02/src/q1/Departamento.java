package q1;

import java.util.*;

public class Departamento extends UnidadeOrganizacional {
    private List<Setor> setores = new LinkedList<Setor>();

    public Departamento(String nome) {
        super(nome);
    }

    public List<Funcionario> getFuncionarios(){
        List<Funcionario> lista = new LinkedList<Funcionario>();

        for(Setor s : setores){
            lista.addAll(s.getFuncionarios());
        }

        return lista;
    }   

    public double getSomaSalario(){
        double soma = 0;

        for(Setor s : setores){
            soma += s.getSomaSalario();
        }

        return soma;
    }

    public void addSetor(Setor s){
        setores.add(s);
    }
}