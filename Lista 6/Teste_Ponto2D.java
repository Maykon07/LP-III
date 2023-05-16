package Lista_6;

public class Teste_Ponto2D {
    public static void main(String[] args) {
        
        // Instanciando um ponto usando o construtor com dois parâmetros
        Ponto2D pontoA = new Ponto2D(3, 4);
        
        // Instanciando um ponto usando o construtor sem parâmetros
        Ponto2D pontoB = new Ponto2D();
        
        // Imprimindo as coordenadas dos pontos
        System.out.println("Coordenadas do ponto A: ");
        pontoA.imprimirPonto();
        System.out.println("Coordenadas do ponto B: ");
        pontoB.imprimirPonto();
        
        // Calculando a distância entre pontoA e pontoB
        float distanciaAB = pontoA.distance(pontoB);
        System.out.println("Distância entre pontoA e pontoB: " + distanciaAB);
        
        // Calculando a distância do pontoA em relação à origem
        float distanciaAOrigem = pontoA.distance();
        System.out.println("Distância do pontoA em relação à origem: " + distanciaAOrigem);
        
        // Calculando a distância do pontoA em relação ao ponto (1, 1)
        float distanciaAOutroPonto = pontoA.distance(1, 1);
        System.out.println("Distância do pontoA em relação ao ponto (1, 1): " + distanciaAOutroPonto);
        
    }
}
