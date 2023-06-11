
public class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    public LivroLivraria(String titulo, String autor, int nroPaginas, int anoPublicacao, double preco, int estoque) {
        super(titulo, autor, nroPaginas, anoPublicacao);
        this.preco = preco;
        this.estoque = estoque;
    }

    public String toString() {
        return super.toString() +
                "\nPreço: R$" + preco +
                "\nEstoque: " + estoque + " unidades";
    }

    public boolean isAvailable() {
        return estoque > 0;
    }

    public void sell() {
        if (estoque > 0) {
            estoque--;
            System.out.println("Livro vendido com sucesso!");
        } else {
            System.out.println("Livro indisponível no estoque.");
        }
    } 
}
