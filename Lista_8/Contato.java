package Lista_8;
import java.time.LocalDate;
import java.time.Period;

public class Contato {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private static int Tcontatos = 0;

    public Contato(String nome, String email, String telefone, LocalDate dataNascimento) throws IllegalArgumentException {
        // Validação do nome
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;

        // Validação do email
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;

        // Validação do telefone
        if (telefone == null || telefone.trim().isEmpty() || telefone.length() < 8) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = telefone;

        // Validação da data de nascimento
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dataNascimento = dataNascimento;
        Tcontatos++;
    }

    public Contato() {
        this("", "", "", LocalDate.now());
        Tcontatos++;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

   /*  public void setTelefone(int i) {
        if (i == null || i.trim().isEmpty() || i.length() < 8) {
            throw new IllegalArgumentException("Telefone inválido");
        }
        this.telefone = i;
    }
*/
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de nascimento inválida");
        }
        this.dataNascimento = dataNascimento;
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }
    public static void mostrarTotalContatos(){
        System.out.println("Total de contatos: " +Tcontatos);
    }
}
