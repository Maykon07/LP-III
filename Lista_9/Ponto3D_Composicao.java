public class Ponto3D_Composicao {
    private Ponto2D ponto2D;
    private double z;

    public Ponto3D_Composicao(double x, double y, double z) {
        this.ponto2D = new Ponto2D(x, y);
        this.z = z;
    }

    public String toString() {
        return ponto2D.toString() + ", " + z;
    }

    public boolean inAxisX() {
        return ponto2D.inAxisX();
    }

    public boolean inAxisY() {
        return ponto2D.inAxisY();
    }

    public boolean inAxis() {
        return ponto2D.inAxis();
    }

    public boolean isOrigin() {
        return ponto2D.isOrigin() && z == 0;
    }

    public double distance(double x, double y, double z) {
        return Math.sqrt(
                ponto2D.distance(x, y) * ponto2D.distance(x, y) + (this.z - z) * (this.z - z)
        );
    }

    public double distance(Ponto3D_Composicao ponto) {
        return Math.sqrt(
                ponto2D.distance(ponto.ponto2D) * ponto2D.distance(ponto.ponto2D) + (this.z - ponto.z) * (this.z - ponto.z)
        );
    }
}
