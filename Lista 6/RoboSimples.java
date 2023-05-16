package Lista_6;

public class RoboSimples {
    private String nomeDoRobo;
    private int posicaoXAtual;
    private int posicaoYAtual;
    private String direcaoAtual;

    public RoboSimples(String nome, int px, int py, String d) {
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        validaDirecao(d);
        direcaoAtual = d;
    }

    public RoboSimples(String nome) {
        this(nome, 0, 0, "N");
    }

    public RoboSimples() {
        this("Wally");
    }

    private void validaDirecao(String direcao) {
        if (!direcao.equals("N") && !direcao.equals("S") && !direcao.equals("E") && !direcao.equals("O")
                && !direcao.equals("NE") && !direcao.equals("NO") && !direcao.equals("SE") && !direcao.equals("SO")) {
            throw new IllegalArgumentException("Direção inválida. A direção deve ser N, S, E, O, NE, NO, SE ou SO.");
        }
    }

    public void move() {
        move(1);
    }

    public void move(int passos) {
        if (direcaoAtual.equals("N")) posicaoYAtual += passos;
        if (direcaoAtual.equals("S")) posicaoYAtual -= passos;
        if (direcaoAtual.equals("E")) posicaoXAtual += passos;
        if (direcaoAtual.equals("O")) posicaoXAtual -= passos;
        if (direcaoAtual.equals("NE")) {
            posicaoXAtual += passos;
            posicaoYAtual += passos;
        }
        if (direcaoAtual.equals("NO")) {
            posicaoXAtual -= passos;
            posicaoYAtual += passos;
        }
        if (direcaoAtual.equals("SE")) {
            posicaoXAtual += passos;
            posicaoYAtual -= passos;
        }
        if (direcaoAtual.equals("SO")) {
            posicaoXAtual -= passos;
            posicaoYAtual -= passos;
        }
    }

    public void mudaDirecao(String novaDirecao) {
        validaDirecao(novaDirecao);
        direcaoAtual = novaDirecao;
    }

    public String toString() {
        String str = "\nNome do robô: " + nomeDoRobo + "\n";
        str += "Posição do robô: (" + posicaoXAtual + ", " + posicaoYAtual + ")\n";
        str += "Direção do robô: " + direcaoAtual;

        return str;
    }
}
