import java.util.Comparator;

public class ComparaNotas implements Comparator<Pessoa>{

    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getNota() < p2.getNota()) return 1; 
        if (p1.getNota() > p2.getNota()) return -1;  
        return 0;
    }
}
