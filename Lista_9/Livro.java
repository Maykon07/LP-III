public class Livro {
    protected String titulo;
    protected String autor;
    protected int nroPaginas;
    protected int anoPublicacao;

    public Livro(String titulo, String autor, int nroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public String toString() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nNúmero de Páginas: " + nroPaginas +
                "\nAno de Publicação: " + anoPublicacao;
    }

    public boolean isOlder() {
        int currentYear = java.time.Year.now().getValue();
        return anoPublicacao < currentYear;
    }
}
