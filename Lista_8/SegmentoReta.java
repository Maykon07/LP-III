package Lista_8;

public class SegmentoReta {
    private Ponto2D p1;
    private Ponto2D p2;
    private double dimensao;

    public SegmentoReta(float x1, float y1, float x2, float y2) {
        this.p1 = new Ponto2D(x1, y1);
        this.p2 = new Ponto2D(x2, y2);
        this.dimensao = calculaDimensao();
    }

    public SegmentoReta(Ponto2D p1, Ponto2D p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.dimensao = calculaDimensao();
    }

    public String imprimeSegmentoReta() {
        return String.format("O segmento de reta inicia no ponto (%.2f , %.2f) e finaliza no ponto (%.2f , %.2f) com dimensão %.2f.",
                p1.getX(), p1.getY(), p2.getX(), p2.getY(), calculaDimensao());
    }

    private double calculaDimensao() {
        // Cálculo da dimensão do segmento de reta usando a fórmula da distância entre dois pontos
        double deltaX = p2.getX() - p1.getX();
        double deltaY = p2.getY() - p1.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Métodos getters e setters

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
        this.dimensao = calculaDimensao();
    }

    public Ponto2D getP2() {
        return p2;
    }

    public void setP2(Ponto2D p2) {
        this.p2 = p2;
        this.dimensao = calculaDimensao();
    }

    public double getDimensao() {
        return dimensao;
    }
}
