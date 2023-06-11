

public class Ponto3D_Heranca extends Ponto2D {
    private double z;

    public Ponto3D_Heranca(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    public boolean inAxisZ() {
        return z == 0;
    }

    public boolean isOrigin() {
        return super.isOrigin();
    }
}
