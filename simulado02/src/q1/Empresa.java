package q1;

import java.util.*;

public class Empresa {
    private String nome;
    
    public String getNome() {
        return nome;
    }

    private List<Departamento> departamentos = new LinkedList<Departamento>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addDepartamento(Departamento d){
        departamentos.add(d);
    }
}