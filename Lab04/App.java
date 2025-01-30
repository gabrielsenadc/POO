import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("notas.csv");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");

        BufferedReader br = new BufferedReader(isr);

        List<Pessoa> list = new LinkedList<Pessoa>();

        String linha = br.readLine();
        while(linha != null){
            Scanner sc = new Scanner(linha);
            sc.useDelimiter(";");
            String cpf = sc.next();
            String name = sc.next();
            String nota_string =  sc.next();

            double nota = Double.parseDouble(nota_string);

            Pessoa p = new Pessoa(cpf, name, nota);
            list.add(p);
            sc.close();

            linha = br.readLine();
        }

        Comparator<Pessoa> comp = new ComparaNotas();

        Collections.sort(list, comp);

        for(Pessoa p : list) System.out.println(p);
        
        br.close();
    }
}
