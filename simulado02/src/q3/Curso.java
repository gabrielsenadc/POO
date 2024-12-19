package q3;

import java.util.*;

public class Curso {
    private String nome;
    private Map<String, Disciplina> disciplinas = new HashMap<String, Disciplina>();
    private List<String> ordem = new LinkedList<String>();

    public Curso(String nomeCurso) {
        this.nome = nomeCurso;
    }

    public Disciplina criaDisciplina(String idDisciplina, String nomeDisciplina) {
        Disciplina d = new Disciplina(idDisciplina, nomeDisciplina);
        disciplinas.put(idDisciplina, d);
        ordem.add(idDisciplina);
        return d;
    }

    public void estabelecePreReq(Disciplina disciplina, String idPre) {
        disciplina.addPreReq(disciplinas.get(idPre));
    }

    @Override
    public String toString() {
        String print = "Curso: " + nome + "\nDisciplinas:\n";

        for(String id : ordem){
            print += disciplinas.get(id) + "\n";
        }

        return print;
    }

}
