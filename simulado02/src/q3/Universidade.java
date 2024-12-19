package q3;

import java.util.*;

public class Universidade {
    private String nome;
    private Set<Curso> cursos = new HashSet<Curso>();

    public Universidade(String nomeUniversidade) {
        this.nome = nomeUniversidade;
    }

    public Curso criaCurso(String nomeCurso) {
        Curso curso = new Curso(nomeCurso);
        cursos.add(curso);
        return curso;
    }

    @Override
    public String toString() {
        String print = "Universidade: " + nome + "\n";

        for(Curso curso : cursos){
            print += curso + "\n";
        }

        return print;
    }


}
