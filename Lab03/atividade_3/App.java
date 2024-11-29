public class App {
    public static void main(String[] args) {
        Produto[] lista = new Produto[5];
        lista[0] = new Livro("Percy Jackson", 29.99f, "Rick Riordan");
        lista[1] = new Livro("É assim que acaba", 34.99f, "Colleen Hoover");
        lista[2] = new Livro("Jogos Vorazes", 32.99f, "Suzanne Collins");
        lista[3] = new Jogo("Quebra cabeça", 59.99f, 5);
        lista[4] = new Jogo("Detetive", 40.99f, 8);

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
    
}
