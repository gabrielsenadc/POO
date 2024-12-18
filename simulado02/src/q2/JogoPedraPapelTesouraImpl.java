package q2;

import java.util.Random;

public class JogoPedraPapelTesouraImpl implements JogoPedraPapelTesoura{
    private Jogada j1;
    private Jogada j2;

    private Jogada defineJogada(int n){
        if(n == 0) return Jogada.PEDRA;
        else if(n == 1) return Jogada.PAPEL;
        else return Jogada.TESOURA;
    }

    public JogoPedraPapelTesouraImpl(){
        Random r = new Random();

        int n = r.nextInt(3);
        j1 = defineJogada(n);

		n = r.nextInt(3);
        j2 = defineJogada(n);
    }

    /**
	 * Indica se houve vencedor.
	 * 
	 * @return retorna true se há vencedor e false se houve empate
	 */
	public boolean haVencedor(){
		if(j1 == j2) return false;
		return true;
	}

	/**
	 * Retorna a jogada do primeiro jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador1(){
		return j1;
	}

	/**
	 * Retorna a jogada do segundo jogador.
	 * 
	 * @return jogada escolhida aleatoriamente na construção do objeto
	 */
	public Jogada jogadaJogador2(){
		return j2;
	}

	/**
	 * 
	 * @return 1 ou 2 dependendo do jogador vitorioso.
	 */
	public int getJogadorVencedor(){
		if(j1 == Jogada.PAPEL && j2 == Jogada.PEDRA) return 1;
		if(j1 == Jogada.PEDRA && j2 == Jogada.TESOURA) return 1;
		if(j1 == Jogada.TESOURA && j2 == Jogada.PAPEL) return 1;

		return 2;
	}
}
