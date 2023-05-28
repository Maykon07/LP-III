package Lista_8;

public class Teste_Triangulo {
    public static void main(String[] args) {
        // Criando os pontos
        Ponto2D ponto1 = new Ponto2D(0, 0);
        Ponto2D ponto2 = new Ponto2D(3, 0);
        Ponto2D ponto3 = new Ponto2D(0, 4);
        
        // Criando o triângulo
        Triangulo triangulo = new Triangulo(ponto1, ponto2, ponto3);
        
        // Imprimindo o triângulo
        triangulo.imprimeTriangulo();
        
        // Verificando se é um triângulo retângulo
        boolean isRetangulo = triangulo.isTrianguloRetangulo();
        System.out.println("É um triângulo retângulo? " + isRetangulo);
        
        // Verificando se é um triângulo isósceles
        boolean isIsosceles = triangulo.isTrianguloIsosceles();
        System.out.println("É um triângulo isósceles? " + isIsosceles);
        
        // Verificando se é um triângulo equilátero
        boolean isEquilatero = triangulo.isTrianguloEquilatero();
        System.out.println("É um triângulo equilátero? " + isEquilatero);
    }
}
