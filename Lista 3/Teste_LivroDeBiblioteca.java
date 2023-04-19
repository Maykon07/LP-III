package Lista_3.biblioteca;

public class Teste_LivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Allen & Unwin", "123456");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Código: " + livro.getCodigo());
        System.out.println("Emprestado: " + livro.isEmprestado());

        livro.emprestar("Maykon", "01/04/2023");

        System.out.println("Emprestado: " + livro.isEmprestado());
        System.out.println("Nome do leitor: " + livro.getNomeDoLeitor());
        System.out.println("Data de empréstimo: " + livro.getDataDeEmprestimo());

        livro.devolver();

        System.out.println("Emprestado: " + livro.isEmprestado());
    }
}
