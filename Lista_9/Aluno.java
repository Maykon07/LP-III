import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluno {
    protected String nome;
    protected String matricula;
    protected LocalDate dataAdmissao;
    protected int semestre;
    protected String tipoCurso;
    protected double mensalidade;

    public Aluno(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.semestre = semestre;
        this.tipoCurso = tipoCurso;
        this.mensalidade = calcularMensalidade();
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Semestre: " + semestre);
        System.out.println("Tipo de Curso: " + tipoCurso);
        System.out.println("Mensalidade: R$" + mensalidade);
    }

    protected double calcularMensalidade() {
        double valorBase = 700.00;
        double mensalidade = valorBase;

        switch (tipoCurso) {
            case "Engenharias":
                mensalidade *= 1.2;
                break;
            case "Computação":
                mensalidade *= 1.1;
                break;
            case "Letras":
                mensalidade *= 1.05;
                break;
        }

        long mesesDiferenca = ChronoUnit.MONTHS.between(dataAdmissao, LocalDate.now());

        if (mesesDiferenca > semestre)
            mensalidade *= 1.2;

        return mensalidade;
    }
}


