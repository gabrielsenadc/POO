package q3;

import java.util.*;

public class Disciplina {
    private String id;
    private String nome;   
    private List<Disciplina> preReq = new LinkedList<Disciplina>();

    public Disciplina(String idDisciplina, String nomeDisciplina) {
        this.nome = nomeDisciplina;
        this.id = idDisciplina;
    }

    public void addPreReq(Disciplina d){
        preReq.add(d);
    }

    public List<Disciplina> getPreReq(){
        return new LinkedList<Disciplina>(preReq);
    }
     
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String print = nome + ", ";

        if(preReq.size() == 0) return print += "sem pré-requisitos";

        print += "pré-requisitos: ";
        int i = 0;

        for(Disciplina d : preReq){
            print += d.getNome();
            if(++i != preReq.size()) print += ", ";
        }

        return print;
    }

    

}
