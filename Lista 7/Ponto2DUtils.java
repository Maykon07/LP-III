package Lista_7;

public class Ponto2DUtils {
    // Método estático para calcular a distância entre dois pontos
    public static float distance(Ponto2D ponto1, Ponto2D ponto2) {
        float dx = ponto1.getX() - ponto2.getX();
        float dy = ponto1.getY() - ponto2.getY();
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
    
    // Método estático para calcular a distância entre um ponto e a origem de coordenadas
    public static float distance(Ponto2D ponto) {
        return distance(ponto, new Ponto2D());
    }
    
    // Método estático para calcular o quadrante de um ponto
    public static int quadrant(Ponto2D ponto) {
        float x = ponto.getX();
        float y = ponto.getY();
        
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
}
