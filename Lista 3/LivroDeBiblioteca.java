package Lista_3.biblioteca;

public class LivroDeBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private String codigo;
    private boolean emprestado;
    private String nomeDoLeitor;
    private String dataDeEmprestimo;
    
    public LivroDeBiblioteca(String titulo, String autor, int anoPublicacao, String editora, String codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.codigo = codigo;
        this.emprestado = false;
        this.nomeDoLeitor = null;
        this.dataDeEmprestimo = null;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getEditora() {
        return editora;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }
    
    public String getNomeDoLeitor() {
        return nomeDoLeitor;
    }
    
    public String getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }
    
    public void emprestar(String nomeDoLeitor, String dataDeEmprestimo) {
        if (this.emprestado) {
            System.out.println("O livro já está emprestado.");
        } else {
            this.emprestado = true;
            this.nomeDoLeitor = nomeDoLeitor;
            this.dataDeEmprestimo = dataDeEmprestimo;
            System.out.println("Livro emprestado com sucesso para " + nomeDoLeitor + " em " + dataDeEmprestimo + ".");
        }
    }
    
    public void devolver() {
        if (this.emprestado) {
            this.emprestado = false;
            this.nomeDoLeitor = null;
            this.dataDeEmprestimo = null;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro não está emprestado.");
        }
    }
}
