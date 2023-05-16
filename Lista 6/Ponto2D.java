package Lista_6;

public class Ponto2D {
    private float x;
    private float y;
    
    // Construtor da classe que recebe os valores de x e y
    public Ponto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    // Construtor da classe que cria um ponto na origem (0,0)
    public Ponto2D() {
        this(0,0);
    }
    
    // Método para obter a abscissa (x) do ponto
    public float getX() {
        return x;
    }
    
    // Método para obter a ordenada (y) do ponto
    public float getY() {
        return y;
    }
    
    // Método para imprimir as coordenadas do ponto
    public void imprimirPonto() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
    // Método para verificar se o ponto está sobre o eixo x
    public boolean isEixoX() {
        return y == 0;
    }
    
    // Método para verificar se o ponto está sobre o eixo y
    public boolean isEixoY() {
        return x == 0;
    }
    
    // Método para verificar se o ponto está sobre ambos os eixos
    public boolean isEixos() {
        return x == 0 && y == 0;
    }
    
    // Método para calcular o quadrante do ponto
    public int quadrante() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    
    // Método para calcular a distância euclidiana entre dois pontos
    public float distance(Ponto2D outroPonto) {
        float dx = x - outroPonto.getX();
        float dy = y - outroPonto.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
    
    // Método para calcular a distância em relação à origem de coordenadas
    public float distance() {
        return distance(new Ponto2D());
    }
    
    // Método para calcular a distância em relação a um ponto com coordenadas x e y
    public float distance(float x, float y) {
        return distance(new Ponto2D(x, y));
    }
}
