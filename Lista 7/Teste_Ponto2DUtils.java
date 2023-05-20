package Lista_7;

public class Teste_Ponto2DUtils {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(3, 4);
        Ponto2D ponto2 = new Ponto2D(-2, 1);
        
        float distancia = Ponto2DUtils.distance(ponto1, ponto2);
        System.out.println("Distância entre os pontos: " + distancia);  // Saída: 5.0
        
        System.out.println("Quadrante do ponto 1: " + Ponto2DUtils.quadrant(ponto1));  // Saída: 1
        System.out.println("Quadrante do ponto 2: " + Ponto2DUtils.quadrant(ponto2));  // Saída: 2
        float distanciaOrigem = Ponto2DUtils.distance(ponto2);
        System.out.println("Distância do ponto 2 à origem: " + distanciaOrigem);  // Saída: 2.2360679
    }
}
