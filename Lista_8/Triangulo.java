package Lista_8;

public class Triangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    private Ponto2D ponto3;
    
    public Triangulo(Ponto2D ponto1, Ponto2D ponto2, Ponto2D ponto3) {
        if (verificarAlinhamento(ponto1, ponto2, ponto3)) {
            throw new IllegalArgumentException("Os pontos estão alinhados. Não é possível formar um triângulo.");
        }
        
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
        this.ponto3 = ponto3;
    }
    
    public void imprimeTriangulo() {
        System.out.println("Pontos do triângulo:");
        System.out.print("Ponto 1: ");
        ponto1.imprimirPonto();
        System.out.print("Ponto 2: ");
        ponto2.imprimirPonto();
        System.out.print("Ponto 3: ");
        ponto3.imprimirPonto();
    }
    
    public boolean isTrianguloRetangulo() {
        double lado1 = ponto1.distance(ponto2);
        double lado2 = ponto2.distance(ponto3);
        double lado3 = ponto3.distance(ponto1);
        
        double maiorLado = Math.max(Math.max(lado1, lado2), lado3);
        
        if (maiorLado == lado1) {
            return Math.pow(lado1, 2) == Math.pow(lado2, 2) + Math.pow(lado3, 2);
        } else if (maiorLado == lado2) {
            return Math.pow(lado2, 2) == Math.pow(lado1, 2) + Math.pow(lado3, 2);
        } else {
            return Math.pow(lado3, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2);
        }
    }
    
    public boolean isTrianguloIsosceles() {
        double lado1 = ponto1.distance(ponto2);
        double lado2 = ponto2.distance(ponto3);
        double lado3 = ponto3.distance(ponto1);
        
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }
    
    public boolean isTrianguloEquilatero() {
        double lado1 = ponto1.distance(ponto2);
        double lado2 = ponto2.distance(ponto3);
        double lado3 = ponto3.distance(ponto1);
        
        return lado1 == lado2 && lado1 == lado3;
    }
    
    private boolean verificarAlinhamento(Ponto2D ponto1, Ponto2D ponto2, Ponto2D ponto3) {
        float x1 = ponto1.getX();
        float y1 = ponto1.getY();
        float x2 = ponto2.getX();
        float y2 = ponto2.getY();
        float x3 = ponto3.getX();
        float y3 = ponto3.getY();
        
        float resultado = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        
        return resultado == 0;
    }
}
