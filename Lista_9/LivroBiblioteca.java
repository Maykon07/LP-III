
public class LivroBiblioteca extends Livro{
    private boolean emprestado;
    private String dataDevolucao;

    public LivroBiblioteca(String titulo, String autor, int nroPaginas, int anoPublicacao, boolean emprestado, String dataDevolucao) {
        super(titulo, autor, nroPaginas, anoPublicacao);
        this.emprestado = emprestado;
        this.dataDevolucao = dataDevolucao;
    }

    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return super.toString() +
                "\nStatus: " + status +
                "\nData de Devolução: " + dataDevolucao;
    }

    public boolean isAvailable() {
        return !emprestado;
    }

    public void borrow() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro indisponível no momento.");
        }
    }
}
