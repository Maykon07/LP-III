public class Ponto2D {
    private float x;
    private float y;
    
    // Construtor da classe
    public Ponto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    // Método para definir a abscissa (x) do ponto
    public void setX(float x) {
        this.x = x;
    }
    
    // Método para obter a abscissa (x) do ponto
    public float getX() {
        return x;
    }
    
    // Método para definir a ordenada (y) do ponto
    public void setY(float y) {
        this.y = y;
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
    public float distancia(Ponto2D ponto) {
        float dx = x - ponto.getX();
        float dy = y - ponto.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}