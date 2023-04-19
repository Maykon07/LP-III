package Lista_3.Ponto2D;

public class Ponto2D {
    /*
    Dados:
            Coordenada x
            Coordenada y

    Operações:
            getX(): Retorna a coordenada x do ponto.
            getY(): Retorna a coordenada y do ponto.
            setX(double x): Define a coordenada x do ponto.
            setY(double y): Define a coordenada y do ponto.

     */
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
