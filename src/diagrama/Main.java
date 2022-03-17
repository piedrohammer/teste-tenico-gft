package diagrama;

public class Main {
    public static void main(String[] args) {

        Leitor l1 = new Leitor();
        l1.nome = "João";
        l1.livroFavorito = "Branca de Neve";
        System.out.println("O Leitor: " + l1.nome);
        System.out.println("O seu livro Favorito é: " + l1.livroFavorito);

        Livro l2 = new Livro();
        l2.nome = "Bela e a Fera";
        l2.qtdPaginas = 100;
        l2.paginasLidas = 25;
        System.out.println("Você está lendo: " + l2.nome);
        System.out.println("Você leu: " + l2.paginasLidas + " paginas");
        System.out.println("O livro tem: " + l2.qtdPaginas + " paginas");
        l2.removerPaginasLidas(25);
        System.out.println("Remover paginas: " + l2.qtdPaginas);


    }
}
