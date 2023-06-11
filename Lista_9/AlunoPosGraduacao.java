import java.time.LocalDate;

public class AlunoPosGraduacao extends Aluno {
    private String nomeOrientador;
    private String tituloProjeto;
    private String nivel;

    public AlunoPosGraduacao(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso,
                             String nomeOrientador, String tituloProjeto, String nivel) {
        super(nome, matricula, dataAdmissao, semestre, tipoCurso);
        this.nomeOrientador = nomeOrientador;
        this.tituloProjeto = tituloProjeto;
        this.nivel = nivel;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Nome do Orientador: " + nomeOrientador);
        System.out.println("Título do Projeto: " + tituloProjeto);
        System.out.println("Nível: " + nivel);
    }

    @Override
    protected double calcularMensalidade() {
        double mensalidade = super.calcularMensalidade();

        if ((nivel.equals("M") && semestre * 6 < 24) || (nivel.equals("D") && semestre * 6 < 48))
            mensalidade *= 0.8;

        return mensalidade;
    }
}
