package Lista_3.livro;

public class ExemploLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Allen & Unwin");
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937, "George Allen & Unwin");
        
        System.out.println("Livro 1: " + livro1.getTitulo() + ", " + livro1.getAutor() + ", " + livro1.getAnoPublicacao() + ", " + livro1.getEditora());
        System.out.println("Livro 2: " + livro2.getTitulo() + ", " + livro2.getAutor() + ", " + livro2.getAnoPublicacao() + ", " + livro2.getEditora());
        
        livro1.setEditora("HarperCollins");
        
        System.out.println("Livro 1 (atualizado): " + livro1.getTitulo() + ", " + livro1.getAutor() + ", " + livro1.getAnoPublicacao() + ", " + livro1.getEditora());
    }
}
