package Lista_5;

public class Teste_Ponto2D {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(1, 2);
        Ponto2D ponto2 = new Ponto2D(-3, 4);
        Ponto2D ponto3 = new Ponto2D(2, -3);
        
        ponto1.imprimirPonto();
        ponto2.imprimirPonto();
        ponto3.imprimirPonto();
        
        System.out.println("O ponto 1 está no quadrante " + ponto1.quadrante());
        System.out.println("O ponto 2 está no quadrante " + ponto2.quadrante());
        System.out.println("O ponto 3 está no quadrante " + ponto3.quadrante());
        
        System.out.println("A distância entre o ponto 1 e o ponto 2 é " + ponto1.distancia(ponto2));
        System.out.println("A distância entre o ponto 1 e o ponto 3 é " + ponto1.distancia(ponto3));
    }
}
