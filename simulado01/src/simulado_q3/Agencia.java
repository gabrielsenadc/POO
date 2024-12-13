package simulado_q3;

import java.util.LinkedList;

public class Agencia {
    private String nome;
    private LinkedList<Conta> contas;

    public Agencia(String nome) {
        this.nome = nome;
        this.contas = new LinkedList<Conta>();
    }

    public void adicionaConta(Conta conta){
        this.contas.add(conta);
    }

    public double getSaldoMedio(){
        double n = 0;
        for(Conta conta : this.contas){
            n += conta.getSaldo();
        }
        if(this.contas.size() == 0) return 0;
        return n / this.contas.size();
    }

    @Override
    public String toString() {
        return "Agência: " + nome + ", saldo médio: " + this.getSaldoMedio();
    }

    
}
