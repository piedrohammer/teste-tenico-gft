package diagrama;

public class Livro {
    String nome;
    int qtdPaginas;
    int paginasLidas;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    // Metodos
    void verificarProgresso(){

    }

    void adicionarPaginasLidas(){

    }
    void removerPaginasLidas(int remoçao){
        qtdPaginas -= qtdPaginas;

    }
}
