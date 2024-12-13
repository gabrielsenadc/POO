package simulado_q3;

import java.util.LinkedList;

public class Banco {
    private String nome;
    private LinkedList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new LinkedList<Agencia>();
    }

    public Agencia criaAgencia(String nome){
        Agencia agencia = new Agencia(nome);
        this.agencias.add(agencia);
        return agencia;
    }

    @Override
    public String toString() {
        String tostr = "Nome do Banco: " + this.nome;
        for(Agencia agencia : this.agencias){
            tostr += "\n" + agencia;
        }
        return tostr;
    }

    
}
