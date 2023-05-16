package Lista_6;

public class Teste_Circulo {
    public static void main(String[] args) {
         // Criando círculo com centro em (2, 3) e raio 5
    Circulo c1 = new Circulo(2, 3, 5);
    c1.imprimirCirculo(); // Saída: Círculo com centro em (2.0, 3.0) e raio 5.0

    // Criando círculo na origem de coordenadas com raio 1
    Circulo c2 = new Circulo();
    c2.imprimirCirculo(); // Saída: Círculo com centro em (0.0, 0.0) e raio 1.0

    // Criando círculo com centro em (4, 2) e raio 1
    Circulo c3 = new Circulo(4, 2);
    c3.imprimirCirculo(); // Saída: Círculo com centro em (4.0, 2.0) e raio 1.0

    // Criando círculo na origem de coordenadas com raio 3
    Circulo c4 = new Circulo(3);
    c4.imprimirCirculo(); // Saída: Círculo com centro em (0.0, 0.0) e raio 3.0

    // Testando se um ponto está dentro de um círculo
    Ponto2D p = new Ponto2D(3, 4);
    if(c1.isInnerPoint(p)) {
        System.out.println("O ponto está dentro do círculo");
    } else {
        System.out.println("O ponto está fora do círculo");
    }

    // Comparando dois círculos pelo tamanho da área
    if(c1.isBiggerThan(c2)) {
        System.out.println("O primeiro círculo é maior que o segundo");
    } else {
        System.out.println("O segundo círculo é maior que o primeiro");
    }
    }
}
