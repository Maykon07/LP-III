package Lista_5;

public class Circulo {
    private float x;
    private float y;
    private float r;
    
    public Circulo(float x, float y, float r) {
        this.x = x;
        this.y = y;
        if(validaCirculo(r)) {
            this.r = r;
        } else {
            System.out.println("Raio inválido. O raio deve ser maior que zero.");
        }
    }
    
    public boolean validaCirculo(float r) {
        return r > 0;
    }
    
    public void setX(float x) {
        this.x = x;
    }
    
    public void setY(float y) {
        this.y = y;
    }
    
    public void setR(float r) {
        if(validaCirculo(r)) {
            this.r = r;
        } else {
            System.out.println("Raio inválido. O raio deve ser maior que zero.");
        }
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
    public float getR() {
        return r;
    }
    
    public void imprimirCirculo() {
        System.out.println("Círculo com centro em (" + x + ", " + y + ") e raio " + r);
    }
    
    public boolean isInnerPoint(Ponto2D ponto) {
        float distancia = ponto.distancia(new Ponto2D(x, y));
        return distancia < r;
    }
    
    public float area() {
        return (float) (Math.PI * r * r);
    }
    
    public float perimeter() {
        return (float) (2 * Math.PI * r);
    }
    
    public boolean isBiggerThan(Circulo circulo) {
        return this.area() > circulo.area();
    }
}
