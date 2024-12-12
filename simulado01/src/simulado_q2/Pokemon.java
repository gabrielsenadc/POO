package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon> {
    private int vidaMaxima;
    private int vidaAtual;
    private int dano1;
    private int dano2;



    public Pokemon(int vidaMaxima, int dano1, int dano2) {
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.dano1 = dano1;
        this.dano2 = dano2;
    }

    public boolean atacar(Pokemon personagemAtacado){
        Random r = new Random();
   		if(r.nextBoolean()) personagemAtacado.perdeVida(this.dano1);
        else  personagemAtacado.perdeVida(this.dano2);

        if(personagemAtacado.getPontosVitalidade() <= 0) return true;
        return false;
    }

	public void regenera(){
        this.vidaAtual = this.vidaMaxima;
    }

    public void perdeVida(int dano){
        this.vidaAtual -= dano;
    }

	public int getPontosVitalidade(){
        return this.vidaAtual;
    }
}   
